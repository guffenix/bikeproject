package bikeproject;

public class BikeDriver {

	public static void main(String[] args) {
//		exercise 2-1
		Bike bike2_1_1_MB = new Bike("Bull Horn","Hardtail", "Maxxis", "dropper", 27);
		MountainBike bike2_1_2 = new MountainBike("", "", "", "", 0, "RockShox XC32", "Pro", 19);
		Bike bike2_1_3_RB = new Bike("Drop","racing", "tread less", "razor", 19);
		RoadBike bike2_1_4 = new RoadBike("", "", "", "", 0,20, 22);
		
		bike2_1_1_MB.printDescription();
		bike2_1_2.printDescription();
		bike2_1_3_RB.printDescription();
		bike2_1_4.printDescription();
				
//		*****************************************
//		exercise 2-2
		RoadBike bike1 = new RoadBike();
		RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);		
		MountainBike bike3 = new MountainBike();
		Bike bike4 = new Bike();
		
		bike1.setPostHeight("20");
		bike1.printDescription();
		bike2.printDescription();
		bike3.printDescription();
		bike4.printDescription();
	}//end method main

}//end class BikeDriver
