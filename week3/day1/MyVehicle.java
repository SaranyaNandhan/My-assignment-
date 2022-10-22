package week3.day1;

public class MyVehicle {

	public static void main(String[] args) {
		
		Vehicle VC = new Vehicle();
		VC.applyBrake();
		VC.soundHorn();
		
		
		Car C = new Car();
		
		C.openSunroof();
		C.turnOnAc();
		
		
		BMW B = new BMW();
		B.autoPark();
		
		Audi A = new Audi();
		A.hybridFuel();
		
		Bajaj Ba = new Bajaj();
		Ba.electronicMeter();
		
		Auto Au = new Auto();
		 Au.handStarted();
		

	}

}
