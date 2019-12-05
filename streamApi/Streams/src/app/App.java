package app;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

public class App {
    static int finalNumber;

    public static void main(String[] args) throws Exception {
        File file = new File("cisla.txt");
        Scanner input = new Scanner(file);
        List<Integer> list = new ArrayList<>();

        while (input.hasNext()) {
            int number = input.nextInt();
            list.add(number);
        }
        System.out.println(list.stream().mapToInt(i -> i).sum());

    }
}