package com.timbuchalka;

public class Asteroid extends HeavenlyBody {
    public Asteroid(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.ASTEROID);
    }
}
