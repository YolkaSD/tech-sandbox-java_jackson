package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Task1 {
    public static void main(String[] args) {
        //Написать программу, которая считывает JSON-объект из файла и выводит на экран значения его полей.
        //Для этого можно использовать ObjectMapper и JsonNode.
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("Practical/src/main/resources/forTask1.json");

        try {
            JsonNode rootNode = objectMapper.readTree(file);
            var name = rootNode.path("name").asText();
            var age = rootNode.path("age").asInt();
            var city = rootNode.path("city").asText();

            System.out.println(name);
            System.out.println(age);
            System.out.println(city);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
