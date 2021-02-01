package com.timbuchalka;

public class Comet extends HeavenlyBody{

    public Comet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.COMET);
    }
}
