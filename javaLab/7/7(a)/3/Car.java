package college;


class Car extends Vehicle
{
	String colour;
	int doors;
	
	Car()
	{
		this.colour = get_colour();
		this.doors = get_doors();		
	}
	
	String get_colour()
	{
		System.out.print("Enter The Colour Of The Car: ");
		colour = obj.next();
		return colour;
	}
	
	int get_doors()
	{
		System.out.print("Enter The Number Of Doors In Car: ");
		doors = obj.nextInt();
		return doors;
	}
	
}
