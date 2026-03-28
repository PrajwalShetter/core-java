class FireRunner{
	
	public static void main(String[] args){
		
		System.out.println("Type :"+Fire.typeName);
		System.out.println("Color :"+Fire.color);
		System.out.println("Temperature :"+Fire.temperature);
		System.out.println("Dangerous :"+Fire.isDangerous);
		System.out.println("Intensity :"+Fire.intensity);
		System.out.println("\n");
		
		
		Fire fire1 = new Fire();
		System.out.println("This is First Fire \n");

		fire1.source = "Gas";
		fire1.fuel = "LPG";
		fire1.duration = 2.5;
		fire1.smoke = false;
		fire1.location = "Kitchen";
		fire1.spreadLevel = 2;
		fire1.heatOutput = 500;
		fire1.origin = "India";
		fire1.controllable = true;
		fire1.shape = "Flame";

		System.out.println("Source :"+fire1.source);
		System.out.println("Fuel :"+fire1.fuel);
		System.out.println("Duration :"+fire1.duration);
		System.out.println("Smoke :"+fire1.smoke);
		System.out.println("Location :"+fire1.location);
		System.out.println("Spread :"+fire1.spreadLevel);
		System.out.println("Heat :"+fire1.heatOutput);
		System.out.println("Origin :"+fire1.origin);
		System.out.println("Controllable :"+fire1.controllable);
		System.out.println("Shape :"+fire1.shape);
		System.out.println("\n");


		Fire fire2 = new Fire();
		System.out.println("This is Second Fire \n");

		fire2.source = "Wood";
		fire2.fuel = "Timber";
		fire2.duration = 5;
		fire2.smoke = true;
		fire2.location = "Forest";
		fire2.spreadLevel = 5;
		fire2.heatOutput = 900;
		fire2.origin = "Brazil";
		fire2.controllable = false;
		fire2.shape = "Wide";

		System.out.println("Source :"+fire2.source);
		System.out.println("Fuel :"+fire2.fuel);
		System.out.println("Duration :"+fire2.duration);
		System.out.println("Smoke :"+fire2.smoke);
		System.out.println("Location :"+fire2.location);
		System.out.println("Spread :"+fire2.spreadLevel);
		System.out.println("Heat :"+fire2.heatOutput);
		System.out.println("Origin :"+fire2.origin);
		System.out.println("Controllable :"+fire2.controllable);
		System.out.println("Shape :"+fire2.shape);
		System.out.println("\n");
		
		Fire fire3 = new Fire();
System.out.println("This is Third Fire \n");

fire3.source = "Electric";
fire3.fuel = "Short Circuit";
fire3.duration = 3;
fire3.smoke = true;
fire3.location = "Office";
fire3.spreadLevel = 3;
fire3.heatOutput = 700;
fire3.origin = "USA";
fire3.controllable = true;
fire3.shape = "Spark";

System.out.println("Source :"+fire3.source);
System.out.println("Fuel :"+fire3.fuel);
System.out.println("Duration :"+fire3.duration);
System.out.println("Smoke :"+fire3.smoke);
System.out.println("Location :"+fire3.location);
System.out.println("Spread :"+fire3.spreadLevel);
System.out.println("Heat :"+fire3.heatOutput);
System.out.println("Origin :"+fire3.origin);
System.out.println("Controllable :"+fire3.controllable);
System.out.println("Shape :"+fire3.shape);
System.out.println("\n");

Fire fire4 = new Fire();
System.out.println("This is Fourth Fire \n");

fire4.source = "Coal";
fire4.fuel = "Coal";
fire4.duration = 6;
fire4.smoke = true;
fire4.location = "Factory";
fire4.spreadLevel = 4;
fire4.heatOutput = 850;
fire4.origin = "China";
fire4.controllable = false;
fire4.shape = "Dense";

System.out.println("Source :"+fire4.source);
System.out.println("Fuel :"+fire4.fuel);
System.out.println("Duration :"+fire4.duration);
System.out.println("Smoke :"+fire4.smoke);
System.out.println("Location :"+fire4.location);
System.out.println("Spread :"+fire4.spreadLevel);
System.out.println("Heat :"+fire4.heatOutput);
System.out.println("Origin :"+fire4.origin);
System.out.println("Controllable :"+fire4.controllable);
System.out.println("Shape :"+fire4.shape);
System.out.println("\n");

Fire fire5 = new Fire();
System.out.println("This is Fifth Fire \n");

fire5.source = "Oil";
fire5.fuel = "Petrol";
fire5.duration = 4;
fire5.smoke = true;
fire5.location = "Garage";
fire5.spreadLevel = 3;
fire5.heatOutput = 800;
fire5.origin = "UAE";
fire5.controllable = false;
fire5.shape = "Spreading";

System.out.println("Source :"+fire5.source);
System.out.println("Fuel :"+fire5.fuel);
System.out.println("Duration :"+fire5.duration);
System.out.println("Smoke :"+fire5.smoke);
System.out.println("Location :"+fire5.location);
System.out.println("Spread :"+fire5.spreadLevel);
System.out.println("Heat :"+fire5.heatOutput);
System.out.println("Origin :"+fire5.origin);
System.out.println("Controllable :"+fire5.controllable);
System.out.println("Shape :"+fire5.shape);
System.out.println("\n");