class MouseRunner{
	
	public static void main(String[] args){
		
		System.out.println("Brand :"+Mouse.brand);
		System.out.println("Color :"+Mouse.color);
		System.out.println("Price :"+Mouse.price);
		System.out.println("Wireless :"+Mouse.wireless);
		System.out.println("DPI :"+Mouse.dpi);
		System.out.println("\n");
		
		
		Mouse mouse1 = new Mouse();
		System.out.println("This is First Mouse \n");

		mouse1.type = "Gaming";
		mouse1.connectivity = "Wireless";
		mouse1.weight = 120;
		mouse1.gaming = true;
		mouse1.shape = "Ergonomic";
		mouse1.buttons = 6;
		mouse1.batteryLife = 20;
		mouse1.origin = "USA";
		mouse1.rgb = true;
		mouse1.compatibility = "Windows";

		System.out.println("Type :"+mouse1.type);
		System.out.println("Connectivity :"+mouse1.connectivity);
		System.out.println("Weight :"+mouse1.weight);
		System.out.println("Gaming :"+mouse1.gaming);
		System.out.println("Shape :"+mouse1.shape);
		System.out.println("Buttons :"+mouse1.buttons);
		System.out.println("Battery :"+mouse1.batteryLife);
		System.out.println("Origin :"+mouse1.origin);
		System.out.println("RGB :"+mouse1.rgb);
		System.out.println("Compatibility :"+mouse1.compatibility);
		System.out.println("\n");


		Mouse mouse2 = new Mouse();
		System.out.println("This is Second Mouse \n");

		mouse2.type = "Office";
		mouse2.connectivity = "Wired";
		mouse2.weight = 100;
		mouse2.gaming = false;
		mouse2.shape = "Compact";
		mouse2.buttons = 3;
		mouse2.batteryLife = 0;
		mouse2.origin = "China";
		mouse2.rgb = false;
		mouse2.compatibility = "Mac";

		System.out.println("Type :"+mouse2.type);
		System.out.println("Connectivity :"+mouse2.connectivity);
		System.out.println("Weight :"+mouse2.weight);
		System.out.println("Gaming :"+mouse2.gaming);
		System.out.println("Shape :"+mouse2.shape);
		System.out.println("Buttons :"+mouse2.buttons);
		System.out.println("Battery :"+mouse2.batteryLife);
		System.out.println("Origin :"+mouse2.origin);
		System.out.println("RGB :"+mouse2.rgb);
		System.out.println("Compatibility :"+mouse2.compatibility);
		System.out.println("\n");
		
		Mouse mouse3 = new Mouse();
		System.out.println("This is Third Mouse \n");

		mouse3.type = "Gaming";
		mouse3.connectivity = "wireless";
		mouse3.weight = 130;
		mouse3.gaming = true;
		mouse3.shape = "ergonic";
		mouse3.buttons = 5;
		mouse3.batteryLife = 100;
		mouse3.origin = "USA";
		mouse3.rgb = true;
		mouse3.compatibility = "windows";

		System.out.println("Type :"+mouse3.type);
		System.out.println("Connectivity :"+mouse3.connectivity);
		System.out.println("Weight :"+mouse3.weight);
		System.out.println("Gaming :"+mouse3.gaming);
		System.out.println("Shape :"+mouse3.shape);
		System.out.println("Buttons :"+mouse3.buttons);
		System.out.println("Battery :"+mouse3.batteryLife);
		System.out.println("Origin :"+mouse3.origin);
		System.out.println("RGB :"+mouse3.rgb);
		System.out.println("Compatibility :"+mouse3.compatibility);
		System.out.println("\n");
		
		Mouse mouse4 = new Mouse();
		System.out.println("This is fourth Mouse \n");

		mouse4.type = "Office";
		mouse4.connectivity = "Bluetooth";
		mouse4.weight = 90;
		mouse4.gaming = false;
		mouse4.shape = "Slim";
		mouse4.buttons = 3;
		mouse4.batteryLife = 30;
		mouse4.origin = "Africa";
		mouse4.rgb = false;
		mouse4.compatibility = "windows";

		System.out.println("Type :"+mouse4.type);
		System.out.println("Connectivity :"+mouse4.connectivity);
		System.out.println("Weight :"+mouse4.weight);
		System.out.println("Gaming :"+mouse4.gaming);
		System.out.println("Shape :"+mouse4.shape);
		System.out.println("Buttons :"+mouse4.buttons);
		System.out.println("Battery :"+mouse4.batteryLife);
		System.out.println("Origin :"+mouse4.origin);
		System.out.println("RGB :"+mouse4.rgb);
		System.out.println("Compatibility :"+mouse4.compatibility);
		System.out.println("\n");
		
		Mouse mouse5 = new Mouse();
		System.out.println("This is fifth Mouse \n");

		mouse5.type = "Gaming";
		mouse5.connectivity = "Wired";
		mouse5.weight = 110;
		mouse5.gaming = true;
		mouse5.shape = "Ergonic";
		mouse5.buttons = 6;
		mouse5.batteryLife = 0;
		mouse5.origin = "USA";
		mouse5.rgb = true;
		mouse5.compatibility = "Linux";

		System.out.println("Type :"+mouse5.type);
		System.out.println("Connectivity :"+mouse5.connectivity);
		System.out.println("Weight :"+mouse5.weight);
		System.out.println("Gaming :"+mouse5.gaming);
		System.out.println("Shape :"+mouse5.shape);
		System.out.println("Buttons :"+mouse5.buttons);
		System.out.println("Battery :"+mouse5.batteryLife);
		System.out.println("Origin :"+mouse5.origin);
		System.out.println("RGB :"+mouse5.rgb);
		System.out.println("Compatibility :"+mouse5.compatibility);
		System.out.println("\n");
		
		Mouse mouse6 = new Mouse();
		System.out.println("This is Sixth Mouse \n");

		mouse6.type = "Office";
		mouse6.connectivity = "wireless";
		mouse6.weight = 950;
		mouse6.gaming = false;
		mouse6.shape = "Compact";
		mouse6.buttons = 4;
		mouse6.batteryLife = 20;
		mouse6.origin = "Japan";
		mouse6.rgb = false;
		mouse6.compatibility = "Mac";

		System.out.println("Type :"+mouse6.type);
		System.out.println("Connectivity :"+mouse6.connectivity);
		System.out.println("Weight :"+mouse6.weight);
		System.out.println("Gaming :"+mouse6.gaming);
		System.out.println("Shape :"+mouse6.shape);
		System.out.println("Buttons :"+mouse6.buttons);
		System.out.println("Battery :"+mouse6.batteryLife);
		System.out.println("Origin :"+mouse6.origin);
		System.out.println("RGB :"+mouse6.rgb);
		System.out.println("Compatibility :"+mouse6.compatibility);
		System.out.println("\n");
		
		Mouse mouse7 = new Mouse();
		System.out.println("This is Seventh Mouse \n");

		mouse7.type = "gaming";
		mouse7.connectivity = "bluetooth";
		mouse7.weight = 180;
		mouse7.gaming = true;
		mouse7.shape = "Compact";
		mouse7.buttons = 7;
		mouse7.batteryLife = 300;
		mouse7.origin = "Germany";
		mouse7.rgb = true;
		mouse7.compatibility = "kali";

		System.out.println("Type :"+mouse7.type);
		System.out.println("Connectivity :"+mouse7.connectivity);
		System.out.println("Weight :"+mouse7.weight);
		System.out.println("Gaming :"+mouse7.gaming);
		System.out.println("Shape :"+mouse7.shape);
		System.out.println("Buttons :"+mouse7.buttons);
		System.out.println("Battery :"+mouse7.batteryLife);
		System.out.println("Origin :"+mouse7.origin);
		System.out.println("RGB :"+mouse7.rgb);
		System.out.println("Compatibility :"+mouse7.compatibility);
		System.out.println("\n");
		
		Mouse mouse8 = new Mouse();
		System.out.println("This is eighth Mouse \n");

		mouse8.type = "Editing";
		mouse8.connectivity = "Wired";
		mouse8.weight = 70;
		mouse8.gaming = false;
		mouse8.shape = "moern";
		mouse8.buttons = 5;
		mouse8.batteryLife = 80;
		mouse8.origin = "China";
		mouse8.rgb = false;
		mouse8.compatibility = "windows";

		System.out.println("Type :"+mouse8.type);
		System.out.println("Connectivity :"+mouse8.connectivity);
		System.out.println("Weight :"+mouse8.weight);
		System.out.println("Gaming :"+mouse8.gaming);
		System.out.println("Shape :"+mouse8.shape);
		System.out.println("Buttons :"+mouse8.buttons);
		System.out.println("Battery :"+mouse8.batteryLife);
		System.out.println("Origin :"+mouse8.origin);
		System.out.println("RGB :"+mouse8.rgb);
		System.out.println("Compatibility :"+mouse8.compatibility);
		System.out.println("\n");
		
		Mouse mouse9 = new Mouse();
		System.out.println("This is ninth Mouse \n");

		mouse9.type = "Normal";
		mouse9.connectivity = "Wired";
		mouse9.weight = 70;
		mouse9.gaming = false;
		mouse9.shape = "liqua";
		mouse9.buttons = 3;
		mouse9.batteryLife = 90;
		mouse9.origin = "srilanka";
		mouse9.rgb = false;
		mouse9.compatibility = "linux";

		System.out.println("Type :"+mouse9.type);
		System.out.println("Connectivity :"+mouse9.connectivity);
		System.out.println("Weight :"+mouse9.weight);
		System.out.println("Gaming :"+mouse9.gaming);
		System.out.println("Shape :"+mouse9.shape);
		System.out.println("Buttons :"+mouse9.buttons);
		System.out.println("Battery :"+mouse9.batteryLife);
		System.out.println("Origin :"+mouse9.origin);
		System.out.println("RGB :"+mouse9.rgb);
		System.out.println("Compatibility :"+mouse9.compatibility);
		System.out.println("\n");
		
		Mouse mouse10 = new Mouse();
		System.out.println("This is tenth Mouse \n");

		mouse10.type = "college";
		mouse10.connectivity = "Bluetooth";
		mouse10.weight = 90;
		mouse10.gaming = false;
		mouse10.shape = "Compact";
		mouse10.buttons = 3;
		mouse10.batteryLife = 500;
		mouse10.origin = "India";
		mouse10.rgb = false;
		mouse10.compatibility = "All";

		System.out.println("Type :"+mouse10.type);
		System.out.println("Connectivity :"+mouse10.connectivity);
		System.out.println("Weight :"+mouse10.weight);
		System.out.println("Gaming :"+mouse10.gaming);
		System.out.println("Shape :"+mouse10.shape);
		System.out.println("Buttons :"+mouse10.buttons);
		System.out.println("Battery :"+mouse10.batteryLife);
		System.out.println("Origin :"+mouse10.origin);
		System.out.println("RGB :"+mouse10.rgb);
		System.out.println("Compatibility :"+mouse10.compatibility);
		System.out.println("\n");
		
}}