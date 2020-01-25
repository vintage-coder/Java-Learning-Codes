import java.util.Scanner;


class Input
{
	public static void main(String args[])
	{
		int value;

		System.out.print("Enter a value to read a Number:");

		Scanner input=new Scanner(System.in);

		value =input.nextInt();

		System.out.println("You Entered :"+value);
		
	}
}