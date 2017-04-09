package college;

import java.util.Scanner;

public class ValidateCode {
	
	Scanner sc;

    public ValidateCode() {
        sc = new Scanner(System.in);
    }

    public void GetUserCode(Boolean firstRun) {

        if(!firstRun) {
            System.out.println("The Secret Code you have entered was incorrect.");
        } else {
            System.out.println("Please enter a valid Secret code:");
        }

        String userInput = sc.next();

        UserCodeCheck usercodeCheck = new UserCodeCheck(userInput);

        if(usercodeCheck.isValid1()) {
            System.out.println("Welcome to CBI, MR. " + userInput + "!");
        } else {
            GetUserCode(false);
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ValidateCode va = new ValidateCode();
		// String myString = "qwerty123456";
		 //System.out.println(myString.matches("[A-Za-z0-9]+"));
	       va.GetUserCode(true);
		
	}

}
