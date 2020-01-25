import java.util.Scanner;



class Pattern4
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int num;


		System.out.print("Enter a Number:");

		num=input.nextInt();

		for(int i=num;i>0;i--)
		{
			for (int j=i;j>0 ;j-- )
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}

	}
}