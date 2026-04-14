class BiometricRunner{
	
	public static void main(String[] args){
		
		Biometric bio = new Biometric();
		bio.save("Fingerprint");
		bio.save("Face Scan");
		bio.save("Iris Scan");
		bio.save("Voice Recognition");
		bio.save("Palm Scan");
		
		bio.search("Face Scan");
		bio.search("DNA Scan");
	}
}