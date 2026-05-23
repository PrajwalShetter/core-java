class Runner{
	
	public static void main(String args[]){
	
	Address address1 = new Address(1416, "RR Nagar", 587990, "Beng");
	Address address2 = new Address(990, "JJ nagar", 234567, "Bng");
	Address address3 = new Address(789, "old stop", 68904, "kartagi");
	Address address4 = new Address(123, "uday nagar", 34567, "ballari");
	Address address5 = new Address(567, "akshya colonoy", 2908765, "Hubli");
	Address address6 = new Address(896, "kajal Nagar", 257890, "Tumkur");
	Address address7 = new Address(674, "raja Nagar", 675433, "dharwad");
	Address address8 = new Address(222, "sangolli rayanna Nagar", 43434, "Bng");
	Address address9 = new Address(8834, "rani Nagar", 44786, "Gadag");
	Address address10 = new Address(333, "JP Nagar", 567843, "Bng");
	Address address11 = new Address(456, "Matti halli", 590765, "Hasan");
	Address address12 = new Address(967, "Mg Road", 456743, "Mysoure");
	Address address13 = new Address(890, "ramMandhir", 289056, "Raichur");
	Address address14 = new Address(122 ,"Pizza Hut", 567432, "gadag");
	Address address15 = new Address(455, "Jm Nagar", 38675, "Karwar");
	Address address16 = new Address(6666, "kali Nagara", 6754356, "Belgavi");
	
	
	ViceChancellor viceChancellor1 = new ViceChancellor("Gangadhar",12, address1);
	ViceChancellor viceChancellor2 = new ViceChancellor("shivappa",10, address3);
	ViceChancellor viceChancellor3 = new ViceChancellor("minakshi", 8, address2);
	
	Principal principal1 = new Principal("Gopal", "Phd CS", 10);
	Principal principal2 = new Principal("David", "M.phill CS", 15);
	Principal principal3 = new Principal("Nanda", "MCA", 6);
	Principal principal4 = new Principal("ganga", "Phd Mech", 8);
	
	HOD hod1 = new HOD("Madhu", "Deep Learning", 9);
	HOD hod2 = new HOD("tanu", "ML", 10);
	HOD hod3 = new HOD("Vignesh", "Data Stuctures", 8);
	HOD hod4 = new HOD("hanumesh", "data Science", 7);
	HOD hod5 = new HOD("Nagaraj", "DevOps", 7);
	
	Student student1 = new Student("Ravi", 105, 89, address1);
	Student student2 = new Student("Raju", 102, 20, address9);
	Student student3 = new Student("Manju", 108, 45, address10);
	Student student4 = new Student("Govind", 101, 90, address7);
	Student student5 = new Student("Sakshi", 103, 75, address3);
	Student student6 = new Student("Samiksha", 104, 80, address11);
	Student student7 = new Student("Anusha", 106, 68, address12);
	Student student8 = new Student("Jacki", 107, 70, address2);
	Student student9 = new Student("rasmi", 109, 56, address4);
	Student student10 = new Student("Kamlesh", 110, 66, address6);
	Student student11 = new Student("tara", 111, 77, address13);
	Student student12 = new Student("Gouri", 112, 99, address8);
	Student student13 = new Student("Uday", 113, 45, address14);
	Student student14 = new Student("Fathima", 114, 88, address15);
	Student student15 = new Student("Revathi", 115, 92, address16);
	Student[] students1 = {student1,student10,student11,student2,student12};
	Student[] students2 = {student3,student8,student5,student13,student7};
	Student[] students3 = {student4,student6,student9,student15,student14};
	
	
	Department department1 = new Department("Computer Science",hod5,students1,80);
	Department department2 = new Department("Mechanical",hod3,students3,50);
	Department department3 = new Department("Civil",hod4,students2,35 );
	Department department4 = new Department("Electrical",hod2,students1,60);
	Department department5 = new Department("AIML",hod1,students3,75);
	Department[] departments2 = {department2,department5,department4};
	Department[] departments3 = {department1,department2,department3,department4};
	Department[] departments4 = {department5,department3};
	Department[] departments5 = {department5,department3,department1,department2,department4};
	Department[] departments1 = {department1,department5,department3};
	
	
	College college1 = new College("JG College", principal1,departments5,1000);
	College college2 = new College("IBMR college", principal3,departments1,2500);
	College college3 = new College("KLE college", principal2,departments3,1200);
	College college4 = new College("BVB College", principal4,departments5,2000);
	College college5 = new College("Jain College", principal2,departments4,1400);
	College college6 = new College("chetan college", principal3,departments2,2200);
	College college7 = new College("Bright College", principal1,departments2,560);
	College college8 = new College("Venkateshwar College", principal4,departments4,1100);
	College college9 = new College("EastWest College", principal3,departments1,890);
	College college10 = new College("Cambridge College", principal4,departments3,5670);
	College[] colleges2 = {college3,college7,college9,college5,college6};
	College[] colleges1 = {college1,college2,college4,college8,college10};
	College[] colleges3 = {college2,college4,college5,college9,college1};
	College[] colleges4 = {college7,college9,college1,college3,college10};
	
	
	University university1 = new University("Amity", viceChancellor2,colleges1);
	University university2 = new University("Reva", viceChancellor1,colleges4);
	University university3 = new University("PES", viceChancellor3,colleges2);
	University university4 = new University("Presidency", viceChancellor1,colleges3);
	

	UniversityStore store = new UniversityStore();
	
	store.save(university1);
	store.save(university2);
	store.save(university3);
	store.save(university4);
	
	System.out.println("-----");
	University uni=store.findByUniversityName("PES");
	if(uni != null){
		uni.display();
	}
	
	System.out.println("=============");
	College clg = store.findCollegeByName("Jain College");
	if(clg != null){
		clg.display();
	}
	
	System.out.println("=============");
	Department[] dpt = store.findAllDepartmentsByCollegeName("IBMR college");
	
	System.out.println("==================");
	Student std = store.findStudentByRollNo(101);
	if(std != null){
		std.display();
	}
	else{
		System.out.println("Student not found");
	}
	
	
	System.out.println("====================");
	store.findNoOfStudentsByDepartmentName("AIML");
	
	System.out.println("=============");
	University u= store.findByPrincipalName("Gopal");
	if(u != null){
		u.display();
	}
	
	// System.out.println("=========================");
	// Student[] s = store.findStudentsByMarksGreaterThan(40);
	// if(s != null){
		// for(Student st : s){
			// if(st != null){
				// st.display();
			// }
			
		// }
	// }
	
	System.out.println("===========");
	
College cgg = store.findCollegeByHODName("Vignesh");
if(cgg != null){
	cgg.display();
}
	
	System.out.println("==============");
	String viceName = store.findViceChancellorNameByStudentRollNo(109);
	System.out.println(viceName);
	
	
	}
}