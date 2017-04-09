package college;

class Programme{
	String programmeName;
	String sponsor;
	Programme(){
		programmeName = "Programme";
		sponsor = "Sponsor";
	}
	void display(){
		System.out.println("Programme name :" + programmeName);
		System.out.println("Sponsor :" + sponsor);
	}
}