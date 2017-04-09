package college;
import java.util.Scanner;
public class StringReplace {

		public static String AlterString(String input) {
		    char[] chars = input.toLowerCase().toCharArray();
		    for (int i = 0; i < chars.length; i++) {
		        char ch = chars[i];
		        if (ch == 'z')
		            chars[i] = 'b';
		        else if (ch >= 'b' && ch <= 'y' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u') {
		            ch = (char)(ch + 1);
		            if (ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
		                ch++;
		            chars[i] = ch;
		        }
		    }
		    return new String(chars);
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a string:");
	String replace = sc.next();
		System.out.print("Entered :  ");
		String output =AlterString(replace);
		System.out.println(output);
	}

}
