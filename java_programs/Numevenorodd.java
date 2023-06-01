package java_programs;

import java.util.Scanner;

public class Numevenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter the value of a");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
         if (a%2==0)
        {
            System.out.print("Number is even");
        }
        else {
            System.out.print("Number is odd");
        }


	}

}
