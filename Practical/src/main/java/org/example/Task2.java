package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        //Написать программу, которая считывает список JSON-объектов из файла и выводит на экран значения их полей.
        //для этого можно использовать ObjectMapper и JsonNode.
        ObjectMapper mapper = new ObjectMapper();
        File jsonFile = new File("Practical/src/main/resources/forTask2.json");
        try {
            JsonNode rootNode = mapper.readTree(jsonFile);

            for (JsonNode rn: rootNode) {
                var name = rn.path("name").asText();
                var age = rn.path("age").asInt();
                var city = rn.path("city").asInt();

                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("City: " + city);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
