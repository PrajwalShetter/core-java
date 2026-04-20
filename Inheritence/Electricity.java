/*
Declare 10 things , declare two variables in each class
 Electricity,Document,Camera,Tag,TouchPad,Puzzle,Knife, Thread,DumbBell,Wood Declare sub classes for above . 
 Design cosntructor Chaining . Create two instance of each class
 */
 
 class Electricity{
	 
	 int voltage;
	 String branch;
	 
	 Electricity(int voltage, String branch){
		 this.voltage = voltage;
		 this.branch = branch;
	 }
	 
	 void display(){
		System.out.println("Voltage : " + this.voltage);
		System.out.println("Branch : " + this.branch);
	}
 }
 
 