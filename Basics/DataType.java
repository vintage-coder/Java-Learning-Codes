import java.util.Scanner;




class DataType
{
	public static void main(String[] args)
	{
		double Number1;
		int Number2;
		float Number3;
		String String1;


		Scanner  input =new Scanner(System.in);

		System.out.print("Enter the double Number: ");
		Number1=input.nextDouble();
		System.out.println("The Double is: "+Number1);

		System.out.print("Enter the Integer Number: ");
		Number2=input.nextInt();
		System.out.println("The Integer is :"+Number2);


		System.out.print("Enter the Float Number: ");
		Number3=input.nextFloat();
		System.out.println("The Float is :"+Number3);

		System.out.print("Enter the String: ");
		String1=input.next();
		System.out.println("The String is:"+String1);





		System.out.println("Finished....");


	}
}