package college;

class Outer{
	private class Inner{
	public void print(){
		System.out.println("this is inner class");
	}
}

void display(){
	Inner i=new Inner();
	i.print();
}
}
public class NestedClass {

public static void main(String[] args) {
	// TODO Auto-generated method stub
   Outer o=new Outer();
   o.display();
}

}  