package com.example.ServiceImpl;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.nio.file.Files;

public class ReadingFiles {
    public static void main(String args[]) throws IOException {
        String filePath = "C:\\Users\\Axv200051\\IdeaProjects\\Demo\\src\\main\\java\\com\\example\\ServiceImpl\\Read.txt";

        try(Stream<String> stream = Files.lines(Paths.get(filePath))){
            stream.forEach( x -> {
                System.out.println(x);
            });
        }
    }
}
