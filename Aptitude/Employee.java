class Employee{

    int id;
    String name;
    double salary;

    Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}

public class EmployeeRunner{
    public static void main(String[] args){

        Employee[] emp={
                new Employee(1,"Ravi",40000),
                new Employee(2,"Teju",20000),
                new Employee(3,"Akash",50000)
        };

        for(Employee e:emp){
            if(e.salary>30000)
                System.out.println(e.name);
        }
    }
}