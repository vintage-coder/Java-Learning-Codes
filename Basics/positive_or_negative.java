import java.util.Scanner;




class Positive
{
	public static void main(String[] args)
	{
		double number;

		Scanner input=new Scanner(System.in);

		System.out.print("Enter a Number to check wheather the given number is Positive or Negative:");

		number=input.nextDouble();

		if(number<0.0)
		{
			System.out.println("The Given Number "+number+" is Negative");

		}
		else if (number>0.0) {
	
			System.out.println("The Given Number "+number+" is Positive");

		}
		else
		{
				System.out.println("The Entered Number obviously Zero "+number);
		}



	}
}