class Passenger{
	
	String name;
	IdProof idProof;
	String idProofNo;
	
	Passenger(String name, IdProof idProof, String idProofNo){
		
		this.name=name;
		this.idProof =idProof;
		this.idProofNo = idProofNo;
		
	}
	Passenger(){
		
	}
	
	public void display(){
		System.out.println("Name : "+this.name);
		System.out.println("idProof :"+this.idProof);
		System.out.println("idProofNo :"+this.idProofNo);
		
	}
}