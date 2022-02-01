package com.example.ServiceImpl;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.nio.file.Files;

public class ReadingFiles {
    public static void main(String args[]) throws IOException {
        String filePath = "C:\\Users\\Axv200051\\IdeaProjects\\Demo\\src\\main\\java\\com\\example\\ServiceImpl\\Read.txt";

        // READING FROM A FILE
        try(Stream<String> stream = Files.lines(Paths.get(filePath))){
//            stream.forEach(System.out::println);
            stream.forEach(line -> {
                System.out.println(line);
            });
        }

        //WRITING TO A FILE
        String input = "You got it";
        Files.write(Paths.get(filePath), input.getBytes());
    }
}
