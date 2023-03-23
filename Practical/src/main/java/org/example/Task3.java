package org.example;

import Objects.PersonForTask3;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Task3 {
    public static void main(String[] args) {
        //Написать программу, которая сериализует Java-объект в JSON-строку и выводит ее на экран.
        // Для этого можно использовать ObjectMapper и метод writeValueAsString().
        ObjectMapper mapper = new ObjectMapper();
        try {
            String jsonString = mapper.writeValueAsString(new PersonForTask3("Anna", 22, "SPB"));

            System.out.println(jsonString);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

    }
}
