package com.bridgeLabz.employeeWage;

import java.util.Random;

public class Attendance {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand_1 = rand.nextInt(2);

        Attendance emp = new Attendance();

        // Checking the Attendance.
        if (rand_1 == 1) {
            System.out.println("Employee is Present");
        } else {
            System.out.println("Employee is Absent");
        }

        // Printing daily wage.
        emp.dailyWage();
    }

    public void dailyWage() {
        int wagePerHour = 20;
        int fullDayHour = 8;
        int dailyWage = wagePerHour * fullDayHour;

        System.out.println("Employee daily wage is : " + dailyWage + " Rs");
    }
}
