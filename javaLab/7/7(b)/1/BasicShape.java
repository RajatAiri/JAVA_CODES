package college;

abstract class BasicShape{
	double area;
	public double getArea(){
		return area;
	}
	abstract public void calcArea();
}
class Circle extends BasicShape{
	private long centerX;
	private 
	long centerY;
	private double radius;
	Circle(long cx, long cy, double r){
		centerX = cx;
		centerY = cy;
		radius = r;
		calcArea();
	}
	public long getCenterX(){
		return centerX;
	}
	public long getCenterY(){
		return centerY;
	}
	public void calcArea(){
		area = (3.14159*radius*radius);
		System.out.println("Area of the circle is:" + area);
	}
}
class Rectangle extends BasicShape{
	private long width;
	private long length;
	Rectangle(long w, long l){
		width = w;
		length = l;
		calcArea();
	}
	public long getWidth(){
		return width;
	}
	public long getLength(){
		return length;
	}
	public void calcArea(){
		area = length*width;
		System.out.println("Area of the rectangle is:" + area);
	}
}
		
	