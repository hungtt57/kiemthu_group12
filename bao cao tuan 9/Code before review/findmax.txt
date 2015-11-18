package tessttttt;

import java.util.Scanner;

public class VarargsDemo {
	   public static void main(String args[]) {
	      // Call method with variable args  
		   Scanner input = new Scanner(System.in);
		   double[] numbers = new double[5];

		    
		    
		    
		    
		    	for (int i = 0; i < numbers.length; i++)
			    {
			        System.out.println("numbers["+i+"]"+"=");
			        numbers[i] = input.nextDouble();
			    }
			
		  printMax(numbers);
	   }

	   public static void printMax( double... numbers) {
	   if (numbers.length == 0) {
	      System.out.println("No argument passed");
	      return;
	   }

	   double result = numbers[0];

	   for (int i = 1; i <  numbers.length; i++)
	      if (numbers[i] >  result)
	      result = numbers[i];
	      System.out.println("The max value is " + result);
	   }
	}