package college;

public class Overloading {
	public static void main(String args[]) {
    Add a1 = new Add();
    Add a2 = new Add(4,3);

    a1.setData(5,6);

    System.out.println("Sum A1: " + a1.getSum());
    System.out.println("Sum A2: " + a2.getSum());

    System.out.println("Sum 4.5 + 21.2: " + Add.doSum(4.5,21.2));
    System.out.println("Sum 7 + 8: " + Add.doSum(7,8));

    DoubleAdd d1 = new DoubleAdd(2.32,4.1221);
    System.out.println("Sum D1: " + d1.getDoubleSum());
    System.out.println("Sum D1 Parent Sum: " + d1.getParrentSum());

	}
}
