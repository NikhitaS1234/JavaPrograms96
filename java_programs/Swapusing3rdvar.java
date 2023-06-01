package java_programs;

import java.util.Scanner;

public class Swapusing3rdvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.out.println("Enter the value of a and b");
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c;
             System.out.print("Before swapping: " +a+ "\t" +b);
                                c=a;
                                a=b;
                                 b=c;
               System.out.print("\nAfter swapping: " +a+ "\t" +b);


	}

}
