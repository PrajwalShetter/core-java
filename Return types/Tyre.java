class Tyre{

	static double getPriceByBrandAndSize(String brand, int size){

		System.out.println("Executing getPriceByBrandAndSize "+brand+" "+size);

		if("MRF" == brand && size == 15){
			System.out.println("The Price of "+brand+" tyre with size "+size+" is 2500");
			return 2500.0;
		}
		if("CEAT" == brand && size == 14){
			System.out.println("The Price of "+brand+" tyre with size "+size+" is 2200");
			return 2200.0;
		}
		if("Apollo" == brand && size == 16){
			System.out.println("The Price of "+brand+" tyre with size "+size+" is 2800");
			return 2800.0;
		}
		if("JK" == brand && size == 13){
			System.out.println("The Price of "+brand+" tyre with size "+size+" is 2000");
			return 2000.0;
		}
		if("Bridgestone" == brand && size == 17){
			System.out.println("The Price of "+brand+" tyre with size "+size+" is 3500");
			return 3500.0;
		}
		if("Michelin" == brand && size == 18){
			System.out.println("The Price of "+brand+" tyre with size "+size+" is 4000");
			return 4000.0;
		}
		if("Goodyear" == brand && size == 16){
			System.out.println("The Price of "+brand+" tyre with size "+size+" is 3000");
			return 3000.0;
		}
		if("Yokohama" == brand && size == 17){
			System.out.println("The Price of "+brand+" tyre with size "+size+" is 3600");
			return 3600.0;
		}
		if("MRF" == brand && size == 13){
			System.out.println("The Price of "+brand+" tyre with size "+size+" is 2100");
			return 2100.0;
		}
		if("CEAT" == brand && size == 15){
			System.out.println("The Price of "+brand+" tyre with size "+size+" is 2600");
			return 2600.0;
		}
		if("Apollo" == brand && size == 14){
			System.out.println("The Price of "+brand+" tyre with size "+size+" is 2300");
			return 2300.0;
		}
		if("JK" == brand && size == 16){
			System.out.println("The Price of "+brand+" tyre with size "+size+" is 2900");
			return 2900.0;
		}

		System.out.println("Brand or Size is not matching");
		return 0;
	}
}