class FlightRunner {

	public static void main(String[] args){

		Flight flightOne = new Flight();

		System.out.println("Default Values: ");
		System.out.println("Airline = "+ flightOne.airline + " \n Source = " + flightOne.source + " \n Destination = " + flightOne.destination + " \n Price = " + flightOne.price + " \n International = " + flightOne.isInternational+"\n");

		flightOne.airline="IndiGo";
		flightOne.source="Bangalore";
		flightOne.destination="Delhi";
		flightOne.price=5000;
		flightOne.isInternational=false;

		System.out.println("Updated Values:");
		System.out.println("Airline = "+flightOne.airline + " \n Source = " + flightOne.source + " \n Destination =" + flightOne.destination + "\n Price= " + flightOne.price + "\n International = " + flightOne.isInternational+"\n");


		Flight flightTwo = new Flight();

		System.out.println("Default Values: ");
		System.out.println("Airline = "+ flightTwo.airline + " \n Source = " + flightTwo.source + " \n Destination = " + flightTwo.destination + " \n Price = " + flightTwo.price + " \n International = " + flightTwo.isInternational+"\n");

		flightTwo.airline="Air India";
		flightTwo.source="Mumbai";
		flightTwo.destination="Dubai";
		flightTwo.price=20000;
		flightTwo.isInternational=true;

		System.out.println("Updated Values:");
		System.out.println("Airline = "+flightTwo.airline + " \n Source = " + flightTwo.source + " \n Destination =" + flightTwo.destination + "\n Price= " + flightTwo.price + "\n International = " + flightTwo.isInternational+"\n");


		Flight flightThree = new Flight();

		System.out.println("Default Values: ");
		System.out.println("Airline = "+ flightThree.airline + " \n Source = " + flightThree.source + " \n Destination = " + flightThree.destination + " \n Price = " + flightThree.price + " \n International = " + flightThree.isInternational+"\n");

		flightThree.airline="SpiceJet";
		flightThree.source="Chennai";
		flightThree.destination="Hyderabad";
		flightThree.price=4000;
		flightThree.isInternational=false;

		System.out.println("Updated Values:");
		System.out.println("Airline = "+flightThree.airline + " \n Source = " + flightThree.source + " \n Destination =" + flightThree.destination + "\n Price= " + flightThree.price + "\n International = " + flightThree.isInternational+"\n");


		Flight flightFour = new Flight();

		System.out.println("Default Values: ");
		System.out.println("Airline = "+ flightFour.airline + " \n Source = " + flightFour.source + " \n Destination = " + flightFour.destination + " \n Price = " + flightFour.price + " \n International = " + flightFour.isInternational+"\n");

		flightFour.airline="Emirates";
		flightFour.source="Delhi";
		flightFour.destination="London";
		flightFour.price=60000;
		flightFour.isInternational=true;

		System.out.println("Updated Values:");
		System.out.println("Airline = "+flightFour.airline + " \n Source = " + flightFour.source + " \n Destination =" + flightFour.destination + "\n Price= " + flightFour.price + "\n International = " + flightFour.isInternational+"\n");


		Flight flightFive = new Flight();

		System.out.println("Default Values: ");
		System.out.println("Airline = "+ flightFive.airline + " \n Source = " + flightFive.source + " \n Destination = " + flightFive.destination + " \n Price = " + flightFive.price + " \n International = " + flightFive.isInternational+"\n");

		flightFive.airline="Qatar Airways";
		flightFive.source="Bangalore";
		flightFive.destination="Doha";
		flightFive.price=45000;
		flightFive.isInternational=true;

		System.out.println("Updated Values:");
		System.out.println("Airline = "+flightFive.airline + " \n Source = " + flightFive.source + " \n Destination =" + flightFive.destination + "\n Price= " + flightFive.price + "\n International = " + flightFive.isInternational+"\n");

	}
}