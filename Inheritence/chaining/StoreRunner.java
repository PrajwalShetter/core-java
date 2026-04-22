/*
Declare below 13 classes 
5 Classes declare 5 instance variables 
2 classes show this chaining 
3 classses show super chaining 
1 class declare as final 
1 class decare a final variable , 

init with const 6 classes declare 5 instance methods. 
Declare subclasses for this 6 parent, override 3 methods. Create two instances of subclass , 
invoke all the 5 methods //override 
Store,Coin,Stock,Hospital,Temple,Restaurant, Candle,FarmHouse,Sock,Tape,Podium,Ipod,Paint,UPS,StopWatch,Jersey,Mic

*/


class StoreRunner{
	
	public static void main(String[] args){
		
		MilkStore milkstore1 = new MilkStore("Nandini", "Koppal", 50, 20000.0, true);
		MilkStore milkstore2 = new MilkStore("Heritage", "Hubli", 30, 15000.0, false);
		
		milkstore1.display();
		milkstore2.display();
	}
}
