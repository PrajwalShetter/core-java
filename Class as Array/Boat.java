/*
Declare below classes , then declare least 5 variables. Make sure one is enum in each class then add info method to display all variables,
 make sure to init three using constuctor and two using ref 
 NailCutter,Duster,File,Player,Pearl,IronMan,Hammer, Starter,Boat,LightHouse

 Declare below classes and design accordingly . Make sure [] type is init with least three elements 
 Shop : name,address,NailCutter[] , declare info method and display the details;
 Classroom: number,floorNo,Duster[]
 Folder: name,classification,path,File[] 
 Box: weight,leghth,height,Pearl[] 
 SeaShore: name,countryName,LightHouse[]
 */
 
 class Boat{
	 
	 String regNo;
	 String driverName;
	 Passenger[] passenger;
	 
	 
	 Boat(String regNo, String driverName, Passenger[] passenger){
		 
		 this.regNo = regNo;
		 this.driverName = driverName;
		 this.passenger = passenger;
		 
	 }
	 
	 void display(){
		 
		System.out.println("regNo :"+this.regNo);
		System.out.println("driverName :"+this.driverName);
		System.out.println("Passengers details :");
		if(this.passenger != null){
			
			for(Passenger passenger : this.passenger){
				
			if(passenger != null){
				passenger.display();
			}
			}
			
		}
	 }
	 
 }