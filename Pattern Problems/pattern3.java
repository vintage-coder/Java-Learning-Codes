import java.util.Scanner;


class Pattern3
{
	public static void main(String []args)
	{
		int num;

		Scanner input =new Scanner(System.in);


		System.out.print("Enter a Number:");

		num=input.nextInt();

		for(int i=0;i<num;i++)
		{
			for (int j=0;j<=i;j++) 
			{
				System.out.print(j +" ");
			}

			System.out.println(" ");
		}

	}
}