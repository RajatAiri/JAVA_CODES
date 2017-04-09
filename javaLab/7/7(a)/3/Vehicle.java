package college;

import java.util.*;
class Vehicle
{
	Scanner obj = new Scanner(System.in);
	String name;
	int cylinder;
	Vehicle()
	{
		this.name = get_name();
		this.cylinder = get_cylinder();
	}
	String get_name()
	{
		System.out.println("Enter Vehicle Name: ");
		name = obj.next();
		return name;
	}
	int get_cylinder()
	{
		System.out.println("Enter Number Of Cylinder: ");
		cylinder = obj.nextInt();
		return cylinder;
	}
	
	void print()
	{
		System.out.println("Vehicle Name: "+name);
		System.out.println("Number Of Cylinder: "+cylinder);
	}
	
}
