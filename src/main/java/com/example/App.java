package com.example;

import java.io.*;

public class App {

    public static void main(String[] args) {

        // Immutable String Demo
        String str1 = "Hello";
        String str2 = str1.concat(" World");

        System.out.println("Original String: " + str1);
        System.out.println("Modified String: " + str2);

        // Copy Source Text to Destination Text
        try {

            FileReader fr = new FileReader("source.txt");
            FileWriter fw = new FileWriter("destination.txt");

            int ch;

            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File copied successfully");

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

