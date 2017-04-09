package college;
import java.util.Scanner;


public class StudentFaculty {
	String name;
	String reg;
	int year;
	String section;
	double cgpa;
	int expense;
	int totalst;
	int totaluniv;
	public void detailsStudent(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name of the student:");
		name = sc.next();
		System.out.println("enter the registration number:");
		reg = sc.next();
		System.out.println("enter the year in which student studies:");
		year = sc.nextInt();
		System.out.println("enter the section of the student:");
		section = sc.next();
		System.out.println("enter the cgpa of the student:");
		cgpa = sc.nextDouble();
		System.out.println("enter the total living expense including academic fees:");
		expense = sc.nextInt();
		System.out.println("enter the total students in the campus:");
		totalst = sc.nextInt();
		System.out.println("enter the total students in the university across all campuses and all disciplines:");
		totaluniv = sc.nextInt();
	}
	public void display(){
		System.out.println("You are a student with name " + name +", Register Number " + reg + " and you belong to\n " + year +" year " + "section " + section +" and eligible for a scholarship of \n" + cgpa * 10000 +" per year as your CGPA is " + cgpa + " and your total living expense is \n" + expense +". Total number of students in your campus is "+ totalst +" and across campus is \n" +totaluniv +"."
);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean canrun = true;
Scanner sc = new Scanner(System.in);
StudentFaculty sf = new StudentFaculty();
while(canrun){
System.out.println("select a option");
System.out.println("1. STUDENT");
System.out.println("2. FACULTY");
System.out.println("0. EXIT");
int choice = sc.nextInt();
switch(choice)
{
case 1:
	sf.detailsStudent();
	sf.display();
	break;
case 2:
	System.out.println("Permission denied to enter details");
	break;
case 0:
	canrun = false;
	System.out.println("bye!!!");
	break;
default:
	System.out.println("INVALID ENTRY");
	 break;
}
}

	}

}
