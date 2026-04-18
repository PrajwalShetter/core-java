class Person{
	
	public static void main(String[] args){
		
		System.out.println("Hi");
		System.out.println("Length of the array :"+args.length);
		String name = args[0];
		String age = args[1];
		System.out.println("name :"+name);
		System.out.println("age :"+age);
		
		int ref = valueofInteger(age);
		
		
	}
}