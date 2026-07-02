package com.xworkz.Meta.dto;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@NoArgsConstructor
public class SignUpDto {

    private String UserName;
    private int age;
    private String mobileNo;
    private String nationality;
    private String password;
    private String confirmPassword;

}
