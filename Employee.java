package com.bridgeLabz.employeeWage;

import java.util.Random;

public class Employee {
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
        // Printing PartTime wage.
        emp.partTime();

    }

    public void dailyWage() {
        int wagePerHour = 20;
        int fullDayHour = 8;
        int dailyWage = wagePerHour * fullDayHour;

        System.out.println("Employee daily wage is : " + dailyWage + " Rs");
    }

    void partTime() {
        int wagePerHour = 10;
        int partTimeHour = 8;
        int partTimeWage = wagePerHour * partTimeHour;

        System.out.println("Employee part time wage is " + partTimeWage + " Rs");
    }
}
