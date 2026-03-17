class TyreRunner{

	public static void main(String[] args){

		double price = Tyre.getPriceByBrandAndSize("MRF",15);
		System.out.println(price);

		price = Tyre.getPriceByBrandAndSize("CEAT",14);
		System.out.println(price);

		price = Tyre.getPriceByBrandAndSize("Apollo",16);
		System.out.println(price);

		price = Tyre.getPriceByBrandAndSize("JK",13);
		System.out.println(price);

		price = Tyre.getPriceByBrandAndSize("Bridgestone",17);
		System.out.println(price);

		price = Tyre.getPriceByBrandAndSize("Michelin",18);
		System.out.println(price);

		price = Tyre.getPriceByBrandAndSize("Goodyear",16);
		System.out.println(price);

		price = Tyre.getPriceByBrandAndSize("Yokohama",17);
		System.out.println(price);

		String brand = "MRF";
		int size = 13;
		price = Tyre.getPriceByBrandAndSize(brand,size);
		System.out.println(price);

		brand = "CEAT";
		size = 15;
		price = Tyre.getPriceByBrandAndSize(brand,size);
		System.out.println(price);

		brand = "Apollo";
		size = 14;
		price = Tyre.getPriceByBrandAndSize(brand,size);
		System.out.println(price);

		brand = "JK";
		size = 16;
		price = Tyre.getPriceByBrandAndSize(brand,size);
		System.out.println(price);

	}
}