package com.xworkz.streamApi.cwTask.genericClasses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Box <T>{

    private T item;

    public void display(){
        System.out.println(item);
    }
}
