package com.timbuchalka;

public class Star extends HeavenlyBody{
    public Star(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyType.STAR);
    }

    @Override
    public boolean addSatellite(HeavenlyBody satellite) {
        if(satellite.getKey().getBodyType() == BodyType.STAR){
            return super.addSatellite(satellite);
        }
        return false;
    }
}
