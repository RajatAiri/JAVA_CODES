package college;

class Broadcast extends Programme implements TVStation{
	public void show(){
		System.out.println("Satellite name :" + satelliteName);
		System.out.println("Cable TV name :" + cableTVName);
		System.out.println("Signal Frequency :" + signalFrequency);
	}
}
