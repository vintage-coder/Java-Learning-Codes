import java.util.Scanner;


class Pattern2
{
	public static void main(String [] args)
	{
		int num;

		System.out.print("Enter a Number:");

		Scanner input=new Scanner(System.in);

		num=input.nextInt();

		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				System.out.print(j + " ");
			}

			System.out.println(" ");
		}
	}
}