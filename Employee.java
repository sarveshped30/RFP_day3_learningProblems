package com.bridgeLabz.employeeWage;

import java.util.Random;
import java.util.Scanner;

public class Employee {
    int workingDays = 20;
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

        System.out.println("Enter: \n\t1 for daily wage \n\t2 for Part Time Wages ");
        Scanner sc = new Scanner(System.in);
        int inp = sc.nextInt();

        switch(inp) {
            case 1:
                emp.dailyWage();
                break;
            case 2:
                emp.partTime();
                break;
            default:
                System.out.println("Enter between 1 or 2....");
        }
    }

    void dailyWage() {
        int fullDayHour = 8;
        int wagePerHour = 20;
        int dailyWage = wagePerHour * fullDayHour;
        int monthlyWage = dailyWage * workingDays;

        System.out.println("Employee daily wage is : " + dailyWage + " Rs");
        System.out.println("Employee Monthly wage is : " + monthlyWage + " Rs");
    }

    void partTime() {
        int wagePerHour = 10;
        int partTimeHour = 8;
        int partTimeWage = wagePerHour * partTimeHour;
        int monthlyWage = partTimeWage * workingDays;

        System.out.println("Employee part time wage is " + partTimeWage + " Rs");
        System.out.println("Employee Monthly wage is : " + monthlyWage + " Rs");
    }

}
