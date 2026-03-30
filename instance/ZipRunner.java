class ZipRunner {

	public static void main(String[] args) {

		System.out.println("Type :" + Zip.type);
		System.out.println("Format :" + Zip.format);
		System.out.println("Max Size :" + Zip.maxSize);
		System.out.println("Encrypted :" + Zip.encrypted);
		System.out.println("Version :" + Zip.version);
		System.out.println("\n");

		
		Zip z1 = new Zip();
		System.out.println("This is First Zip \n");

		z1.fileName = "project.zip";
		z1.compressionLevel = "High";
		z1.size = 2.5;
		z1.passwordProtected = true;
		z1.usage = "Backup";
		z1.filesCount = 20;
		z1.compressionRatio = 0.5;
		z1.origin = "India";
		z1.shareable = true;
		z1.compatibility = "Windows";

		System.out.println("FileName :" + z1.fileName);
		System.out.println("CompressionLevel :" + z1.compressionLevel);
		System.out.println("Size :" + z1.size);
		System.out.println("PasswordProtected :" + z1.passwordProtected);
		System.out.println("Usage :" + z1.usage);
		System.out.println("FilesCount :" + z1.filesCount);
		System.out.println("CompressionRatio :" + z1.compressionRatio);
		System.out.println("Origin :" + z1.origin);
		System.out.println("Shareable :" + z1.shareable);
		System.out.println("Compatibility :" + z1.compatibility);
		System.out.println("\n");

		
		Zip z2 = new Zip();
		System.out.println("This is Second Zip \n");

		z2.fileName = "images.zip";
		z2.compressionLevel = "Medium";
		z2.size = 1.2;
		z2.passwordProtected = false;
		z2.usage = "Storage";
		z2.filesCount = 50;
		z2.compressionRatio = 0.6;
		z2.origin = "USA";
		z2.shareable = true;
		z2.compatibility = "Linux";

		System.out.println("FileName :" + z2.fileName);
		System.out.println("CompressionLevel :" + z2.compressionLevel);
		System.out.println("Size :" + z2.size);
		System.out.println("PasswordProtected :" + z2.passwordProtected);
		System.out.println("Usage :" + z2.usage);
		System.out.println("FilesCount :" + z2.filesCount);
		System.out.println("CompressionRatio :" + z2.compressionRatio);
		System.out.println("Origin :" + z2.origin);
		System.out.println("Shareable :" + z2.shareable);
		System.out.println("Compatibility :" + z2.compatibility);
		System.out.println("\n");

		
		Zip z3 = new Zip();
		System.out.println("This is Third Zip \n");

		z3.fileName = "docs.zip";
		z3.compressionLevel = "Low";
		z3.size = 0.8;
		z3.passwordProtected = true;
		z3.usage = "Documents";
		z3.filesCount = 15;
		z3.compressionRatio = 0.7;
		z3.origin = "UK";
		z3.shareable = true;
		z3.compatibility = "Mac";

		System.out.println("FileName :" + z3.fileName);
		System.out.println("CompressionLevel :" + z3.compressionLevel);
		System.out.println("Size :" + z3.size);
		System.out.println("PasswordProtected :" + z3.passwordProtected);
		System.out.println("Usage :" + z3.usage);
		System.out.println("FilesCount :" + z3.filesCount);
		System.out.println("CompressionRatio :" + z3.compressionRatio);
		System.out.println("Origin :" + z3.origin);
		System.out.println("Shareable :" + z3.shareable);
		System.out.println("Compatibility :" + z3.compatibility);
		System.out.println("\n");

		
		Zip z4 = new Zip();
		System.out.println("This is Fourth Zip \n");

		z4.fileName = "videos.zip";
		z4.compressionLevel = "High";
		z4.size = 4.5;
		z4.passwordProtected = false;
		z4.usage = "Media";
		z4.filesCount = 10;
		z4.compressionRatio = 0.4;
		z4.origin = "Germany";
		z4.shareable = false;
		z4.compatibility = "Windows";

		System.out.println("FileName :" + z4.fileName);
		System.out.println("CompressionLevel :" + z4.compressionLevel);
		System.out.println("Size :" + z4.size);
		System.out.println("PasswordProtected :" + z4.passwordProtected);
		System.out.println("Usage :" + z4.usage);
		System.out.println("FilesCount :" + z4.filesCount);
		System.out.println("CompressionRatio :" + z4.compressionRatio);
		System.out.println("Origin :" + z4.origin);
		System.out.println("Shareable :" + z4.shareable);
		System.out.println("Compatibility :" + z4.compatibility);
		System.out.println("\n");

		
		Zip z5 = new Zip();
		System.out.println("This is Fifth Zip \n");

		z5.fileName = "music.zip";
		z5.compressionLevel = "Medium";
		z5.size = 3.0;
		z5.passwordProtected = true;
		z5.usage = "Audio";
		z5.filesCount = 25;
		z5.compressionRatio = 0.5;
		z5.origin = "France";
		z5.shareable = true;
		z5.compatibility = "Android";

		System.out.println("FileName :" + z5.fileName);
		System.out.println("CompressionLevel :" + z5.compressionLevel);
		System.out.println("Size :" + z5.size);
		System.out.println("PasswordProtected :" + z5.passwordProtected);
		System.out.println("Usage :" + z5.usage);
		System.out.println("FilesCount :" + z5.filesCount);
		System.out.println("CompressionRatio :" + z5.compressionRatio);
		System.out.println("Origin :" + z5.origin);
		System.out.println("Shareable :" + z5.shareable);
		System.out.println("Compatibility :" + z5.compatibility);
		System.out.println("\n");

		
		Zip z6 = new Zip();
		System.out.println("This is Sixth Zip \n");

		z6.fileName = "backup.zip";
		z6.compressionLevel = "High";
		z6.size = 5.0;
		z6.passwordProtected = true;
		z6.usage = "System Backup";
		z6.filesCount = 100;
		z6.compressionRatio = 0.3;
		z6.origin = "Japan";
		z6.shareable = false;
		z6.compatibility = "Linux";

		System.out.println("FileName :" + z6.fileName);
		System.out.println("CompressionLevel :" + z6.compressionLevel);
		System.out.println("Size :" + z6.size);
		System.out.println("PasswordProtected :" + z6.passwordProtected);
		System.out.println("Usage :" + z6.usage);
		System.out.println("FilesCount :" + z6.filesCount);
		System.out.println("CompressionRatio :" + z6.compressionRatio);
		System.out.println("Origin :" + z6.origin);
		System.out.println("Shareable :" + z6.shareable);
		System.out.println("Compatibility :" + z6.compatibility);
		System.out.println("\n");

		
		Zip z7 = new Zip();
		System.out.println("This is Seventh Zip \n");

		z7.fileName = "apps.zip";
		z7.compressionLevel = "Low";
		z7.size = 1.5;
		z7.passwordProtected = false;
		z7.usage = "Software";
		z7.filesCount = 12;
		z7.compressionRatio = 0.6;
		z7.origin = "Canada";
		z7.shareable = true;
		z7.compatibility = "Windows";

		System.out.println("FileName :" + z7.fileName);
		System.out.println("CompressionLevel :" + z7.compressionLevel);
		System.out.println("Size :" + z7.size);
		System.out.println("PasswordProtected :" + z7.passwordProtected);
		System.out.println("Usage :" + z7.usage);
		System.out.println("FilesCount :" + z7.filesCount);
		System.out.println("CompressionRatio :" + z7.compressionRatio);
		System.out.println("Origin :" + z7.origin);
		System.out.println("Shareable :" + z7.shareable);
		System.out.println("Compatibility :" + z7.compatibility);
		System.out.println("\n");

		
		Zip z8 = new Zip();
		System.out.println("This is Eighth Zip \n");

		z8.fileName = "games.zip";
		z8.compressionLevel = "High";
		z8.size = 4.0;
		z8.passwordProtected = true;
		z8.usage = "Gaming";
		z8.filesCount = 8;
		z8.compressionRatio = 0.4;
		z8.origin = "South Korea";
		z8.shareable = false;
		z8.compatibility = "PC";

		System.out.println("FileName :" + z8.fileName);
		System.out.println("CompressionLevel :" + z8.compressionLevel);
		System.out.println("Size :" + z8.size);
		System.out.println("PasswordProtected :" + z8.passwordProtected);
		System.out.println("Usage :" + z8.usage);
		System.out.println("FilesCount :" + z8.filesCount);
		System.out.println("CompressionRatio :" + z8.compressionRatio);
		System.out.println("Origin :" + z8.origin);
		System.out.println("Shareable :" + z8.shareable);
		System.out.println("Compatibility :" + z8.compatibility);
		System.out.println("\n");

		
		Zip z9 = new Zip();
		System.out.println("This is Ninth Zip \n");

		z9.fileName = "data.zip";
		z9.compressionLevel = "Medium";
		z9.size = 2.2;
		z9.passwordProtected = true;
		z9.usage = "Database";
		z9.filesCount = 30;
		z9.compressionRatio = 0.5;
		z9.origin = "Australia";
		z9.shareable = true;
		z9.compatibility = "Server";

		System.out.println("FileName :" + z9.fileName);
		System.out.println("CompressionLevel :" + z9.compressionLevel);
		System.out.println("Size :" + z9.size);
		System.out.println("PasswordProtected :" + z9.passwordProtected);
		System.out.println("Usage :" + z9.usage);
		System.out.println("FilesCount :" + z9.filesCount);
		System.out.println("CompressionRatio :" + z9.compressionRatio);
		System.out.println("Origin :" + z9.origin);
		System.out.println("Shareable :" + z9.shareable);
		System.out.println("Compatibility :" + z9.compatibility);
		System.out.println("\n");

		
		Zip z10 = new Zip();
		System.out.println("This is Tenth Zip \n");

		z10.fileName = "final.zip";
		z10.compressionLevel = "High";
		z10.size = 3.8;
		z10.passwordProtected = true;
		z10.usage = "Project";
		z10.filesCount = 40;
		z10.compressionRatio = 0.45;
		z10.origin = "India";
		z10.shareable = true;
		z10.compatibility = "All OS";

		System.out.println("FileName :" + z10.fileName);
		System.out.println("CompressionLevel :" + z10.compressionLevel);
		System.out.println("Size :" + z10.size);
		System.out.println("PasswordProtected :" + z10.passwordProtected);
		System.out.println("Usage :" + z10.usage);
		System.out.println("FilesCount :" + z10.filesCount);
		System.out.println("CompressionRatio :" + z10.compressionRatio);
		System.out.println("Origin :" + z10.origin);
		System.out.println("Shareable :" + z10.shareable);
		System.out.println("Compatibility :" + z10.compatibility);
		System.out.println("\n");
	}
}