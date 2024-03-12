package org.example;
import com.github.lalyos.jfiglet.FigletFont;
import java.io.File;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        String asciiArt1 = FigletFont.convertOneLine("hello world");
        System.out.println(asciiArt1);
    }
}
