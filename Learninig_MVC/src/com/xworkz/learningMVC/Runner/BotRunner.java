package com.xworkz.learningMVC.Runner;

import com.xworkz.learningMVC.inner.Bot;

import java.util.Scanner;

public class BotRunner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("hi  i am your Bot");
        System.out.println("what you want to search");


        String order = sc.nextLine();

        Bot bot = new Bot();

        bot.orderDetails(order);

    }
}
