package college;

public class Monkey {
	String monka;
	String monkb;
	boolean monkeytrouble(String asmile, String bsmile)
	{
		monka = asmile;
		monkb = bsmile;
		if(monka==monkb)
		{
			return true;
		}
		else{
			return false;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monkey m = new Monkey();
		System.out.println("MonketTrouble(true,true)->" + m.monkeytrouble("true","true"));
		System.out.println("MonketTrouble(false,false)->" + m.monkeytrouble("false","false"));
		System.out.println("MonketTrouble(true,false)->" + m.monkeytrouble("true","false"));

	}

}
