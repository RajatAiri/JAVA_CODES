package college;

class derived extends base
{
	protected void finalize()
	{
		System.out.println("Derived Finalized ");
	}
	derived()
	{
		System.out.println("Derived Constructor");
	}
	
}