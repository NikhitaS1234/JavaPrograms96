package java_programs;

import java.util.Scanner;

public class Swapwithoutusingvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the value of a and b");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        System.out.print("Before swapping: " +a+ "\t" +b);
         a=a+b;//34-12=46
         b=a-b;//46-12=34
         a=a-b;//46-34=12
        System.out.print("\nAfter swapping: " +a+ "\t" +b);


	}

}
