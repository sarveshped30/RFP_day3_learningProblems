package com.bridgeLabz.employeeWage;

import java.util.Random;
import java.util.Scanner;

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
