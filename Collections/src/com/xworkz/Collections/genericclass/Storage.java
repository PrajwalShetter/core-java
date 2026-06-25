package com.xworkz.Collections.genericclass;

public class Storage<T , U> {

    private T data;
    private U name;

    public  Storage(T data, U name){
        this.data = data;
        this.name= name;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setName(U name) {
        this.name = name;
    }

    public T getData() {
        return data;
    }

    public U getName() {
        return name;
    }

    public void print(){
        System.out.println("Stored data :"+this.data);
        System.out.println("Name :"+this.name);
    }


}
