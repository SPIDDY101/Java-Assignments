package demo.Assigments;

import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class Assigment3 {

	    public static void main(String[] args) {

	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	        try {
	            System.out.print("Enter your name: ");
	            String name = br.readLine();

	            System.out.print("Enter your age: ");
	            int age = Integer.parseInt(br.readLine());

	            System.out.println("Hello, " + name + "! You are " + age + " years old.");

	        } catch (IOException e) {
	            System.out.println("Error reading input.");
	        } catch (NumberFormatException e) {
	            System.out.println("Please enter a valid age.");
	        }
	    }
	}
