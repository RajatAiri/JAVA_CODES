package college;
import java.util.Scanner;
public class ModifyNumber {

	public static int modifyNumber(String input)
	{
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<input.length()-1;i++)
		{
			char c1 = input.charAt(i);
			char c2 = input.charAt(i+1);
			sb.append(Math.abs(c1-c2));
		}
		sb.append(input.charAt(input.length()-1));
		return Integer.parseInt(sb.toString());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number:");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		System.out.println(modifyNumber(input));
	}

}
