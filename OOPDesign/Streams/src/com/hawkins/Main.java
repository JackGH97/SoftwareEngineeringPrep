package com.hawkins;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
//	// write your code here
//        List<String> someBingoNumbers = Arrays.asList("N40","N20","G50","F21");
//        List<String> chosenNumbers = new ArrayList<>();
//        someBingoNumbers.forEach(number -> {
//            if(number.startsWith("N")){
//                chosenNumbers.add(number);
//                System.out.println(number);
//            }
//        });
//        chosenNumbers.sort((s1,s2) -> s1.compareTo(s2));
//        chosenNumbers.forEach(s -> System.out.println(s));
//        someBingoNumbers.stream().map(String::toUpperCase).filter(s->s.startsWith("G")).sorted().forEach(System.out::println);

        Employee john = new Employee("John Doe", 40);
        Employee jack = new Employee("Jack Hill", 32);
        Employee mike = new Employee("Mike Jenkins", 21);

        Department hr = new Department("Human Resources");
        hr.addEmployee(john);
        hr.addEmployee(jack);

        Department accounting = new Department("Accounting");

        accounting.addEmployee(mike);

        List<Department> departments = new ArrayList<>();
        departments.add(hr);
        departments.add(accounting);

        departments.stream().flatMap(department -> department.getEmployees().stream()).forEach(System.out::println);
        Map<Integer,List<Employee>> groupedByAge = departments.stream().flatMap(department -> department.getEmployees().stream())
                .collect(Collectors.groupingBy(Employee::getAge));

        System.out.println(groupedByAge);

        departments.stream()
                .flatMap(department -> department.getEmployees().stream())
                .reduce((e1,e2) -> e1.getAge() < e2.getAge() ? e1 : e2)
                .ifPresent(System.out::println);



    }
}
