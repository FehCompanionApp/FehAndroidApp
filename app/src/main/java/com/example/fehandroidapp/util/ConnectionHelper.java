package com.example.fehandroidapp.util;

import android.os.Build;

import androidx.annotation.RequiresApi;

import com.example.fehandroidapp.BuildConfig;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

public class ConnectionHelper {

    @RequiresApi(api = Build.VERSION_CODES.O)
    public static String getConnection(String http, Map<String, String> requests) throws Exception {
        final String username = BuildConfig.USERNAME;
        final String password = BuildConfig.PASSWORD;
        StringBuilder query = new StringBuilder("?");
        List<String> queries = new ArrayList<>();
        for (Map.Entry<String,String> entry : requests.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            queries.add(String.format("%s=%s", key, URLEncoder.encode(value, "UTF-8")));
        }
        query.append(StringUtils.join(queries, "&"));

        URL url = new URL(http + query.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        String encoded = Base64.getEncoder().encodeToString((username+":"+password).getBytes(StandardCharsets.UTF_8));  //Java 8
        conn.setRequestProperty("Authorization", "Basic "+encoded);
        return getJson(conn);
    }

    public static String getJson(HttpURLConnection conn) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line).append("\n");
            }
            br.close();
            return sb.toString();
        } catch (Exception e) {
            System.out.println(e.toString());
            return null;
        }
    }
}
