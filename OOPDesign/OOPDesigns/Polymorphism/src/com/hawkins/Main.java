package com.hawkins;


class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }
}

class Jaws extends Movie {

    public Jaws(){
        super("Jaws");
    }

    @Override
    public String plot(){
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie {

    public IndependenceDay(){
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens take over the world";
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        for(int i  =1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println(movie.plot());
        }
    }

    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random() * 2)+ 1;
        System.out.println("Generated Number: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
            case 4:
            case 5:
                System.out.println("No Movie");
                break;
        }
        return null;
    }

}
