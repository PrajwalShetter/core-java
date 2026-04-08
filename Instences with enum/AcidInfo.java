class AcidInfo{
	
	String lab;
	String usage;
	
	AcidInfo(String lab, String usage){
		this.lab = lab;
		this.usage = usage;
	}
	
	public void display(){
		System.out.println("lab :"+lab);
		System.out.println("usage :"+usage);
	}
	
	public Acid details(){
		Acid acid = new Acid("HCl", 1.5, true, 5);
		return acid;
	}
}

