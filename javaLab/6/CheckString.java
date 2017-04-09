package college;

import java.util.Scanner;

public class CheckString {

	public static boolean checkPositive(String in)
	{
		String out;
		out = in;
		for(int i=1;i<out.length();i++)
		{
			if(out.charAt(i) - out.charAt(i-1) < 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a string:");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println("Checking input\t => \t" + checkPositive(input));
	}

}
