import java.util.Scanner;
public class Grade{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your score:");
	int score = input.nextInt();
	
if	(score >=90)
{	System.out.println("Your grade is 'A'");
	if (score>95)
{	System.out.println("Excellent peroformance ");
} 
}
else if (score >= 80 && score <=89)
{	System.out.println(" Your grade is 'B'");
	
}
else if (score >= 70 && score <= 79 )
{	System.out.println("Your grade is 'C'");
} 
else if (score >= 60 && score <= 69 )
{	System.out.println("Your grade is 'D'");
} 
else if (score<60 && score>=0)
{	System.out.println("Your grade is 'F'");
} 
else {System.out.print("Invalid score");}

	}
}