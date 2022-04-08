package com.bridgeLabz.employeeWage;

import java.util.Random;

public class Attendance {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand_1 = rand.nextInt(2);

        if (rand_1 == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is absent");
        }

    }
}
