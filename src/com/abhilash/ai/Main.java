package com.abhilash.ai;

import com.abhilash.ai.client.GeminiClient;

public class Main {

    public static void main(String[] args) throws Exception {

        GeminiClient client = new GeminiClient();

        String response = client.ask("Explain Kafka in one paragraph.");

        System.out.println(response);
    }
}