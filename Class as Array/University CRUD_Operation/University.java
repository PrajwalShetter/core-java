// Declare below classes

// University:
// name, viceChancellor, College[]

// ViceChancellor:
// name, experience, Address

// College:
// name, principal, Department[], noOfStudents

// Principal:
// name, qualification, experience

// Department:
// name, HOD, Student[], noOfFaculty

// HOD:
// name, specialization, yearsOfExperience

// Student:
// name, rollNo, marks, Address

// Address:
// doorNo, area, pincode, city


// UniversityStore:
// University[10]

// save(University university)

// University findByUniversityName(String name)

// College findCollegeByName(String name)

// Department[] findAllDepartmentsByCollegeName(String collegeName)

// Student findStudentByRollNo(int rollNo)

// int findNoOfStudentsByDepartmentName(String deptName)

// University findByPrincipalName(String principalName)

// Student[] findStudentsByMarksGreaterThan(int marks)

// College findCollegeByHODName(String hodName)

// String findViceChancellorNameByStudentRollNo(int rollNo)

class University{
	
	String name;
	ViceChancellor viceChancellor;
	College college[];
	
	 University(String name, ViceChancellor viceChancellor, College[] college){
		this.name=name;
		this.viceChancellor = viceChancellor;
		this.college = college;
	}
	
	void display(){
		System.out.println("--------------");
		System.out.println("Name :"+this.name);
		System.out.println("ViceChancellor :"+this.viceChancellor.name);
		
		if(this.college!=null){
			System.out.println("Colleges are :");
			for(College clg: college){
				if(clg != null){
					System.out.println("Name :"+clg.name);
				}
			
		}
		}
		
		
	}
}