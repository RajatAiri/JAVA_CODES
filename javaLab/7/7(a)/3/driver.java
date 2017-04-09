package college;


public class driver {
	
	public static void main(String args[])
	{
		System.out.println("Creating An Object Of Vehicle ");
		Vehicle v = new Vehicle();
		v.print();
		
		System.out.println("Creating An Object Of Truck ");
		Truck t = new Truck();
		t.print();
		
		System.out.println("Creating An Object Of Car ");
		Car c = new Car();
		c.print();
		
		System.out.println("Creating An Object Of Sports Car ");
		Sports_car sc = new Sports_car();
		sc.print();
		
		
	}

}
