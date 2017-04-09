package college;

import java.util.Scanner;

public class valid {

    Scanner sc;

    public valid() {
        sc = new Scanner(System.in);
    }

    public void GetUsername(Boolean firstRun) {

        if(!firstRun) {
            System.out.println("The username you have entered was in an incorrect format. Must match abcdefgh_job");
        } else {
            System.out.println("Please enter a username:");
        }

        String userInput = sc.next();

        UsernameCheck usernameCheck = new UsernameCheck(userInput);

        if(usernameCheck.isValid()) {
            System.out.println("Welcome, " + userInput + "!");
        } else {
            GetUsername(false);
        }
    }

    
    public static void main(String[] args) {
        valid va = new valid();

        va.GetUsername(true);
    }

  
}

