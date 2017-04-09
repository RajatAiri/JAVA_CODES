package college;

public class Credit1 {
	static double balance;
	double min;
	double unpaid;
	double interest;
	
	Credit1(){
		balance=5000;
	}
	
	double Payment(){
		min=0.02*balance;
		System.out.println("Minimum Payment:"+min);
		unpaid=balance-min;
		System.out.println("Unpaid:"+unpaid);
		interest=unpaid*(0.18/12);
		System.out.println("Interest:"+interest);
		balance=unpaid+interest;
		return balance;
	}

	public static void main(String[] args) {
		System.out.println("Calculation:");
		Credit1 c=new Credit1();
		for(int i=0;i<12;i++){
			System.out.println("Month:"+(i+1));
			System.out.println("your balance is:"+balance);
			balance=c.Payment();
		}
	
	}
	
}