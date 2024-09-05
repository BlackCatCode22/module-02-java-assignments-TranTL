// Tl 09/50

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {

        System.out.println("Hello and welcome");
    }
        try {
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        writer.write("this is a line of text");
        writer.write("2nd line of text");
        writer.write("3rd line of text");

        writer.close();
    } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
}