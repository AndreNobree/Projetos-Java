package org.example;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class Main {
    private static final String API_KEY = "SUA_KEY";
    private static final String API_URL = "http://api.openweathermap.org/data/2.5/weather?q=Fortaleza&appid=1b06da5553773ccaab34a9ae6de794fe&units=metric";

    public static void main(String[] args) throws IOException {
        String weather = getWeather();
        System.out.println(weather);
    }

    static String getWeather() throws IOException {
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url(API_URL)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}
