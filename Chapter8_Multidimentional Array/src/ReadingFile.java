import java.util.*;
import java.io.*;
public class ReadingFile {
                public static void main(String[] args) throws FileNotFoundException {
                                Scanner scnr = new Scanner(new File("Text3.txt"));
                                PrintWriter outFile = new PrintWriter("Result.txt");
                                while (scnr.hasNextLine()) {
                                                String line1 = scnr.next();
                                                int num1 = scnr.nextInt();
                                                double num2 = scnr.nextDouble();
                                                outFile.println(line1 + " " + num1 + " " + num2);
                                }
                                outFile.close();
                                scnr.close();
                }}