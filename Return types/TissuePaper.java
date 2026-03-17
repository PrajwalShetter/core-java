/*
Create below classes , then declare static method with takes a parameter and returns ref's based on conditions 
TissuePaper: thickness return the price: 10 
Tyre: 1. brand and size return price : 12
 WaterMelon : quantity return price : 10
 PenDrive: brand return the size : 5 
 Ticket : 1. by place return ticket price : 30 
		  2. by movie and seat type and theater return price: 50 
		  3. by name return email : 15 
		  4. by name return mobile number : 15 
FoodItem : by Item return price : 20



class TissuePaper{
 
	static double getPriceByThickness(float thick)
	{
		System.out.println("Executing method getPriceByThickness "+ thick);
	 
		if(0.5f == thick){
			System.out.println("The Price of "+thick+" thickness tissuePaper is : 20");
			return 20.0;
		}
		if(0.7f == thick){
			System.out.println("The Price of "+thick+" thickness tissuePaper is : 25");
			return 25.0;
		}
		if(1.0f == thick){
			System.out.println("The Price of "+thick+" thickness tissuePaper is : 30");
			return 30.0;
		}
		if(1.2f == thick){
			System.out.println("The Price of "+thick+" thickness tissuePaper is : 35");
			return 35.0;
		}
		if(1.5f == thick){
			System.out.println("The Price of "+thick+" thickness tissuePaper is : 40");
			return 40.0;
		}
		else{
			System.out.println("Thickness is not matching");
		}
		return 0;
	}
}