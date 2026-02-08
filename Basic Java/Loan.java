import java.util.Scanner;
public class Loan{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your aunnal income:$");
	int income = input.nextInt();
	 System.out.print("Enter your credit Score:");
	int score = input.nextInt();

	if	(score>700 && income > 50000)
	{	System.out.println("Your approvel is accepted. ");
		System.out.println("        OR   ");
		if	(score>750 && income>50000)
		{System.out.println("You get a special offer. ");}
		else{}
	}


	else if	(score>600 && score<700 && income > 40000)
	{	System.out.println("Your approvel is accepted with co-signer. ");
	}


	else if	(score<600 && income <40000)
	{	System.out.println("Your approvel is reject. ");
	}
	else{}
	}
}