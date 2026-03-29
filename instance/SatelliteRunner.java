class SatelliteRunner {

	public static void main(String[] args) {

		System.out.println("Agency :" + Satellite.agency);
		System.out.println("Orbit :" + Satellite.orbitType);
		System.out.println("Weight :" + Satellite.weight);
		System.out.println("Active :" + Satellite.active);
		System.out.println("Lifespan :" + Satellite.lifespan);
		System.out.println("\n");

		Satellite s1 = new Satellite();
		System.out.println("This is First Satellite \n");

		s1.name = "INSAT-3D";
		s1.purpose = "Weather";
		s1.altitude = 36000;
		s1.communication = true;
		s1.launchVehicle = "GSLV";
		s1.transponders = 24;
		s1.speed = 3.1;
		s1.origin = "India";
		s1.reusable = false;
		s1.shape = "Cylinder";

		System.out.println("Name :" + s1.name);
		System.out.println("Purpose :" + s1.purpose);
		System.out.println("Altitude :" + s1.altitude);
		System.out.println("Communication :" + s1.communication);
		System.out.println("Launch :" + s1.launchVehicle);
		System.out.println("Transponders :" + s1.transponders);
		System.out.println("Speed :" + s1.speed);
		System.out.println("Origin :" + s1.origin);
		System.out.println("Reusable :" + s1.reusable);
		System.out.println("Shape :" + s1.shape);
		System.out.println("\n");

		Satellite s2 = new Satellite();
		System.out.println("This is Second Satellite \n");

		s2.name = "GSAT-11";
		s2.purpose = "Communication";
		s2.altitude = 35786;
		s2.communication = true;
		s2.launchVehicle = "Ariane-5";
		s2.transponders = 40;
		s2.speed = 3.0;
		s2.origin = "India";
		s2.reusable = false;
		s2.shape = "Cuboid";

		System.out.println("Name :" + s2.name);
		System.out.println("Purpose :" + s2.purpose);
		System.out.println("Altitude :" + s2.altitude);
		System.out.println("Communication :" + s2.communication);
		System.out.println("Launch :" + s2.launchVehicle);
		System.out.println("Transponders :" + s2.transponders);
		System.out.println("Speed :" + s2.speed);
		System.out.println("Origin :" + s2.origin);
		System.out.println("Reusable :" + s2.reusable);
		System.out.println("Shape :" + s2.shape);
		System.out.println("\n");

		Satellite s3 = new Satellite();
		System.out.println("This is Third Satellite \n");

		s3.name = "Hubble";
		s3.purpose = "Research";
		s3.altitude = 540;
		s3.communication = false;
		s3.launchVehicle = "Space Shuttle";
		s3.transponders = 10;
		s3.speed = 7.5;
		s3.origin = "USA";
		s3.reusable = false;
		s3.shape = "Cylinder";

		System.out.println("Name :" + s3.name);
		System.out.println("Purpose :" + s3.purpose);
		System.out.println("Altitude :" + s3.altitude);
		System.out.println("Communication :" + s3.communication);
		System.out.println("Launch :" + s3.launchVehicle);
		System.out.println("Transponders :" + s3.transponders);
		System.out.println("Speed :" + s3.speed);
		System.out.println("Origin :" + s3.origin);
		System.out.println("Reusable :" + s3.reusable);
		System.out.println("Shape :" + s3.shape);
		System.out.println("\n");

		Satellite s4 = new Satellite();
		System.out.println("This is Fourth Satellite \n");

		s4.name = "Chandrayaan-2 Orbiter";
		s4.purpose = "Research";
		s4.altitude = 100;
		s4.communication = true;
		s4.launchVehicle = "GSLV Mk3";
		s4.transponders = 15;
		s4.speed = 1.6;
		s4.origin = "India";
		s4.reusable = false;
		s4.shape = "Cuboid";

		System.out.println("Name :" + s4.name);
		System.out.println("Purpose :" + s4.purpose);
		System.out.println("Altitude :" + s4.altitude);
		System.out.println("Communication :" + s4.communication);
		System.out.println("Launch :" + s4.launchVehicle);
		System.out.println("Transponders :" + s4.transponders);
		System.out.println("Speed :" + s4.speed);
		System.out.println("Origin :" + s4.origin);
		System.out.println("Reusable :" + s4.reusable);
		System.out.println("Shape :" + s4.shape);
		System.out.println("\n");

		Satellite s5 = new Satellite();
		System.out.println("This is Fifth Satellite \n");

		s5.name = "GPS IIF";
		s5.purpose = "Navigation";
		s5.altitude = 20200;
		s5.communication = true;
		s5.launchVehicle = "Delta IV";
		s5.transponders = 20;
		s5.speed = 3.9;
		s5.origin = "USA";
		s5.reusable = false;
		s5.shape = "Cube";

		System.out.println("Name :" + s5.name);
		System.out.println("Purpose :" + s5.purpose);
		System.out.println("Altitude :" + s5.altitude);
		System.out.println("Communication :" + s5.communication);
		System.out.println("Launch :" + s5.launchVehicle);
		System.out.println("Transponders :" + s5.transponders);
		System.out.println("Speed :" + s5.speed);
		System.out.println("Origin :" + s5.origin);
		System.out.println("Reusable :" + s5.reusable);
		System.out.println("Shape :" + s5.shape);
		System.out.println("\n");

		Satellite s6 = new Satellite();
		System.out.println("This is Sixth Satellite \n");

		s6.name = "Galileo";
		s6.purpose = "Navigation";
		s6.altitude = 23222;
		s6.communication = true;
		s6.launchVehicle = "Soyuz";
		s6.transponders = 18;
		s6.speed = 3.6;
		s6.origin = "EU";
		s6.reusable = false;
		s6.shape = "Rectangle";

		System.out.println("Name :" + s6.name);
		System.out.println("Purpose :" + s6.purpose);
		System.out.println("Altitude :" + s6.altitude);
		System.out.println("Communication :" + s6.communication);
		System.out.println("Launch :" + s6.launchVehicle);
		System.out.println("Transponders :" + s6.transponders);
		System.out.println("Speed :" + s6.speed);
		System.out.println("Origin :" + s6.origin);
		System.out.println("Reusable :" + s6.reusable);
		System.out.println("Shape :" + s6.shape);
		System.out.println("\n");

		Satellite s7 = new Satellite();
		System.out.println("This is Seventh Satellite \n");

		s7.name = "Cartosat-2";
		s7.purpose = "Imaging";
		s7.altitude = 630;
		s7.communication = true;
		s7.launchVehicle = "PSLV";
		s7.transponders = 12;
		s7.speed = 7.4;
		s7.origin = "India";
		s7.reusable = false;
		s7.shape = "Cuboid";

		System.out.println("Name :" + s7.name);
		System.out.println("Purpose :" + s7.purpose);
		System.out.println("Altitude :" + s7.altitude);
		System.out.println("Communication :" + s7.communication);
		System.out.println("Launch :" + s7.launchVehicle);
		System.out.println("Transponders :" + s7.transponders);
		System.out.println("Speed :" + s7.speed);
		System.out.println("Origin :" + s7.origin);
		System.out.println("Reusable :" + s7.reusable);
		System.out.println("Shape :" + s7.shape);
		System.out.println("\n");

		Satellite s8 = new Satellite();
		System.out.println("This is Eighth Satellite \n");

		s8.name = "NOAA-20";
		s8.purpose = "Weather";
		s8.altitude = 824;
		s8.communication = true;
		s8.launchVehicle = "Delta II";
		s8.transponders = 16;
		s8.speed = 7.5;
		s8.origin = "USA";
		s8.reusable = false;
		s8.shape = "Cylinder";

		System.out.println("Name :" + s8.name);
		System.out.println("Purpose :" + s8.purpose);
		System.out.println("Altitude :" + s8.altitude);
		System.out.println("Communication :" + s8.communication);
		System.out.println("Launch :" + s8.launchVehicle);
		System.out.println("Transponders :" + s8.transponders);
		System.out.println("Speed :" + s8.speed);
		System.out.println("Origin :" + s8.origin);
		System.out.println("Reusable :" + s8.reusable);
		System.out.println("Shape :" + s8.shape);
		System.out.println("\n");

		Satellite s9 = new Satellite();
		System.out.println("This is Ninth Satellite \n");

		s9.name = "Starlink";
		s9.purpose = "Internet";
		s9.altitude = 550;
		s9.communication = true;
		s9.launchVehicle = "Falcon 9";
		s9.transponders = 25;
		s9.speed = 7.6;
		s9.origin = "USA";
		s9.reusable = true;
		s9.shape = "Flat";

		System.out.println("Name :" + s9.name);
		System.out.println("Purpose :" + s9.purpose);
		System.out.println("Altitude :" + s9.altitude);
		System.out.println("Communication :" + s9.communication);
		System.out.println("Launch :" + s9.launchVehicle);
		System.out.println("Transponders :" + s9.transponders);
		System.out.println("Speed :" + s9.speed);
		System.out.println("Origin :" + s9.origin);
		System.out.println("Reusable :" + s9.reusable);
		System.out.println("Shape :" + s9.shape);
		System.out.println("\n");

		Satellite s10 = new Satellite();
		System.out.println("This is Tenth Satellite \n");

		s10.name = "Tiangong";
		s10.purpose = "Space Station";
		s10.altitude = 340;
		s10.communication = true;
		s10.launchVehicle = "Long March";
		s10.transponders = 30;
		s10.speed = 7.7;
		s10.origin = "China";
		s10.reusable = true;
		s10.shape = "Modular";

		System.out.println("Name :" + s10.name);
		System.out.println("Purpose :" + s10.purpose);
		System.out.println("Altitude :" + s10.altitude);
		System.out.println("Communication :" + s10.communication);
		System.out.println("Launch :" + s10.launchVehicle);
		System.out.println("Transponders :" + s10.transponders);
		System.out.println("Speed :" + s10.speed);
		System.out.println("Origin :" + s10.origin);
		System.out.println("Reusable :" + s10.reusable);
		System.out.println("Shape :" + s10.shape);
		System.out.println("\n");

	}
}
