class PenDrive{

	static int getSizeByBrand(String brand){

		System.out.println("Executing getSizeByBrand "+brand);

		if("SanDisk" == brand){
			System.out.println("The Size of "+brand+" PenDrive is 32GB");
			return 32;
		}
		if("HP" == brand){
			System.out.println("The Size of "+brand+" PenDrive is 16GB");
			return 16;
		}
		if("Sony" == brand){
			System.out.println("The Size of "+brand+" PenDrive is 64GB");
			return 64;
		}
		if("Kingston" == brand){
			System.out.println("The Size of "+brand+" PenDrive is 128GB");
			return 128;
		}
		if("Transcend" == brand){
			System.out.println("The Size of "+brand+" PenDrive is 8GB");
			return 8;
		}

		System.out.println("Brand is not matching");
		return 0;
	}
}