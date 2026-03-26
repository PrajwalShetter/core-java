class SteelRunner {

	public static void main(String[] args){

		Steel carbonSteel = new Steel();

		System.out.println("Default Values: ");
		System.out.println("Type = "+ carbonSteel.type + " \n Grade = " + carbonSteel.grade + " \n Weight = " + carbonSteel.weight + " \n Alloy = " + carbonSteel.isAlloy + " \n Price = " + carbonSteel.price+"\n");

		carbonSteel.type="Carbon Steel";
		carbonSteel.grade="A";
		carbonSteel.weight=50.5;
		carbonSteel.isAlloy=false;
		carbonSteel.price=60000;

		System.out.println("Updated Values:");
		System.out.println("Type = "+carbonSteel.type + " \n Grade = " + carbonSteel.grade + " \n Weight =" + carbonSteel.weight + "\n Alloy= " + carbonSteel.isAlloy + "\n Price = " + carbonSteel.price+"\n");


		Steel stainlessSteel = new Steel();

		System.out.println("Default Values: ");
		System.out.println("Type = "+ stainlessSteel.type + " \n Grade = " + stainlessSteel.grade + " \n Weight = " + stainlessSteel.weight + " \n Alloy = " + stainlessSteel.isAlloy + " \n Price = " + stainlessSteel.price+"\n");

		stainlessSteel.type="Stainless Steel";
		stainlessSteel.grade="B";
		stainlessSteel.weight=40.0;
		stainlessSteel.isAlloy=true;
		stainlessSteel.price=80000;

		System.out.println("Updated Values:");
		System.out.println("Type = "+stainlessSteel.type + " \n Grade = " + stainlessSteel.grade + " \n Weight =" + stainlessSteel.weight + "\n Alloy= " + stainlessSteel.isAlloy + "\n Price = " + stainlessSteel.price+"\n");


		Steel alloySteel = new Steel();

		System.out.println("Default Values: ");
		System.out.println("Type = "+ alloySteel.type + " \n Grade = " + alloySteel.grade + " \n Weight = " + alloySteel.weight + " \n Alloy = " + alloySteel.isAlloy + " \n Price = " + alloySteel.price+"\n");

		alloySteel.type="Alloy Steel";
		alloySteel.grade="C";
		alloySteel.weight=60.0;
		alloySteel.isAlloy=true;
		alloySteel.price=90000;

		System.out.println("Updated Values:");
		System.out.println("Type = "+alloySteel.type + " \n Grade = " + alloySteel.grade + " \n Weight =" + alloySteel.weight + "\n Alloy= " + alloySteel.isAlloy + "\n Price = " + alloySteel.price+"\n");


		Steel toolSteel = new Steel();

		System.out.println("Default Values: ");
		System.out.println("Type = "+ toolSteel.type + " \n Grade = " + toolSteel.grade + " \n Weight = " + toolSteel.weight + " \n Alloy = " + toolSteel.isAlloy + " \n Price = " + toolSteel.price+"\n");

		toolSteel.type="Tool Steel";
		toolSteel.grade="D";
		toolSteel.weight=55.0;
		toolSteel.isAlloy=true;
		toolSteel.price=75000;

		System.out.println("Updated Values:");
		System.out.println("Type = "+toolSteel.type + " \n Grade = " + toolSteel.grade + " \n Weight =" + toolSteel.weight + "\n Alloy= " + toolSteel.isAlloy + "\n Price = " + toolSteel.price+"\n");


		Steel mildSteel = new Steel();

		System.out.println("Default Values: ");
		System.out.println("Type = "+ mildSteel.type + " \n Grade = " + mildSteel.grade + " \n Weight = " + mildSteel.weight + " \n Alloy = " + mildSteel.isAlloy + " \n Price = " + mildSteel.price+"\n");

		mildSteel.type="Mild Steel";
		mildSteel.grade="E";
		mildSteel.weight=45.0;
		mildSteel.isAlloy=false;
		mildSteel.price=50000;

		System.out.println("Updated Values:");
		System.out.println("Type = "+mildSteel.type + " \n Grade = " + mildSteel.grade + " \n Weight =" + mildSteel.weight + "\n Alloy= " + mildSteel.isAlloy + "\n Price = " + mildSteel.price+"\n");

	}
}