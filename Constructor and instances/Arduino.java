class Arduino {
	 
	 long id;
	 String boardName;
	 String microcontroller;
	 int digitalPins;
	 String voltage;
	 boolean wifi;
	 int analogPins;
	 String connectivity;
	 String origin;
	 double weight;
	 double clockSpeed;
	 double memory;
	 boolean bluetooth;
	 int pwmPins;
	 String architecture;
	 String material;
	 boolean usbSupport;
	 String programmingLanguage;
	 String availability;
	 boolean openSource;
	 String usage;
	 
	 
	 Arduino(){
		 
		 id = 44556677L;
		 boardName = "Arduino Uno";
		 microcontroller = "ATmega328P";
		 digitalPins = 14;
		 voltage = "5V";
		 wifi = false;
		 analogPins = 6;
		 connectivity = "USB";
		 origin = "Italy";
		 weight = 25.0;
		 clockSpeed = 16;
		 memory = 32;
		 bluetooth = false;
		 pwmPins = 6;
		 architecture = "AVR";
		 material = "PCB";
		 usbSupport = true;
		 programmingLanguage = "C++";
		 availability = "Available";
		 openSource = true;
		 usage = "Prototyping";
	 }
}