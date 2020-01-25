
import java.util.Scanner;

public class HelloWorld
{
	public static void main(String args[])
	{
		System.out.println("Hello World, Welcome to java programming");

		int first_num,second_num,sum;

		Scanner input =new Scanner(System.in);


		System.out.println("Enter  Two Numbers to Perform Operation:");
		
		first_num=input.nextInt();
		second_num=input.nextInt();


		/* The Additon of two number's result is stored in sum variables  */

		sum=first_num+second_num;

		System.out.println("The Sum is "+sum);

	}
}