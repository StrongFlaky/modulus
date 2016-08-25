package modulusPractice;
import java.util.Scanner;
public class modulus {
	public static void exercise1() throws InterruptedException
	{
		System.out.println("Exercise 1");
		Thread.sleep(1000);
		System.out.println("Now put in a number");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		if(num%2==0)
		{
			System.out.println("This number is even");
		}
		else
		{
			System.out.println("This number is odd");
		}
	}
	public static void exercise2() throws InterruptedException
	{
		System.out.println("Exercise 2");
		Thread.sleep(1000);
		Scanner scan=new Scanner(System.in);
		System.out.println("Now input a year");
		int year=scan.nextInt();
		if((year%4==0&&year%100!=0)||year%400==0)
		{
			System.out.println("This is a leap year");
		}
		else
		{
			System.out.println("This is not a leap year");
		}
	}
	public static void exercise3() throws InterruptedException
	{
		System.out.println("Exercise 3");
		Thread.sleep(1000);
		int[] myArray={2,5,-7,1,3,12,19,-16,4,20};
		for(int i=0; i<myArray.length;i++)
		{
			if(i%3==2)
			{
				System.out.println(myArray[i]);
			}
		}
	}
	public static void exercise4() throws InterruptedException
	{
		System.out.println("Exercise 4");
		Thread.sleep(1000);
		for(int i=1; i<=100; i++)
		{
			if(i%15==0)
			{
				System.out.println("FizzBuzz");
			}
			else if(i%3==0)
			{
				System.out.println("Fizz");
			}
			else if(i%5==0)
			{
				System.out.println("Buzz");
			}
			else
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String args[]) throws InterruptedException
	{
		exercise1();
		exercise2();
		exercise3();
		exercise4();
	}
}
