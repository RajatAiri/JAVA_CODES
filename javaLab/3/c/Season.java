package college;
import java.util.Scanner;
public class Season {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c =0;
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number between 1 and 12 for month:");
		c = scan.nextInt();
		String season = "";
		switch (c){
			case 12:
			case 1:
			case 2:
				season = "winter";
			break;
			case 3:
			case 4:
			case 5:
				season = "summer";
				break;
			case 6:
			case 7:
			case 8:
				season = "spring";
				break;
			case 9:
			case 10:
			case 11:
				season = "autumn";
				break;
			default:
				System.out.println("INVALID INPUT");
		}
		if(!season.equals("")){
			System.out.println("Season is: " + season);
		}
	}

}
