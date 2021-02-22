package com.hawkins;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        com.timbuchalka.Employee john = new com.timbuchalka.Employee("John Doe", 30);
        com.timbuchalka.Employee tim = new com.timbuchalka.Employee("Tim Buchalka", 21);
        com.timbuchalka.Employee jack = new com.timbuchalka.Employee("Jack Hill", 40);
        com.timbuchalka.Employee snow = new com.timbuchalka.Employee("Snow White", 22);
        com.timbuchalka.Employee red = new com.timbuchalka.Employee("Red RidingHood", 35);
        com.timbuchalka.Employee charming = new com.timbuchalka.Employee("Prince Charming", 31);

        List<com.timbuchalka.Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);

        printEmployeesByAge(employees, "Employees over 30", employee -> employee.getAge() > 30);
        printEmployeesByAge(employees, "\nEmployees 30 and under", employee ->employee.getAge() <= 30);

    }

    private static void printEmployeesByAge(List<com.timbuchalka.Employee> employees,
                                            String ageText,
                                            Predicate<com.timbuchalka.Employee> ageCondition) {

        System.out.println(ageText);
        System.out.println("==================");
        for(com.timbuchalka.Employee employee : employees) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }
        }
    }
}
