package org.example;
import Objects.forTask5.Person;
import Objects.forTask5.PhoneNumber;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;

public class Task5 {
    public static void main(String[] args) {
        //Написать программу, которая десериализует JSON-строку в сложный Java-объект
        // с вложенными объектами и массивами и выводит его поля на экран.
        // Для этого можно использовать ObjectMapper и классы, соответствующие структуре JSON-объекта.
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Person person = objectMapper.readValue(new File("Practical/src/main/resources/forTask5.json"),
                    new TypeReference<>() {});
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Address: " + person.getAddress().getCity() +
                    "-" + person.getAddress().getStreet() +
                    "-" + person.getAddress().getZip());
            for (PhoneNumber phoneNumbers : person.getPhoneNumbers()) {
                System.out.println("Phone: " + phoneNumbers.getType() + " " + phoneNumbers.getNumber());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
