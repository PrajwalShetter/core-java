class UniversityStore {

	University university[] = new University[20];
	int index = 0;

	void save(University university) {

		if (university != null) {
			if (this.index < this.university.length) {
				this.university[index] = university;
				System.out.println("University stored in the index :" + index);
				index++;
			}
		} else {
			System.out.println("University cannot be null");
		}
	}

	University findByUniversityName(String name) {
		System.out.println("findByUniversityName :" + name);
		if (name != null) {
			boolean found = false;
			for (int i = 0; i < university.length; i++) {
				if (university[i] != null && name.equals(university[i].name)) {
					System.out.println("University name found at index :" + i);
					found = true;
					return university[i];
				}
			}
			if (!found) {
				System.out.println("University name is not found , plz try new name");
				return null;
			}
		} else {
			System.out.println("name cannot be null");
			return null;
		}

		return null;

	}

	College findCollegeByName(String name) {

		System.out.println("findCollegeByName :"+name);
		if (name != null) {
			int index = 0;
			for (University arr : university) {
				if (arr != null && arr.college != null) {
					for (College arr1 : arr.college) {
						if (arr1 != null && name.equals(arr1.name)) {
							System.out.println("College is found");
							index = 1;
							return arr1;
						}
					}
				}
			}
			if (index == 0) {
				System.out.println("sry college is not found try with new name");
			}
		} else {
			System.out.println("Name cannot be null");
		}

		return null;
	}
	
	
	
	Department[] findAllDepartmentsByCollegeName(String collegeName){
		System.out.println("findAllDepartmentsByCollegeName :"+collegeName);
		
		if(collegeName != null){
			for(University  uarr : university){
				if(uarr != null && uarr.college !=null){
					for(College carr : uarr.college){
						if(carr != null && collegeName.equals(carr.name)){
							if(carr.department != null){
								for(Department darr : carr.department){
									if(darr != null){
										System.out.println("Department are :"+darr.name);
									}
								}
								return carr.department;
							}
						}
					}
				}
			}
			System.out.println("College is not found");
		}
		else{
			System.out.println("College name cannot be null");
		}
			
		return null;
	}
	
	
	Student findStudentByRollNo(int rollNo){
		System.out.println("findStudentByRollNo :"+rollNo);
		
		if(rollNo != 0){
			for(University uarr : university){
				if(uarr != null && uarr.college != null){
					for(College carr : uarr.college){
						if(carr != null && carr.department != null){
							for(Department darr : carr.department){
								if(darr != null && darr.student != null){
									for(Student sarr : darr.student){
										if(sarr != null && rollNo == sarr.rollNo){
											return sarr;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		else{
			System.out.println("rollNo cannot be zero ");
		}
		
		return null;
	}
	
	
	int findNoOfStudentsByDepartmentName(String deptName){
		
		System.out.println("findNoOfStudentsByDepartmentName :"+deptName);
		
		if(deptName != null){
			for(University uarr : university){
				if(uarr != null && uarr.college !=null){
					for(College carr : uarr.college){
						if(carr != null && carr.department !=null){
							for(Department darr : carr.department){
								if(darr != null && deptName.equals(darr.name)){
									System.out.println("No of students :"+carr.noOfStudents);
									return 0;
								}
							}
						}
					}
				}
			}
		}
		else{
			System.out.println("department name cannot be null");
		}
		return 0;
	}
	
	University findByPrincipalName(String principalName){
		System.out.println("findByPrincipalName :"+principalName);
		
		if(principalName != null){
			for(University uarr : university){
				if(uarr != null && uarr.college != null){
					for(College carr : uarr.college){
						if(carr != null && carr.principal != null && principalName.equals(carr.principal.name)){
							return uarr;
						}
					}
				}
			}
		}
		
		return null;
	}
	
	// Student[] findStudentsByMarksGreaterThan(int marks){

    // System.out.println( "findStudentsByMarksGreaterThan : " + marks);

    // Student[] result = new Student[];
    // int index = 0;

    // if(marks != 0){

        // for(University uarr : university){

            // if(uarr != null && uarr.college != null){

                // for(College carr : uarr.college){

                    // if(carr != null && carr.department != null){

                        // for(Department darr : carr.department){

                            // if(darr != null && darr.student != null){

                                // for(Student sarr : darr.student){

                                    // if(sarr != null && sarr.marks > marks){

                                        // result[index] = sarr;

                                        // index++;
                                    // }
                                // }
                            // }
                        // }
                    // }
                // }
            // }
        // }
    // }
    // else{
        // System.out.println(
            // "Marks cannot be zero"
        // );
    // }

    // return result;
// }


College findCollegeByHODName(String hodName){
	 
	 System.out.println("findCollegeByHODName :"+hodName);
	 
	 if(hodName != null){
		 for(University uarr : university){
			 if(uarr != null && uarr.college != null){
				 for(College carr : uarr.college){
					 if(carr != null && carr.department != null){
						 for(Department darr : carr.department){
							 if(darr != null && hodName.equals(darr.hod.name)){
								 return carr;
							 }
						 }
					 }
				 }
			 }
		 }
	 }
	 else{
		 System.out.println("Hod name cannot be null");
	 }
	 
	 return null;
}


	String findViceChancellorNameByStudentRollNo(int rollNo){
	
	System.out.println("findViceChancellorNameByStudentRollNo :"+rollNo); 
	
	if(rollNo != 0){
		for(University uarr : university){
			if(uarr != null && uarr.college != null){
				for(College carr : uarr.college){
					if(carr != null && carr.department != null){
						for(Department darr : carr.department){
							if(darr != null && darr.student != null){
								for(Student sarr : darr.student){
									if(sarr !=  null && rollNo == sarr.rollNo){
										return uarr.viceChancellor.name;
										
									}
								}
							}
						}
					}
				}
			}
		}
	}
	else{
		System.out.println("rollNo cannot be null");
	}
	
	return null;
}

}
