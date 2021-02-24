package com.hawkins;

public class Manager {

    private String name;
    private int age;
    private String team;

    public Manager(String name, int age, String team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
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
