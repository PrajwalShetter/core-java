class PenDriveRunner{

	public static void main(String[] args){

		int size = PenDrive.getSizeByBrand("SanDisk");
		System.out.println(size);

		size = PenDrive.getSizeByBrand("HP");
		System.out.println(size);

		size = PenDrive.getSizeByBrand("Sony");
		System.out.println(size);

		size = PenDrive.getSizeByBrand("Kingston");
		System.out.println(size);

		size = PenDrive.getSizeByBrand("Transcend");
		System.out.println(size);

	}
}