package college;

class CargoShip extends Ship
{
	int cargo_capp;
	CargoShip()
	{
		this.cargo_capp = get_cargo();
	}
	int get_cargo()
	{
		System.out.println("Enter The Cargo Capacity in tonnage ");
		cargo_capp = obj.nextInt();
		return cargo_capp;
	}
	
	void print()
	{
		System.out.println("The Ship Name Is: " +name);
		System.out.println("The Cargo Capacity Is:" +cargo_capp);
	}
}