class GraphicCardRunner{
	
	public static void main(String[] args){
		
		System.out.println("Brand :"+GraphicCard.brand);
		System.out.println("Color :"+GraphicCard.color);
		System.out.println("Price :"+GraphicCard.price);
		System.out.println("Dedicated :"+GraphicCard.isDedicated);
		System.out.println("Memory :"+GraphicCard.memory);
		System.out.println("\n");
		
		
		GraphicCard gc1 = new GraphicCard();
		System.out.println("This is First GraphicCard \n");

		gc1.model = "RTX 3060";
		gc1.chipset = "Ampere";
		gc1.clockSpeed = 1.78;
		gc1.rayTracing = true;
		gc1.coolingType = "Dual Fan";
		gc1.ports = 3;
		gc1.powerConsumption = 170;
		gc1.origin = "USA";
		gc1.overclocked = false;
		gc1.compatibility = "Windows";

		System.out.println("Model :"+gc1.model);
		System.out.println("Chipset :"+gc1.chipset);
		System.out.println("Clock :"+gc1.clockSpeed);
		System.out.println("RayTracing :"+gc1.rayTracing);
		System.out.println("Cooling :"+gc1.coolingType);
		System.out.println("Ports :"+gc1.ports);
		System.out.println("Power :"+gc1.powerConsumption);
		System.out.println("Origin :"+gc1.origin);
		System.out.println("Overclocked :"+gc1.overclocked);
		System.out.println("Compatibility :"+gc1.compatibility);
		System.out.println("\n");


		GraphicCard gc2 = new GraphicCard();
		System.out.println("This is Second GraphicCard \n");

		gc2.model = "RTX 3070";
		gc2.chipset = "Ampere";
		gc2.clockSpeed = 1.73;
		gc2.rayTracing = true;
		gc2.coolingType = "Triple Fan";
		gc2.ports = 4;
		gc2.powerConsumption = 220;
		gc2.origin = "China";
		gc2.overclocked = true;
		gc2.compatibility = "Windows";

		System.out.println("Model :"+gc2.model);
		System.out.println("Chipset :"+gc2.chipset);
		System.out.println("Clock :"+gc2.clockSpeed);
		System.out.println("RayTracing :"+gc2.rayTracing);
		System.out.println("Cooling :"+gc2.coolingType);
		System.out.println("Ports :"+gc2.ports);
		System.out.println("Power :"+gc2.powerConsumption);
		System.out.println("Origin :"+gc2.origin);
		System.out.println("Overclocked :"+gc2.overclocked);
		System.out.println("Compatibility :"+gc2.compatibility);
		System.out.println("\n");
		
		GraphicCard gc3 = new GraphicCard();
System.out.println("This is Third GraphicCard \n");

gc3.model = "GTX 1660";
gc3.chipset = "Turing";
gc3.clockSpeed = 1.53;
gc3.rayTracing = false;
gc3.coolingType = "Single Fan";
gc3.ports = 2;
gc3.powerConsumption = 120;
gc3.origin = "Taiwan";
gc3.overclocked = false;
gc3.compatibility = "Windows";

System.out.println("Model :"+gc3.model);
System.out.println("Chipset :"+gc3.chipset);
System.out.println("Clock :"+gc3.clockSpeed);
System.out.println("RayTracing :"+gc3.rayTracing);
System.out.println("Cooling :"+gc3.coolingType);
System.out.println("Ports :"+gc3.ports);
System.out.println("Power :"+gc3.powerConsumption);
System.out.println("Origin :"+gc3.origin);
System.out.println("Overclocked :"+gc3.overclocked);
System.out.println("Compatibility :"+gc3.compatibility);
System.out.println("\n");

GraphicCard gc4 = new GraphicCard();
System.out.println("This is Fourth GraphicCard \n");

gc4.model = "RTX 3080";
gc4.chipset = "Ampere";
gc4.clockSpeed = 1.71;
gc4.rayTracing = true;
gc4.coolingType = "Triple Fan";
gc4.ports = 4;
gc4.powerConsumption = 320;
gc4.origin = "USA";
gc4.overclocked = true;
gc4.compatibility = "Windows";

System.out.println("Model :"+gc4.model);
System.out.println("Chipset :"+gc4.chipset);
System.out.println("Clock :"+gc4.clockSpeed);
System.out.println("RayTracing :"+gc4.rayTracing);
System.out.println("Cooling :"+gc4.coolingType);
System.out.println("Ports :"+gc4.ports);
System.out.println("Power :"+gc4.powerConsumption);
System.out.println("Origin :"+gc4.origin);
System.out.println("Overclocked :"+gc4.overclocked);
System.out.println("Compatibility :"+gc4.compatibility);
System.out.println("\n");

GraphicCard gc5 = new GraphicCard();
System.out.println("This is Fifth GraphicCard \n");

gc5.model = "RX 6600";
gc5.chipset = "RDNA2";
gc5.clockSpeed = 1.62;
gc5.rayTracing = true;
gc5.coolingType = "Dual Fan";
gc5.ports = 3;
gc5.powerConsumption = 132;
gc5.origin = "USA";
gc5.overclocked = false;
gc5.compatibility = "Linux";

System.out.println("Model :"+gc5.model);
System.out.println("Chipset :"+gc5.chipset);
System.out.println("Clock :"+gc5.clockSpeed);
System.out.println("RayTracing :"+gc5.rayTracing);
System.out.println("Cooling :"+gc5.coolingType);
System.out.println("Ports :"+gc5.ports);
System.out.println("Power :"+gc5.powerConsumption);
System.out.println("Origin :"+gc5.origin);
System.out.println("Overclocked :"+gc5.overclocked);
System.out.println("Compatibility :"+gc5.compatibility);
System.out.println("\n");

GraphicCard gc6 = new GraphicCard();
System.out.println("This is Sixth GraphicCard \n");

gc6.model = "RTX 3050";
gc6.chipset = "Ampere";
gc6.clockSpeed = 1.55;
gc6.rayTracing = true;
gc6.coolingType = "Dual Fan";
gc6.ports = 3;
gc6.powerConsumption = 130;
gc6.origin = "China";
gc6.overclocked = false;
gc6.compatibility = "Windows";

System.out.println("Model :"+gc6.model);
System.out.println("Chipset :"+gc6.chipset);
System.out.println("Clock :"+gc6.clockSpeed);
System.out.println("RayTracing :"+gc6.rayTracing);
System.out.println("Cooling :"+gc6.coolingType);
System.out.println("Ports :"+gc6.ports);
System.out.println("Power :"+gc6.powerConsumption);
System.out.println("Origin :"+gc6.origin);
System.out.println("Overclocked :"+gc6.overclocked);
System.out.println("Compatibility :"+gc6.compatibility);
System.out.println("\n");

GraphicCard gc7 = new GraphicCard();
System.out.println("This is Seventh GraphicCard \n");

gc7.model = "RTX 3090";
gc7.chipset = "Ampere";
gc7.clockSpeed = 1.70;
gc7.rayTracing = true;
gc7.coolingType = "Triple Fan";
gc7.ports = 4;
gc7.powerConsumption = 350;
gc7.origin = "USA";
gc7.overclocked = true;
gc7.compatibility = "Windows";

System.out.println("Model :"+gc7.model);
System.out.println("Chipset :"+gc7.chipset);
System.out.println("Clock :"+gc7.clockSpeed);
System.out.println("RayTracing :"+gc7.rayTracing);
System.out.println("Cooling :"+gc7.coolingType);
System.out.println("Ports :"+gc7.ports);
System.out.println("Power :"+gc7.powerConsumption);
System.out.println("Origin :"+gc7.origin);
System.out.println("Overclocked :"+gc7.overclocked);
System.out.println("Compatibility :"+gc7.compatibility);
System.out.println("\n");

GraphicCard gc8 = new GraphicCard();
System.out.println("This is Eighth GraphicCard \n");

gc8.model = "RX 6700 XT";
gc8.chipset = "RDNA2";
gc8.clockSpeed = 2.42;
gc8.rayTracing = true;
gc8.coolingType = "Dual Fan";
gc8.ports = 3;
gc8.powerConsumption = 230;
gc8.origin = "USA";
gc8.overclocked = true;
gc8.compatibility = "Linux";

System.out.println("Model :"+gc8.model);
System.out.println("Chipset :"+gc8.chipset);
System.out.println("Clock :"+gc8.clockSpeed);
System.out.println("RayTracing :"+gc8.rayTracing);
System.out.println("Cooling :"+gc8.coolingType);
System.out.println("Ports :"+gc8.ports);
System.out.println("Power :"+gc8.powerConsumption);
System.out.println("Origin :"+gc8.origin);
System.out.println("Overclocked :"+gc8.overclocked);
System.out.println("Compatibility :"+gc8.compatibility);
System.out.println("\n");

GraphicCard gc9 = new GraphicCard();
System.out.println("This is Ninth GraphicCard \n");

gc9.model = "GTX 1050 Ti";
gc9.chipset = "Pascal";
gc9.clockSpeed = 1.29;
gc9.rayTracing = false;
gc9.coolingType = "Single Fan";
gc9.ports = 2;
gc9.powerConsumption = 75;
gc9.origin = "Taiwan";
gc9.overclocked = false;
gc9.compatibility = "Windows";

System.out.println("Model :"+gc9.model);
System.out.println("Chipset :"+gc9.chipset);
System.out.println("Clock :"+gc9.clockSpeed);
System.out.println("RayTracing :"+gc9.rayTracing);
System.out.println("Cooling :"+gc9.coolingType);
System.out.println("Ports :"+gc9.ports);
System.out.println("Power :"+gc9.powerConsumption);
System.out.println("Origin :"+gc9.origin);
System.out.println("Overclocked :"+gc9.overclocked);
System.out.println("Compatibility :"+gc9.compatibility);
System.out.println("\n");

GraphicCard gc10 = new GraphicCard();
System.out.println("This is Tenth GraphicCard \n");

gc10.model = "RX 580";
gc10.chipset = "Polaris";
gc10.clockSpeed = 1.34;
gc10.rayTracing = false;
gc10.coolingType = "Dual Fan";
gc10.ports = 3;
gc10.powerConsumption = 185;
gc10.origin = "China";
gc10.overclocked = false;
gc10.compatibility = "Windows";

System.out.println("Model :"+gc10.model);
System.out.println("Chipset :"+gc10.chipset);
System.out.println("Clock :"+gc10.clockSpeed);
System.out.println("RayTracing :"+gc10.rayTracing);
System.out.println("Cooling :"+gc10.coolingType);
System.out.println("Ports :"+gc10.ports);
System.out.println("Power :"+gc10.powerConsumption);
System.out.println("Origin :"+gc10.origin);
System.out.println("Overclocked :"+gc10.overclocked);
System.out.println("Compatibility :"+gc10.compatibility);
System.out.println("\n");

}}
