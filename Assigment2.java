package demo.Assigments;

public class Assigment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int[] num = {10, 20, 30, 40, 50};
		
		 int sum = 0;

		 
		 for (int i = 0; i < num.length; i++) {
		     sum = sum + num[i];
		 }

		
		 int average = sum / num.length;
		 
		
		 int largest = num[0];
		 int smallest = num[0];

		 
		 for (int i = 1; i < num.length; i++) {

			    if (num[i] > largest) {
			        largest = num[i];
			    }

			    if (num[i] < smallest) {
			        smallest = num[i];
			    }
			}  

				
				System.out.print("Array elements: ");
				for (int i = 0; i < num.length; i++) {
				    System.out.print(num[i] + " ");
				}

				System.out.println();
				System.out.println("Sum of array elements: " + sum);
				System.out.println("Average of array elements: " + average);
				System.out.println("Largest element: " + largest);
				System.out.println("Smallest element: " + smallest);
		         
		         
		         
		     }
		 }
		 
		 
		 
		 
		 
		 



