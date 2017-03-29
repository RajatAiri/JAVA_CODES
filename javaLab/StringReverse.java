package college;

public class StringReverse {
	String name;
	public StringBuffer getImage(String a)
	{
		name = a;
		StringBuffer sb = new StringBuffer(name);
		StringBuffer name = sb.reverse();
		return name;
	}
	
	public String returnS(String ss){
		StringBuffer sb = new StringBuffer(ss);
		sb = sb.reverse();
		ss = ss +"|"+sb;
		
		return ss;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringReverse sr = new StringReverse();
		//System.out.println("the reverse of the string is --> " + "EARTH | " + sr.getImage("EARTH"));
		System.out.println("String is "+sr.returnS("Rajat"));
	}
}
