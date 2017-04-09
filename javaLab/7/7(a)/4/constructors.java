package college;

public class constructors {
	 
	static public void main(String args[])
	{
		System.out.println("Base Class Object: ");
		base b = new base();
		b= null;
		System.out.println("\nDerived Class Object: ");
		derived d = new derived();
		d= null;
		System.out.println("\nMain Class Object: ");
		main c = new main();
		c= null;
		
		System.out.println("\nFinallized Function ");
		System.gc();
		
	}

}
