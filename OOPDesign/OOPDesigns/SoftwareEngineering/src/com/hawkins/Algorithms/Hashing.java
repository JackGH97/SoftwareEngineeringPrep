package com.hawkins.Algorithms;

import java.util.*;

public class Hashing {

    private String firstName;
    private String lastName;
    private int id;

    public Hashing(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hashing employee = (Hashing) o;

        if (id != employee.id) return false;
        if (!firstName.equals(employee.firstName)) return false;
        return lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        int result = firstName.hashCode();
        result = 31 * result + lastName.hashCode();
        result = 31 * result + id;
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    public static void main(String[] args) {

        LinkedList<Hashing> employees = new LinkedList<>();
        employees.add(new Hashing("Jane", "Jones", 123));
        employees.add(new Hashing("John", "Doe", 5678));
        employees.add(new Hashing("Mike", "Wilson", 45));
        employees.add(new Hashing("Mary", "Smith", 5555));
        employees.add(new Hashing("John", "Doe", 5678));
        employees.add(new Hashing("Bill", "End", 3948));
        employees.add(new Hashing("Jane", "Jones", 123));

        employees.forEach(e -> System.out.println(e));

        HashMap<Integer, Hashing> employeeTable = new HashMap<>();
        ListIterator<Hashing> iterator = employees.listIterator();
        List<Hashing> remove = new ArrayList<>();

        while (iterator.hasNext()) {
            Hashing employee = iterator.next();
            if (employeeTable.containsKey(employee.getId())) {
                remove.add(employee);
            } else {
                employeeTable.put(employee.getId(), employee);
            }
        }

        for (Hashing employee : remove) {
            employees.remove(employee);
        }

        System.out.println("-------------------------");
        employees.forEach(e -> System.out.println(e));

    }

    public static int hash(int value) {
        return Math.abs(value % 10);
    }


}
