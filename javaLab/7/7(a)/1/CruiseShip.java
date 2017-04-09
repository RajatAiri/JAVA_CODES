package college;

class CruiseShip extends Ship
{
	int max_passenger;
	CruiseShip()
	{
		this.max_passenger = get_max();
	}
	
	int get_max()
	{
		System.out.println("Enter The Maxinum Number Of Passenger: ");
		max_passenger = obj.nextInt();
		return max_passenger;
	}
	
	void print()
	{
		System.out.println("The Name Of The Ship Is: "+name);
		System.out.println("The Maximum Number Of Passenger: " +max_passenger);
	}

}