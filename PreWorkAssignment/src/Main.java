import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	
	//CHECK PALINDROME NUMBER
	public void palindromeNumber() {
		int num, temp;
		int reverse=0;
		System.out.println("Enter a number");
		num = sc.nextInt();
		
		temp = num;
		while(num!=0) {
			int remainder = num % 10;
			reverse = (reverse * 10) + remainder; 
			num = num/10;
		}
		if(temp == reverse) 
			System.out.println(temp+" is palindrom");
		else
			System.out.println(temp+" is not palindrom");
	}	
	
	// PRINTING PATTERN
	public void printPattern() {
		System.out.println("Enter the number for level of pattern:");
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			for(int j=num; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	// CHECK PRIME NUMBER
	public void primeNumber() {
		int num;
		int flag=1;
		System.out.println("Enter the Number:");
		num = sc.nextInt();
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				flag = 0;
				break;
			}
		}
		if(flag == 1)
			System.out.println(num+" is Prime Number");
		else
			System.out.println(num+" is not Prime Number");
	}
	
	// FIBONACCI SERIES
	public void fibonacciSeries() {
		int count, num1 = 0, num2 = 1, num3;
		System.out.println("Enter Range:");
		count= sc.nextInt();
		
		System.out.print("Fibonacci Series: "+num1 +","+ num2);
		while(count!=0) {
			num3 = num1 + num2;
			System.out.print(","+num3);
			num1 = num2;
			num2 = num3;
			count--;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Main obj = new Main();
		Scanner sc = new Scanner(System.in);
		int ch;
		do {
			System.out.println();
			System.out.println("Enter your choice from below list:\n1. Find Palindrome Number\n2. Print pattern for given number\n3. "
					+ "Check whether the number is prime or not\n4. Print Fibonacci Series\n0. Enter 0 to Exit");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1 :
				obj.palindromeNumber();
				break;
				
			case 2 :
				obj.printPattern();
				break;
				
			case 3 :
				obj.primeNumber();
				break;
				
			case 4 :
				obj.fibonacciSeries();
				break;
				
			case 0 :
				System.out.println("Exited Successfully");
				break;
				
			default :
				System.out.println("Please choose correct option!!!");
			}
		}while(ch!=0);
	}
}
