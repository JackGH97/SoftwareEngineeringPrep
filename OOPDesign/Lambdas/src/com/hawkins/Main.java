package com.hawkins;

import java.lang.annotation.Annotation;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Employee john = new Employee("John Doe", 30);
        Employee tim = new Employee("Tim Buch", 42);
        Employee jack = new Employee("Jack Hawkins", 23);
        Employee snow = new Employee("snow White", 100);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);

//        Collections.sort(employees, ( employee1,  employee2) -> employee1.getName().compareTo(employee2.getName()));
//
//        for(Employee employee : employees){
//            System.out.println(employee.getName());
//        }
//
//        String sillyString1 = doStringStuff((s1, s2) -> s1.toUpperCase() + s2.toUpperCase(),employees.get(0).getName(), employees.get(1).getName());
//
//        UpperConcat uc = (s1,  s2) -> s1.toUpperCase() + s2.toUpperCase();
//        String sillyString = doStringStuff(uc,employees.get(0).getName(), employees.get(1).getName());
//        System.out.println(sillyString);

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);

    }

    public final static String doStringStuff(UpperConcat uc,String s1, String s2) {
        return uc.upperAndConcat(s1,s2);
    }
}

class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

class AnotherClass {
    public String doSomething(){
        UpperConcat uc = ((s1, s2) -> {
            System.out.println("The lambda expressions class is " + getClass().getSimpleName());
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        });
        System.out.println("The AnotherClass class's name is: " + getClass().getSimpleName());
        return Main.doStringStuff(uc,"String 1","String 2");

    }
}