class Human {
    public static void main(String[] args) {

        String name = "Prajwal";
        int age = 21;
        double height = 5.8;
        char gender = 'M';
        boolean student = true;
		
		System.out.println("Before updation :");
        System.out.println("name=" + name);
        System.out.println("age=" + age);
        System.out.println("height=" + height);
        System.out.println("gender=" + gender);
        System.out.println("student=" + student+"\n");

        name = "Rahul";
        age = 25;
        height = 6.0;
        gender = 'M';
        student = false;
		
		
        System.out.println("After updation :");
		System.out.println("name=" + name);
        System.out.println("age=" + age);
        System.out.println("height=" + height);
        System.out.println("gender=" + gender);
        System.out.println("student=" + student);
    }
}