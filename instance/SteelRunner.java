class SteelRunner {

	public static void main(String[] args){

		Steel s1 = new Steel();

		System.out.println("Default Values: ");
		System.out.println("Type = "+ s1.type + " \n Grade = " + s1.grade + " \n Weight = " + s1.weight + " \n Alloy = " + s1.isAlloy + " \n Price = " + s1.price+"\n");

		s1.type="Carbon Steel";
		s1.grade="A";
		s1.weight=50.5;
		s1.isAlloy=false;
		s1.price=60000;

		System.out.println("Updated Values:");
		System.out.println("Type = "+s1.type + " \n Grade = " + s1.grade + " \n Weight =" + s1.weight + "\n Alloy= " + s1.isAlloy + "\n Price = " + s1.price+"\n");


		Steel s2 = new Steel();

		System.out.println("Default Values: ");
		System.out.println("Type = "+ s2.type + " \n Grade = " + s2.grade + " \n Weight = " + s2.weight + " \n Alloy = " + s2.isAlloy + " \n Price = " + s2.price+"\n");

		s2.type="Stainless Steel";
		s2.grade="B";
		s2.weight=40.0;
		s2.isAlloy=true;
		s2.price=80000;

		System.out.println("Updated Values:");
		System.out.println("Type = "+s2.type + " \n Grade = " + s2.grade + " \n Weight =" + s2.weight + "\n Alloy= " + s2.isAlloy + "\n Price = " + s2.price+"\n");


		Steel s3 = new Steel();

		System.out.println("Default Values: ");
		System.out.println("Type = "+ s3.type + " \n Grade = " + s3.grade + " \n Weight = " + s3.weight + " \n Alloy = " + s3.isAlloy + " \n Price = " + s3.price+"\n");

		s3.type="Alloy Steel";
		s3.grade="C";
		s3.weight=60.0;
		s3.isAlloy=true;
		s3.price=90000;

		System.out.println("Updated Values:");
		System.out.println("Type = "+s3.type + " \n Grade = " + s3.grade + " \n Weight =" + s3.weight + "\n Alloy= " + s3.isAlloy + "\n Price = " + s3.price+"\n");


		Steel s4 = new Steel();

		System.out.println("Default Values: ");
		System.out.println("Type = "+ s4.type + " \n Grade = " + s4.grade + " \n Weight = " + s4.weight + " \n Alloy = " + s4.isAlloy + " \n Price = " + s4.price+"\n");

		s4.type="Tool Steel";
		s4.grade="D";
		s4.weight=55.0;
		s4.isAlloy=true;
		s4.price=75000;

		System.out.println("Updated Values:");
		System.out.println("Type = "+s4.type + " \n Grade = " + s4.grade + " \n Weight =" + s4.weight + "\n Alloy= " + s4.isAlloy + "\n Price = " + s4.price+"\n");


		Steel s5 = new Steel();

		System.out.println("Default Values: ");
		System.out.println("Type = "+ s5.type + " \n Grade = " + s5.grade + " \n Weight = " + s5.weight + " \n Alloy = " + s5.isAlloy + " \n Price = " + s5.price+"\n");

		s5.type="Mild Steel";
		s5.grade="E";
		s5.weight=45.0;
		s5.isAlloy=false;
		s5.price=50000;

		System.out.println("Updated Values:");
		System.out.println("Type = "+s5.type + " \n Grade = " + s5.grade + " \n Weight =" + s5.weight + "\n Alloy= " + s5.isAlloy + "\n Price = " + s5.price+"\n");

	}
}