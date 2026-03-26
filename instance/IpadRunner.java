class IpadRunner {

	public static void main(String[] args){

		Ipad ipad9thGen = new Ipad();

		System.out.println("Default Values: ");
		System.out.println("Model = "+ ipad9thGen.model + " \n Color = " + ipad9thGen.color + " \n Price = " + ipad9thGen.price + " \n PencilSupport = " + ipad9thGen.hasPencilSupport + " \n Storage = " + ipad9thGen.storage+"\n");

		ipad9thGen.model="iPad 9th Gen";
		ipad9thGen.color="Space Gray";
		ipad9thGen.price=30000;
		ipad9thGen.hasPencilSupport=true;
		ipad9thGen.storage=64;

		System.out.println("Updated Values:");
		System.out.println("Model = "+ipad9thGen.model + " \n Color = " + ipad9thGen.color + " \n Price =" + ipad9thGen.price + "\n PencilSupport= " + ipad9thGen.hasPencilSupport + "\n Storage = " + ipad9thGen.storage+"\n");


		Ipad ipadAir = new Ipad();

		System.out.println("Default Values: ");
		System.out.println("Model = "+ ipadAir.model + " \n Color = " + ipadAir.color + " \n Price = " + ipadAir.price + " \n PencilSupport = " + ipadAir.hasPencilSupport + " \n Storage = " + ipadAir.storage+"\n");

		ipadAir.model="iPad Air";
		ipadAir.color="Blue";
		ipadAir.price=55000;
		ipadAir.hasPencilSupport=true;
		ipadAir.storage=128;

		System.out.println("Updated Values:");
		System.out.println("Model = "+ipadAir.model + " \n Color = " + ipadAir.color + " \n Price =" + ipadAir.price + "\n PencilSupport= " + ipadAir.hasPencilSupport + "\n Storage = " + ipadAir.storage+"\n");


		Ipad ipadPro = new Ipad();

		System.out.println("Default Values: ");
		System.out.println("Model = "+ ipadPro.model + " \n Color = " + ipadPro.color + " \n Price = " + ipadPro.price + " \n PencilSupport = " + ipadPro.hasPencilSupport + " \n Storage = " + ipadPro.storage+"\n");

		ipadPro.model="iPad Pro";
		ipadPro.color="Silver";
		ipadPro.price=80000;
		ipadPro.hasPencilSupport=true;
		ipadPro.storage=256;

		System.out.println("Updated Values:");
		System.out.println("Model = "+ipadPro.model + " \n Color = " + ipadPro.color + " \n Price =" + ipadPro.price + "\n PencilSupport= " + ipadPro.hasPencilSupport + "\n Storage = " + ipadPro.storage+"\n");


		Ipad ipadMini = new Ipad();

		System.out.println("Default Values: ");
		System.out.println("Model = "+ ipadMini.model + " \n Color = " + ipadMini.color + " \n Price = " + ipadMini.price + " \n PencilSupport = " + ipadMini.hasPencilSupport + " \n Storage = " + ipadMini.storage+"\n");

		ipadMini.model="iPad Mini";
		ipadMini.color="Purple";
		ipadMini.price=50000;
		ipadMini.hasPencilSupport=true;
		ipadMini.storage=128;

		System.out.println("Updated Values:");
		System.out.println("Model = "+ipadMini.model + " \n Color = " + ipadMini.color + " \n Price =" + ipadMini.price + "\n PencilSupport= " + ipadMini.hasPencilSupport + "\n Storage = " + ipadMini.storage+"\n");


		Ipad ipad10thGen = new Ipad();

		System.out.println("Default Values: ");
		System.out.println("Model = "+ ipad10thGen.model + " \n Color = " + ipad10thGen.color + " \n Price = " + ipad10thGen.price + " \n PencilSupport = " + ipad10thGen.hasPencilSupport + " \n Storage = " + ipad10thGen.storage+"\n");

		ipad10thGen.model="iPad 10th Gen";
		ipad10thGen.color="Yellow";
		ipad10thGen.price=45000;
		ipad10thGen.hasPencilSupport=true;
		ipad10thGen.storage=64;

		System.out.println("Updated Values:");
		System.out.println("Model = "+ipad10thGen.model + " \n Color = " + ipad10thGen.color + " \n Price =" + ipad10thGen.price + "\n PencilSupport= " + ipad10thGen.hasPencilSupport + "\n Storage = " + ipad10thGen.storage+"\n");

	}
}