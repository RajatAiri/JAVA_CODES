package college;

class Truck extends Vehicle
{
	double capacity;
	int towing;
	
	Truck()
	{
		this.capacity = get_capacity();
		this.towing = get_towing();
	}
	
	double get_capacity()
	{
		System.out.println("Enter The Load Capacity in tons:  ");
		capacity = obj.nextDouble();
		return capacity;
	}
	
	int get_towing()
	{
		System.out.println("Enter The Towing Capcity In Pounds:  ");
		towing = obj.nextInt();
		return towing;
	}
	
	void print()
	{
		System.out.println("Truck Capacity In Tons= " +capacity);
		System.out.println("Towing Capcity In Tons= " +towing);
	}
}