package org.example;

import Objects.PersonForTask3;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Task4 {
    public static void main(String[] args) {
        //Написать программу, которая десериализует JSON-строку в Java-объект и выводит его поля на экран.
        //Для этого можно использовать ObjectMapper и метод readValue().
        ObjectMapper mapper = new ObjectMapper();
        String jsonString = "{ \"name\": \"John\", \"age\": 30, \"city\": \"New York\"}";
        try {
            PersonForTask3 person = mapper.readValue(jsonString, new TypeReference<>() {});
            System.out.println(person);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
