import java.util.Scanner;
public class Ticket{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	System.out.print("Are you student Yes or  No :");
	String student = input.next().toLowerCase();
	System.out.print(" Please enter your age:");
	int age = input.nextInt();
	double price = 0 ;
	if	(age>=0 && age<=12)
	{	price = 5.00;
		if	(student.equals("yes") )
		{	price = price-2;	
		}	
		else{}
	}	
	else if	(age>=13 && age<=17)
	{	price = 8.00;
		if	(student.equals("yes") )
		{	price = price-2;	
		}	
		else{}	
	}
	else if	( age>=18 && age<=64)
	{	price = 12.00;	
		if	(student.equals("yes") )
		{	price = price-2;	
		}	
		else{}
	}	
	else if	(age>=65)
	{	price = 7.00;
		if	(student.equals("yes"))
		{	price = price-2;	
		}	
		else{}	
	}	
	
	else 	{System.out.println("Invalid age");}
		System.out.println("Price of the ticket is : $" +price);
	}
}	