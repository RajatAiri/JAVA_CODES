package college;

class Sports_car extends Car
{
	int top_speed;
	
	Sports_car()
	{
		this.top_speed = get_topspeed();
	}
	
	int get_topspeed()
	{
		System.out.print("Enter Top Speed Of Sports Car:  ");
		top_speed = obj.nextInt();
		return top_speed;
	}
	
	void print()
	{
		System.out.println("The Top Speed Of The Car Is: " +top_speed);
	}
}
