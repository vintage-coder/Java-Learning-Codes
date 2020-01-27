
// Importing the Scanner Library to scan the input from the user
import java.util.Scanner;



// Object is the instance of the class .

//This is the Class Definition
class Teacher
{

// these are the data members or fields of the Teacher class
	int id ;
	String Name;

// This is the main method of the Teacher Class
	public static void main(String[] args)
	{
		// this is the Statement to create the instance of Teacher Class
		Teacher obj=new Teacher();

		Scanner input =new Scanner(System.in);

		
		// This is the statement used to view the class object.
		System.out.println("The class object is :"+obj);

	

		System.out.print("Enter the name of Teacher:");

		obj.Name=input.next();

		System.out.println();

		System.out.print("Enter the id of Teacher: ");

		obj.id=input.nextInt();

		System.out.println();


		// The Results of output is

		System.out.println("The Name of the Teacher is :"+obj.Name);

		System.out.println("The Id of the Teacher is: "+obj.id);





	}
}



