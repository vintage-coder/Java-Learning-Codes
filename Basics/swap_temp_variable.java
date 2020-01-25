

class Temp
{
	public static void main(String []args)
	{
		float num1=1.2f;
		float num2=2.3f;

		float temp;

		System.out.print("Before Swapping .............");

		System.out.println(" num1 and num2 is:" + num1 + " and " +num2);

		temp=num1;

		num1=num2;
		num2=temp;

		System.out.println("After Swapping...............");

		System.out.println(" num1 and num2 is:" + num1 + " and "+ num2);


	}
}