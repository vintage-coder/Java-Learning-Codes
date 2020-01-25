import java.util.Scanner;



class Arithematic
{
	public static void main(String []args)
	{
		float num1,num2;

		Scanner input =new Scanner(System.in);

		System.out.print("Enter Two Number to perform arithematic operation:");

		num1=input.nextFloat();
		num2=input.nextFloat();

		System.out.println("Addition of "+ num1 +"and "+num2 +"is :"+ (num1+num2));

		System.out.println("Subtraction of "+ num1 +"and "+num2 +"is :"+ (num1-num2));

		System.out.println("Multiplication of "+ num1 +"and "+num2 +"is :"+ (num1*num2));

		System.out.println("Division of "+ num1 +"and "+num2 +"is :"+ (num1/num2));
	}
}

