package Step4;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour
{
    /**
     * Yes, you can look at the other 
     * examples in this lab to build your solution here.
     */
        public static void main(String[] args)
        {
            // Print out a running total of all the
            // values in the input file.
            try {
                Scanner fileIn = new Scanner(new File("/Users/jarek/Projects/FileIOJava/Step4/input.txt"));
                int sum = 0;
                while (fileIn.hasNext())
                {
                    String lineIn = fileIn.nextLine();
                    System.out.println(lineIn);
                       sum = sum + Integer.parseInt(lineIn);
                    }
                System.out.println(sum);
            }
            catch (IOException e) {
                System.out.println("File not found");
            }
        }
}
// Reads the entire line as a string
// Split the line into a String array
//     String[] input = lineIn.split(",");
//  int sum = 0;
//    for (int i = 0; i < input.length; i ++) {
//   System.out.println(sum);