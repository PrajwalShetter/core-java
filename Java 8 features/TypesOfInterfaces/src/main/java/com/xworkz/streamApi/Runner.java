package com.xworkz.streamApi;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("India");
        list.add("New zeland");
        list.add("Japan");
        list.add("Usa");
        list.add("London");
        list.add("Russia");
        list.add("Colombia");
        list.add("Pakistan");
        list.add("Thailand");
        list.add("Nepal");
        list.add("ManiPal");
        list.add("NewYork");
        list.add("Italy");
        list.add("Iran");
        list.add("South Africa");
        list.add("North Africa");
        list.add("China");

        System.out.println("Country names with length is greater than 5");
        list.stream().filter(st-> st.length()>=5).forEach(s-> System.out.println(s));
        System.out.println("end of stream");

        System.out.println("Country names based on starts with and ends with");
        list.stream().filter(st->st.startsWith("C") && st.endsWith("a")).forEach(s -> System.out.println(s));
        System.out.println("End of stream");
    }
}
