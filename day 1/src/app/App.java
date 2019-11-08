package app;

import java.io.File;
import java.util.Scanner;

public class App {
    static int finalNumber;

    public static void main(String[] args) throws Exception {
        File file = new File("cisla.txt"); 
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            int number = input.nextInt();
            finalNumber = finalNumber + number;
            
        }
        System.out.println(finalNumber);
    }
}