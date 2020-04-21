package Concurrency;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Threads {

    public static void main(String[] args){

        Runnable task = () ->{
            System.out.println("Thread 1 is running");
            try {
                Stream<String> file1Stream = Files.lines(Paths.get("file1.txt"));
                file1Stream.forEach(System.out::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
        };

        Thread thread1 = new Thread(task);
        thread1.start();
    }
}
