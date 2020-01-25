

class Temp
{
	public static void main(String[] args)
	{
		System.out.println("Before Swapping ................");

		float num1=4.6f;
		float num2=8.1f;

		System.out.print("num1 and num2 is:"+ num1 + " and "+ num2);


		System.out.println("After Swapping ................");

		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;


		System.out.print("num1 and num2 is:"+ num1 + " and "+ num2);
	}
}