class DynamoRunner{
	
	public static void main(String[] args){
		
		Dynamo dynamo = new Dynamo();
		dynamo.save("Bicycle Dynamo");
		dynamo.save("Hub Dynamo");
		dynamo.save("Bottle Dynamo");
		dynamo.save("Wind Dynamo");
		dynamo.save("Hand Dynamo");
		
		dynamo.search("Hub Dynamo");
		dynamo.search("Solar Dynamo");
	}
}