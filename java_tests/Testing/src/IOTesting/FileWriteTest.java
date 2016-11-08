package IOTesting;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteTest {

    public static void main(String[] args) throws IOException{
        final String fileName = "write.txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        
        bw.write("abc");
        bw.newLine();
        
        bw.close();
    }
}
