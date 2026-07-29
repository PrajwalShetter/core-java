package com.xworkz.streamApi.cwTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeRunner {

    public static void main(String[] args) {

        EmployeeDto emp1 = new EmployeeDto("Suresh", 22,"Bengaluru",2,"account", "male",200000,"MCA");
        EmployeeDto emp2 = new EmployeeDto("Lakshmi", 33,"Bengaluru",10,"testing", "female",700000,"M.tech");
        EmployeeDto emp3 = new EmployeeDto("tarun", 28,"tumkur",5,"Development", "male",550000,"B.tech");
        EmployeeDto emp4= new EmployeeDto("hanusha", 30,"Bengaluru",8,"Bug", "female",180000,"MCA");
        EmployeeDto emp5 = new EmployeeDto("ramesh", 50,"Bengaluru",28,"Development", "male",1200000,"PHD in CS");
        EmployeeDto emp6 = new EmployeeDto("Priya", 26, "Mysuru", 3, "HR", "female", 450000, "MBA");
        EmployeeDto emp7 = new EmployeeDto("Rahul", 35, "Hubballi", 12, "Finance", "male", 850000, "M.Com");
        EmployeeDto emp8 = new EmployeeDto("Sneha", 29, "Mangaluru", 6, "Marketing", "female", 600000, "MBA");
        EmployeeDto emp9 = new EmployeeDto("Kiran", 31, "Dharwad", 7, "Sales", "male", 520000, "BBA");
        EmployeeDto emp10 = new EmployeeDto("Anjali", 27, "Shivamogga", 4, "Support", "female", 400000, "BCA");
        EmployeeDto emp11 = new EmployeeDto("Vikram", 40, "Belagavi", 15, "DevOps", "male", 950000, "M.Tech");
        EmployeeDto emp12 = new EmployeeDto("Pooja", 24, "Kalaburagi", 2, "UI/UX", "female", 380000, "B.Des");


        List<EmployeeDto> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);
        employeeList.add(emp4);
        employeeList.add(emp5);
        employeeList.add(emp6);
        employeeList.add(emp7);
        employeeList.add(emp8);
        employeeList.add(emp9);
        employeeList.add(emp10);
        employeeList.add(emp11);
        employeeList.add(emp12);
        employeeList.add(emp12);
        employeeList.add(emp12);


//        System.out.println(employeeList);
//
//        employeeList.stream().map(employeeDto -> employeeDto.getDepartment()).distinct().forEach(System.out::println);
//

        Set<EmployeeDto> employeeListSet = employeeList.stream().collect(Collectors.toSet());
        employeeListSet.forEach(employeeDto -> System.out.println(employeeDto));

        employeeList.stream()
                .map(EmployeeDto::getDepartment)
                .collect(Collectors.toSet()).forEach(emp-> System.out.println(emp));

        employeeList.stream()
                .map(emp-> emp.getEmployeeName())
                .forEach(emp-> System.out.println(emp));

        employeeList.stream()
                .map(employeeDto -> employeeDto.getExperience()).sorted().
                forEach(emp-> System.out.println(emp));


        employeeList.stream().
                filter(employeeDto -> employeeDto.getSalary() > 500000.00)
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("===============");
        employeeList.stream().filter(employeeDto -> employeeDto.getDepartment().equals("Development"))
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("=============");
        employeeList.stream().filter(employeeDto -> employeeDto.getGender().equals("male"))
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("===============");
        employeeList.stream()
                .map(EmployeeDto::getEmployeeName).collect(Collectors.toList()).forEach(System.out::println);


        System.out.println("============");
        employeeList.stream()
                .collect(Collectors.toMap(
                        emp -> emp.getEmployeeName(),
                        emp -> emp.getSalary(),
                        (oldValue, newValue) -> newValue
                ))
                .forEach((name, salary) -> System.out.println(name + " = " + salary));

        //max
        System.out.println("============");
        EmployeeDto emp =employeeList.stream().
                sorted((o1, o2) -> o2.getExperience()- o1.getExperience()).findFirst().get();
        System.out.println(emp);


        System.out.println("print from max");
        System.out.println(employeeList.stream()
                .max((o1, o2) -> o1.getExperience()-o2.getExperience()).get());

        System.out.println("Print by maxBy");
        System.out.println(employeeList.stream()
                .collect(Collectors.maxBy((o1, o2) -> o1.getExperience()- o2.getExperience())).get());


        //min
        System.out.println("============");
        EmployeeDto empl1 =employeeList.stream().
                sorted((o1, o2) -> o1.getExperience()- o2.getExperience()).findFirst().get();
        System.out.println(empl1);


        System.out.println("print from min");
        System.out.println(employeeList.stream()
                .min((o1, o2) -> o1.getExperience()-o2.getExperience()).get());

        System.out.println("Print by minBy");
        System.out.println(employeeList.stream()
                .collect(Collectors.minBy((o1, o2) -> o1.getExperience()- o2.getExperience())).get());


        //groupBy
//        employeeList.stream().collect(Collectors.groupingBy(employeeDto -> employeeDto.getDepartment()))
//                .forEach((key,value)->);


//        Group the Employees by age
        Map<Integer, List<EmployeeDto>>  agewise= employeeList.stream()
                .collect(Collectors.groupingBy(EmployeeDto::getAge));

        agewise.forEach((age,employees)-> {System.out.println(age);
        employees.forEach(System.out::println);
        });


        System.out.println("Find the count of male and female employees in the organisation");

        employeeList.stream()
                .collect(Collectors.groupingBy(EmployeeDto::getGender,Collectors.counting()))
                .forEach((gender,count)-> System.out.println(gender+ " "+ count));

        System.out.println("Find the count of male and female in each department");
        employeeList.stream()
                .collect(Collectors.groupingBy(
                        EmployeeDto::getDepartment,
                        Collectors.groupingBy(
                                EmployeeDto::getGender,
                                Collectors.counting()
                        )))
                .forEach((department, genderMap) -> {

                    System.out.println(department);

                    genderMap.forEach((gender, count) ->
                            System.out.println(gender + " = " + count));
                });

        System.out.println("Print employee details whose age is greater than a specific age");
        employeeList.stream()
                .filter(employee->employee.getAge()>30)
                .forEach(System.out::println);

        System.out.println("Print the number of employees in each department");

        employeeList.stream()
                .collect(Collectors.groupingBy(EmployeeDto::getDepartment,Collectors.counting()))
                .forEach((department,count)-> System.out.println(department +" " + count));


        //partitioningBy
        System.out.println("Find the count of greater than 200000 and less than 200000 in each department");
        employeeList.stream()
                .collect(Collectors.groupingBy(EmployeeDto::getDepartment,
                        Collectors.groupingBy(employees->employees.getSalary()>700000)))
                .forEach((department,salaryMap)->{
                    System.out.println(department);
                    salaryMap.forEach((condition, employees)->{
                        System.out.println(condition?"salary >700000":"salary<700000");
                        employees.forEach(System.out::println);
                    });
                });


        System.out.println("Find the count of greater than 200000 and less than 200000 in each department");
        Map<Boolean, List<EmployeeDto>> partitioned = employeeList.stream()
                .collect(Collectors.partitioningBy(employee -> employee.getSalary()>700000));

        System.out.println("greater then 700000 :"+partitioned.get(true));
        System.out.println("less then 700000 :"+partitioned.get(false));



    }
}

