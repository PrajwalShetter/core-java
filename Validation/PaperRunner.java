class Paper{

	static void details(double height,double weight,int cost,boolean goodQuality,double width){

		System.out.println("Height :"+height);
		if(height>=10 && height<=40){
			System.out.println("Height is within the expected range for paper");
		}
		else{
			System.out.println("Height does not match standard paper dimensions");
		}

		System.out.println("Weight :"+weight);
		if(weight>=40 && weight<=200){
			System.out.println("Paper weight seems appropriate");
		}
		else{
			System.out.println("Paper weight appears unusual");
		}

		System.out.println("Cost :"+cost);
		if(cost>=1 && cost<=1000){
			System.out.println("Cost looks reasonable for paper");
		}
		else{
			System.out.println("Cost seems unrealistic");
		}

		System.out.println("Good Quality :"+goodQuality);
		if(goodQuality){
			System.out.println("Paper quality is good");
		}
		else{
			System.out.println("Paper quality  not be good");
		}

		System.out.println("Width :"+width);
		if(width>=10 && width<=40){
			System.out.println("Width is suitable for standard paper");
		}
		else{
			System.out.println("Width is outside size range");
		}
	}
}

class PaperRunner{

	public static void main(String[] args){

		double height=29.7;
		double weight=80;
		int cost=250;
		boolean goodQuality=true;
		double width=21.0;

		Paper.details(height,weight,cost,goodQuality,width);

		Paper.details(30.0,70,150,true,20.5);
	}
}