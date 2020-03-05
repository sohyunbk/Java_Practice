import java.util.*;
import java.io.*;

public class HW_2DArray {
    public static void main(String[] args) throws FileNotFoundException {
        long start = System.currentTimeMillis();
    	Scanner scnr = new Scanner(new File("input.txt"));
        PrintWriter outFile = new PrintWriter("grades.txt");
        double[][]Array_input=new double[20][3];
        int i = 0;
        while (scnr.hasNextLine()) {
                        double num1 = scnr.nextDouble();
                        double num2 = scnr.nextDouble();
                        double num3 = scnr.nextDouble();
                        Array_input[i][0]=num1;
                        Array_input[i][1]=num2;
                        Array_input[i][2]=num3;  i++; }
    	
        double[][]FinalArray = new double[Array_input.length][(Array_input[0].length)+1];
        for (int row=0; row < Array_input.length;row++) {
        	double Sum = 0;
        	for (int column =0; column < Array_input[row].length;column++) {
        	FinalArray[row][column]=Array_input[row][column];
        	Sum +=Array_input[row][column];}
        	double Average = Sum/Array_input[0].length; 
        	FinalArray[row][(Array_input[row].length)]=Average;
        	}
        //System.out.print(Arrays.deepToString(FinalArray));
        //Write file
        for (int row=0; row < FinalArray.length;row++) {
        	for (int column =0; column < FinalArray[row].length;column++) {
        		outFile.print(FinalArray[row][column]+" "); 
        	}outFile.println();}
		
        outFile.close();
        scnr.close();
        long end = System.currentTimeMillis();
        System.out.println(end-start);
}}