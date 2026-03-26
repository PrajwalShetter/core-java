class FlagRunner {
	
	public static void main(String[] args){
		
		Flag f1 = new Flag();
		
		
		System.out.println("Default Values: ");
		System.out.println("Country = "+ f1.country + " \n Color = " + f1.color + " \n Stripes = " + f1.stripes + " \n Symbol = " + f1.hasSymbol + " \n Size = " + f1.size+"\n");
		
		f1.country="India"; 
		f1.color="Tricolor";
		f1.stripes=3;
		f1.hasSymbol=true;
		f1.size=1.5;
		System.out.println("Updated Values:");
		System.out.println("Country = "+f1.country + " \n Color = " + f1.color + " \n stripes =" + f1.stripes + "\n Symbol= " + f1.hasSymbol + "\n Size = " + f1.size+"\n");
		
		Flag f2 = new Flag();

System.out.println("Default Values: ");
System.out.println("Country = "+ f2.country + " \n Color = " + f2.color + " \n Stripes = " + f2.stripes + " \n Symbol = " + f2.hasSymbol + " \n Size = " + f2.size+"\n");

f2.country="USA"; 
f2.color="Red White Blue";
f2.stripes=13;
f2.hasSymbol=true;
f2.size=2.0;

System.out.println("Updated Values:");
System.out.println("Country = "+f2.country + " \n Color = " + f2.color + " \n stripes =" + f2.stripes + "\n Symbol= " + f2.hasSymbol + "\n Size = " + f2.size+"\n");


Flag f3 = new Flag();

System.out.println("Default Values: ");
System.out.println("Country = "+ f3.country + " \n Color = " + f3.color + " \n Stripes = " + f3.stripes + " \n Symbol = " + f3.hasSymbol + " \n Size = " + f3.size+"\n");

f3.country="Japan"; 
f3.color="White Red";
f3.stripes=0;
f3.hasSymbol=true;
f3.size=1.2;

System.out.println("Updated Values:");
System.out.println("Country = "+f3.country + " \n Color = " + f3.color + " \n stripes =" + f3.stripes + "\n Symbol= " + f3.hasSymbol + "\n Size = " + f3.size+"\n");


Flag f4 = new Flag();

System.out.println("Default Values: ");
System.out.println("Country = "+ f4.country + " \n Color = " + f4.color + " \n Stripes = " + f4.stripes + " \n Symbol = " + f4.hasSymbol + " \n Size = " + f4.size+"\n");

f4.country="Germany"; 
f4.color="Black Red Yellow";
f4.stripes=3;
f4.hasSymbol=false;
f4.size=1.8;

System.out.println("Updated Values:");
System.out.println("Country = "+f4.country + " \n Color = " + f4.color + " \n stripes =" + f4.stripes + "\n Symbol= " + f4.hasSymbol + "\n Size = " + f4.size+"\n");


Flag f5 = new Flag();

System.out.println("Default Values: ");
System.out.println("Country = "+ f5.country + " \n Color = " + f5.color + " \n Stripes = " + f5.stripes + " \n Symbol = " + f5.hasSymbol + " \n Size = " + f5.size+"\n");

f5.country="France"; 
f5.color="Blue White Red";
f5.stripes=3;
f5.hasSymbol=false;
f5.size=1.7;

System.out.println("Updated Values:");
System.out.println("Country = "+f5.country + " \n Color = " + f5.color + " \n stripes =" + f5.stripes + "\n Symbol= " + f5.hasSymbol + "\n Size = " + f5.size+"\n");
	}
}