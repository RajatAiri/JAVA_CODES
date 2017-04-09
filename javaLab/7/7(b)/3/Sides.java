package college;

abstract class Shape{
	abstract void numberOfSides();
}
class Trapezoid extends Shape{
	void numberOfSides(){
		System.out.println("The trapezoid has four sides.");
	}
}
class Triangle extends Shape{
	void numberOfSides(){
		System.out.println("The triangle has three sides.");
	}
}
class Hexagon extends Shape{
	void numberOfSides(){
		System.out.println("The hexagon has six sides.");
	}
}

class Sides{
	public static void main(String args[]){
		Trapezoid tp = new Trapezoid();
		Triangle t = new Triangle();
		Hexagon h = new Hexagon();
		tp.numberOfSides();
		t.numberOfSides();
		h.numberOfSides();
	}
}	 