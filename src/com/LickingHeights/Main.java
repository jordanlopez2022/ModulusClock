package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ModulusClock();
    }

    public static void ModulusClock() {
        int hours;
        int minutes;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the value for hours");
        hours = keyboard.nextInt();
        System.out.println("Enter the value for minutes");
        minutes = keyboard.nextInt();
        hours = minutes >= 60? hours + minutes/60 : hours;
        hours %= 12;

        minutes %= 60;
        hours = hours == 0? 12 : hours;

        System.out.printf("The time is: %d:%02d",hours,minutes );
    }

}
