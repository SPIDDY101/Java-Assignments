package demo.Assigments;

public class Assigment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int age = 20;
	        boolean ID = true;
	        
	        if (age >= 18) {
	            System.out.println("Person is eligible to vote.");
	        } else {
	            System.out.println("Person is not eligible to vote.");
	        }
	        
	        if (age >= 18) {

	           
	            if (ID == true) {
	                System.out.println("Person is eligible to vote and has a valid ID.");
	            } else {
	                System.out.println("Person is eligible to vote but does not have a valid ID.");
	            }

	        } else {
	            System.out.println("Person is not eligible to vote.");
	        }

	}

}
