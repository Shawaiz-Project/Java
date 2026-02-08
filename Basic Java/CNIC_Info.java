import java.util.Scanner;
public class CNICInfo_231980079{

	public static boolean isValidCNIC(String cnic){
		boolean i = false;
		int sizeCnic = 13;
		int length = cnic.length();
		for (int s = 0; s<cnic.length(); s++) {
			if(length==sizeCnic){
			char ch = cnic.charAt(s);
				if(Character.isDigit(ch)){
				i = true; 
				}//if
				else{
				i = false;
				}//else
			}//if
			else{
				return i;
			}//else
		}//for
		return i;

	}//isValidCNIC
	
	public static void analyzeCNIC(String cnic, int issueYear){

		int provinceCode = Character.getNumericValue(cnic.charAt(0)); 
		String prove = determineProvince(provinceCode);

		int divisionCode = Character.getNumericValue(cnic.charAt(1)); 
		String division = determineDivision(divisionCode,provinceCode);

		int genderCode = Character.getNumericValue(cnic.charAt(12)); 
		String gender = determineGender(genderCode);

		int expire = calculateExpiryYear(issueYear);
		
		
		System.out.println("");
		System.out.println("********* THE CARDHOLDER DETAILS ***********");
		System.out.println("Province : "+prove);
		System.out.println("Division : "+division);
		System.out.println("Gender : "+gender);
		System.out.println("Expire Year : "+expire);

		


	}//analyzeCNIC
	
	public static String determineProvince(int provinceCode){
		
		if(provinceCode==1){
			return "Khyber Pakhtunkhwa";
		}//if
		else if (provinceCode==2){
			return "FATA";
		}//else if
		else if (provinceCode==3){
			return "Punjab";
		}//else if
		else if (provinceCode==4){
			return "Sindh";
		}//else if
		else if (provinceCode==5){
			return "Balochistan";
		}//else if
		else if (provinceCode==6){
			return "Islamabad Territory";
		}//else if
		else if (provinceCode==7){
			return "Gilgit-Baltistan";
		}//else if
		else {
			return "UNKNOWN IDENTITY";
		}//else

	}//determineProvince

	public static String determineDivision(int divisionCode,int provinceCode){
		if(divisionCode==4){
			if(provinceCode==3){
			return "Gujranwala";
			}//if
			else{
				return "NOT BELONG TO GUJRANWALA";
			}
		}//if
		else{
			return "NOT BELONG TO GUJRANWALA";
		}//else

	}//determineDivision

	public static String determineGender(int genderCode){
		if(genderCode%2==0){
			return "Female";
		}//if
		else{
			return "Male";
		}

	}//determineGender

	public static int calculateExpiryYear(int issueYear){
		int date = issueYear+10;
		return date;
	}//calculateExpiryYear

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your CNIC number (without dashes) : ");
		String cnic = input.nextLine();
		boolean valid = isValidCNIC(cnic);
		if(valid == false){
			System.out.println("Please enter a valid CNIC number.");
		}//if
		else {

			System.out.println("Enter the year card issue date (e.g. 2024): ");
			int issue_year = input.nextInt();
			analyzeCNIC(cnic,issue_year);
		
		}//else
		




	}//main
	
}//class