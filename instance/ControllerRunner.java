class ControllerRunner {

	public static void main(String[] args) {

		System.out.println("Brand :" + Controller.brand);
		System.out.println("Color :" + Controller.color);
		System.out.println("Price :" + Controller.price);
		System.out.println("Wireless :" + Controller.wireless);
		System.out.println("Buttons :" + Controller.buttonsCount);
		System.out.println("\n");

		Controller c1 = new Controller();
		System.out.println("This is First Controller \n");

		c1.type = "Gamepad";
		c1.connectivity = "Bluetooth";
		c1.weight = 200;
		c1.vibration = true;
		c1.shape = "Ergonomic";
		c1.battery = 10;
		c1.range = 10;
		c1.origin = "Japan";
		c1.rgb = true;
		c1.compatibility = "PS5";

		System.out.println("Type :" + c1.type);
		System.out.println("Connectivity :" + c1.connectivity);
		System.out.println("Weight :" + c1.weight);
		System.out.println("Vibration :" + c1.vibration);
		System.out.println("Shape :" + c1.shape);
		System.out.println("Battery :" + c1.battery);
		System.out.println("Range :" + c1.range);
		System.out.println("Origin :" + c1.origin);
		System.out.println("RGB :" + c1.rgb);
		System.out.println("Compatibility :" + c1.compatibility);
		System.out.println("\n");

		Controller c2 = new Controller();
		System.out.println("This is Second Controller \n");

		c2.type = "Gamepad";
		c2.connectivity = "Wireless";
		c2.weight = 220;
		c2.vibration = true;
		c2.shape = "Compact";
		c2.battery = 12;
		c2.range = 12;
		c2.origin = "USA";
		c2.rgb = false;
		c2.compatibility = "Xbox";

		System.out.println("Type :" + c2.type);
		System.out.println("Connectivity :" + c2.connectivity);
		System.out.println("Weight :" + c2.weight);
		System.out.println("Vibration :" + c2.vibration);
		System.out.println("Shape :" + c2.shape);
		System.out.println("Battery :" + c2.battery);
		System.out.println("Range :" + c2.range);
		System.out.println("Origin :" + c2.origin);
		System.out.println("RGB :" + c2.rgb);
		System.out.println("Compatibility :" + c2.compatibility);
		System.out.println("\n");

		Controller c3 = new Controller();
		System.out.println("This is Third Controller \n");

		c3.type = "Joystick";
		c3.connectivity = "Wired";
		c3.weight = 250;
		c3.vibration = false;
		c3.shape = "Stick";
		c3.battery = 0;
		c3.range = 0;
		c3.origin = "China";
		c3.rgb = false;
		c3.compatibility = "PC";

		System.out.println("Type :" + c3.type);
		System.out.println("Connectivity :" + c3.connectivity);
		System.out.println("Weight :" + c3.weight);
		System.out.println("Vibration :" + c3.vibration);
		System.out.println("Shape :" + c3.shape);
		System.out.println("Battery :" + c3.battery);
		System.out.println("Range :" + c3.range);
		System.out.println("Origin :" + c3.origin);
		System.out.println("RGB :" + c3.rgb);
		System.out.println("Compatibility :" + c3.compatibility);
		System.out.println("\n");

		Controller c4 = new Controller();
		System.out.println("This is Fourth Controller \n");

		c4.type = "Gamepad";
		c4.connectivity = "Bluetooth";
		c4.weight = 210;
		c4.vibration = true;
		c4.shape = "Ergonomic";
		c4.battery = 15;
		c4.range = 15;
		c4.origin = "Korea";
		c4.rgb = true;
		c4.compatibility = "Android";

		System.out.println("Type :" + c4.type);
		System.out.println("Connectivity :" + c4.connectivity);
		System.out.println("Weight :" + c4.weight);
		System.out.println("Vibration :" + c4.vibration);
		System.out.println("Shape :" + c4.shape);
		System.out.println("Battery :" + c4.battery);
		System.out.println("Range :" + c4.range);
		System.out.println("Origin :" + c4.origin);
		System.out.println("RGB :" + c4.rgb);
		System.out.println("Compatibility :" + c4.compatibility);
		System.out.println("\n");

		Controller c5 = new Controller();
		System.out.println("This is Fifth Controller \n");

		c5.type = "Steering";
		c5.connectivity = "Wired";
		c5.weight = 500;
		c5.vibration = true;
		c5.shape = "Wheel";
		c5.battery = 0;
		c5.range = 0;
		c5.origin = "Germany";
		c5.rgb = false;
		c5.compatibility = "PC";

		System.out.println("Type :" + c5.type);
		System.out.println("Connectivity :" + c5.connectivity);
		System.out.println("Weight :" + c5.weight);
		System.out.println("Vibration :" + c5.vibration);
		System.out.println("Shape :" + c5.shape);
		System.out.println("Battery :" + c5.battery);
		System.out.println("Range :" + c5.range);
		System.out.println("Origin :" + c5.origin);
		System.out.println("RGB :" + c5.rgb);
		System.out.println("Compatibility :" + c5.compatibility);
		System.out.println("\n");

		Controller c6 = new Controller();
		System.out.println("This is Sixth Controller \n");

		c6.type = "Gamepad";
		c6.connectivity = "Wireless";
		c6.weight = 230;
		c6.vibration = true;
		c6.shape = "Ergonomic";
		c6.battery = 14;
		c6.range = 12;
		c6.origin = "India";
		c6.rgb = true;
		c6.compatibility = "Windows";

		System.out.println("Type :" + c6.type);
		System.out.println("Connectivity :" + c6.connectivity);
		System.out.println("Weight :" + c6.weight);
		System.out.println("Vibration :" + c6.vibration);
		System.out.println("Shape :" + c6.shape);
		System.out.println("Battery :" + c6.battery);
		System.out.println("Range :" + c6.range);
		System.out.println("Origin :" + c6.origin);
		System.out.println("RGB :" + c6.rgb);
		System.out.println("Compatibility :" + c6.compatibility);
		System.out.println("\n");

		Controller c7 = new Controller();
		System.out.println("This is Seventh Controller \n");

		c7.type = "Joystick";
		c7.connectivity = "Bluetooth";
		c7.weight = 260;
		c7.vibration = false;
		c7.shape = "Stick";
		c7.battery = 8;
		c7.range = 10;
		c7.origin = "USA";
		c7.rgb = false;
		c7.compatibility = "PC";

		System.out.println("Type :" + c7.type);
		System.out.println("Connectivity :" + c7.connectivity);
		System.out.println("Weight :" + c7.weight);
		System.out.println("Vibration :" + c7.vibration);
		System.out.println("Shape :" + c7.shape);
		System.out.println("Battery :" + c7.battery);
		System.out.println("Range :" + c7.range);
		System.out.println("Origin :" + c7.origin);
		System.out.println("RGB :" + c7.rgb);
		System.out.println("Compatibility :" + c7.compatibility);
		System.out.println("\n");

		Controller c8 = new Controller();
		System.out.println("This is Eighth Controller \n");

		c8.type = "Gamepad";
		c8.connectivity = "Wired";
		c8.weight = 210;
		c8.vibration = true;
		c8.shape = "Compact";
		c8.battery = 0;
		c8.range = 0;
		c8.origin = "China";
		c8.rgb = false;
		c8.compatibility = "Android";

		System.out.println("Type :" + c8.type);
		System.out.println("Connectivity :" + c8.connectivity);
		System.out.println("Weight :" + c8.weight);
		System.out.println("Vibration :" + c8.vibration);
		System.out.println("Shape :" + c8.shape);
		System.out.println("Battery :" + c8.battery);
		System.out.println("Range :" + c8.range);
		System.out.println("Origin :" + c8.origin);
		System.out.println("RGB :" + c8.rgb);
		System.out.println("Compatibility :" + c8.compatibility);
		System.out.println("\n");

		Controller c9 = new Controller();
		System.out.println("This is Ninth Controller \n");

		c9.type = "Steering";
		c9.connectivity = "Wireless";
		c9.weight = 520;
		c9.vibration = true;
		c9.shape = "Wheel";
		c9.battery = 10;
		c9.range = 15;
		c9.origin = "Germany";
		c9.rgb = false;
		c9.compatibility = "PC";

		System.out.println("Type :" + c9.type);
		System.out.println("Connectivity :" + c9.connectivity);
		System.out.println("Weight :" + c9.weight);
		System.out.println("Vibration :" + c9.vibration);
		System.out.println("Shape :" + c9.shape);
		System.out.println("Battery :" + c9.battery);
		System.out.println("Range :" + c9.range);
		System.out.println("Origin :" + c9.origin);
		System.out.println("RGB :" + c9.rgb);
		System.out.println("Compatibility :" + c9.compatibility);
		System.out.println("\n");

		Controller c10 = new Controller();
		System.out.println("This is Tenth Controller \n");

		c10.type = "Gamepad";
		c10.connectivity = "Bluetooth";
		c10.weight = 215;
		c10.vibration = true;
		c10.shape = "Standard";
		c10.battery = 16;
		c10.range = 18;
		c10.origin = "Korea";
		c10.rgb = true;
		c10.compatibility = "iOS";

		System.out.println("Type :" + c10.type);
		System.out.println("Connectivity :" + c10.connectivity);
		System.out.println("Weight :" + c10.weight);
		System.out.println("Vibration :" + c10.vibration);
		System.out.println("Shape :" + c10.shape);
		System.out.println("Battery :" + c10.battery);
		System.out.println("Range :" + c10.range);
		System.out.println("Origin :" + c10.origin);
		System.out.println("RGB :" + c10.rgb);
		System.out.println("Compatibility :" + c10.compatibility);
		System.out.println("\n");

	}
}
