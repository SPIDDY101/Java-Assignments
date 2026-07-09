package demo.Assigments;

import java.io.*;
import java.util.Scanner;

public class Assigment1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            // Take user input
            System.out.print("Enter your complete name: ");
            String name = sc.nextLine();

            System.out.print("Enter the file name: ");
            String fileName = sc.nextLine();

            FileWriter fw = new FileWriter(fileName, true);
            fw.write(name + System.lineSeparator());
            fw.close();

            System.out.println("\nName appended successfully!\n");

            BufferedReader br = new BufferedReader(new FileReader(fileName));

            String line;
            System.out.println("File Content:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        } catch (IOException e) {
            System.out.println("Error while reading/writing the file.");
        } catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        }

        sc.close();
    }
}