class Zip {
	
	static String type = "Compression";
	static String format = ".zip";
	static double maxSize = 5.0;
	static boolean encrypted = true;
	static int version = 1;
	
	String fileName;
	String compressionLevel;
	double size;
	boolean passwordProtected;
	String usage;
	int filesCount;
	double compressionRatio;
	String origin;
	boolean shareable;
	String compatibility;
}
