package college;

import java.util.*;
class Ship
{
	String name, year;
	Scanner obj = new Scanner(System.in);
	Ship()
	{
		this.name = get_name();
		this.year = get_year();
	}
	String get_name()
	{
		System.out.println("Enter The Name Of Ship ");
		name = obj.next();
		return name;
	}
	String get_year()
	{
		System.out.println("Enter The Year The Ship Was Built ");
		year = obj.next();
		return year;
	}
	
	void print()
	{
		System.out.println("The Name Of The Ship Is: " +name);
		System.out.println("The Year Of Built " +year);
	}
}
