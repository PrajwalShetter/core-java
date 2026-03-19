/*
Task 3 Company-->generate()-->CEO--> supervise()-->Executive-->execute()-->Director-->decision()---> SeniorManager--> 
coOrdinate()-->Manager---> manage()---> Team-->develop() TeamLead--->guide(); SeniorEnginner--> design(); Engineer--> 
code(); DevOps-> cicd();*/

class Company{
	
	public static void main(String[] args){
		generate();
	}
	static void generate(){
		System.out.println("Company generates projects and tasks");
		CEO.supervise();
	}
}



