package college;


import java.util.*;


public class Choice {
	String add(String str)
	{
		String temp=str.concat(str);
		return temp;
	}
	
	String replace(String str)
	{
		String temp="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(i%2==0)
				temp+=ch;
			else
				temp+='*';
		}
		return temp;
	}
	
	String remove(final String str)
	{
		final Set<Character> set = new LinkedHashSet<>();
	    for (int i = 0; i < str.length(); i++)
	        set.add(str.charAt(i));
	    final StringBuilder s = new StringBuilder(set.size());
	    for (final Character character : set)
	        s.append(character);
	    String temp=s.toString();
	    return temp;
	}
	
	String upper(String str)
	{
		String temp="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			if(i%2==0)
				temp+=ch;
			else
			{
				ch=Character.toUpperCase(ch);
				temp+=ch;
			}
		}
		return temp;
	}
	
	public static void main(String args[])
	{
		System.out.println("\tMENU\n1: Add the String to itself\n2: Replace alternate positions with *\n3: Remove duplicate characters in the String\n4: Change alternate characters to upper case");
		Scanner obj=new Scanner(System.in);
		int choice=1;
		String ans="";
		while(choice!=5)
		{
				System.out.println("Enter Your Choice: ");
				choice = obj.nextInt();	
				Choice c=new Choice();
				System.out.println("Enter A String: ");
				String str= obj.next();
				switch(choice)
				{
				case 1:
					ans=c.add(str);
					break;
				case 2:
					ans=c.replace(str);
					break;
				case 3:
					ans=c.remove(str);
					break;
				case 4:
					ans=c.upper(str);
					
				}
				System.out.println("Output: "+ ans);
		}
	}
}
