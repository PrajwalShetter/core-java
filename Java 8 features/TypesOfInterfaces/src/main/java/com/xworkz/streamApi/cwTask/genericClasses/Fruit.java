package com.xworkz.streamApi.cwTask.genericClasses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Fruit <T, U>{

    private T first;
    private U second;

    public void display(){
        System.out.println(first +" "+ second);
    }
}
