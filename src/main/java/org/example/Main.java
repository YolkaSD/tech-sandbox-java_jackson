package org.example;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        List<User> userList = mapper.readValue(new File("src/main/resources/userArray.json"), new TypeReference<>() {});

        double avg = userList.stream()
                .mapToDouble(User::getGrade)
                .average()
                .orElse(0);
        System.out.print(avg);
    }
}