import java.util.Scanner;

class Student
{
	double maths;
	double science;
	double computer;

	double total;


	public void calculate()
	{
		total=maths+science+computer;

		System.out.println("The Length is: "+total);
	}
}



class Teacher
{
	public static void main(String[] args)
	{
		int no;

		System.out.print("Enter the no of Student record you want:");
		Scanner input=new Scanner(System.in);

		no=input.nextInt();

		System.out.println();

		Student obj[]=new Student[no];

		for(int i=0;i<no;i++)
		{
			obj[i]=new Student();

			System.out.println();
			 
			System.out.print("Enter the maths mark: ");
			obj[i].maths=input.nextDouble();
			System.out.println();

			System.out.print("Enter the science mark: ");
			obj[i].science=input.nextDouble();
			System.out.println();

			System.out.print("Enter the computer mark: ");
			obj[i].computer=input.nextDouble();
			System.out.println();

			obj[i].calculate();

		}



	}
}
