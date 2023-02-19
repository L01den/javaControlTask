package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

class WorkFile {
    public static void writeFile(String text){
        try(FileWriter fw = new FileWriter("A:\\java_lesson\\Exsephen\\homework\\taskJava\\src\\main\\java\\org\\example\\awords.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
