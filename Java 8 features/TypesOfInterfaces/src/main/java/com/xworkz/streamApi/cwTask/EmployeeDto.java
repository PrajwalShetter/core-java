package com.xworkz.streamApi.cwTask;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class EmployeeDto {

    String employeeName;
    int age;
    String address;
    int experience;
    String department;
    String gender;
    double salary;
    String education;

}
