package day23_Arrays;

import java.util.Scanner;

public class WarmUp1_DevideTwo_WithoutUsingOperator {
	
	public static void main(String[] args) {
		
		
		/*
	     1. Write a program that can divide two numbers without 
	     using division operator
	     */

	        int a = 15;
	        int b = 6;
	        System.out.println( a/b ); // 2
	        
	        /*
	         10 - 3 = 7
	         7 - 3 = 4
	         4 - 3 =1
	         */
	        
	        /*
	         15 - 6 = 9
	         9 - 6 = 3
	         */
	        
	        int x = 20; 
	        int y = 6;
	        int count = 0; 
	        while(x>=y) {
	            x -= y;
	            count++;
	        }
	        
	        System.out.println( count );  // result after diving the two numbers  // 3
	        System.out.println( 20 /6 );  // 3
	        System.out.println(  x );   // remainder //2
	        
	        
	        Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Enter two numbers");
	        int num1 = scan.nextInt();
	        int num2 = scan.nextInt();
	        int result =0;
	        
	        int A, B;  // A/B
	        if(num1 > num2) {
	            A =num1;
	            B = num2;
	        }
	        if(num2 > num1) {
	            A =num2;
	            B =num1;
	        }
	        
	        
	        if(num2!=0 && (num2>=0||num1>=0)) {
	                //10       3    
	            while(num1 >= num2) {
	                num1 -= num2;
	                result++;
	            }
	            
	        System.out.println("devision is "+result+" with a remainder of "+num1);
	            
	        }else {
	            System.out.println("Invalid Entry");
	        }
	
	        
	    // NOTE: Try to find bug when given negative number, how can we fix it?
		
	}

}