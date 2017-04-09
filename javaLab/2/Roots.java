package college;
import java.util.*;
public class Roots {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of a,b and c to find the roots of a quadratic equation");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = (b*b) - (4*a*c);
		if (d>0)
		{
			System.out.println("Roots are real and unequal\nroots are:");
			System.out.println((-b+Math.sqrt(d))/(2*a) + " " + (-b-Math.sqrt(d))/(2*a));
		}
		else if (d<0)
		{
			System.out.println("no real roots present\n");
		}
		else if (d == 0)
		{
			System.out.println("Both roots are real and equal .\nroots are:\n");
			System.out.println(-b/2*a);
		}

	}

}
