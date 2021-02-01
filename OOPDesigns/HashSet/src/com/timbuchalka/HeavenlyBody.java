package com.timbuchalka;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by dev on 12/01/2016.
 */
public class HeavenlyBody {
    private final double orbitalPeriod;
    private final Set<HeavenlyBody> satellites;
    private final Key key;

    public enum BodyType {
        STAR,
        PLANET,
        DWARF_PLANET,
        MOON,
        COMET,
        ASTEROID
    }

    public HeavenlyBody(String name, double orbitalPeriod, BodyType type) {
        this.key = new Key(name,type);
        this.orbitalPeriod = orbitalPeriod;
        this.satellites = new HashSet<>();
    }


    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public Key getKey() {
        return key;
    }

    public boolean addSatellite(HeavenlyBody satellite) {
        return this.satellites.add(satellite);
    }

    public Set<HeavenlyBody> getSatellites() {
        return new HashSet<>(this.satellites);
    }


    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj instanceof HeavenlyBody) {
            HeavenlyBody theObject = ((HeavenlyBody) obj);
            return this.key.equals(theObject.getKey());
        }

        return false;
    }

    @Override
    public final int hashCode() {
        return this.key.hashCode();
    }

    @Override
    public String toString() {
        return this.key.name + ": " + this.key.bodyType + ", " + this.orbitalPeriod;
    }


    public static Key makeKey(String name, BodyType type){
        return new Key(name,type);
    }

    public static final class Key{
        private String name;
        private BodyType bodyType;
        private Key(String name, BodyType bodytype){
            this.name = name;
            this.bodyType = bodytype;
        }

        public String getName() {
            return name;
        }

        public BodyType getBodyType() {
            return bodyType;
        }

        @Override
        public int hashCode() {
            return this.name.hashCode() + 57 + this.bodyType.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Key key  = (Key) obj;
            if(this.name.equals(key.getName())){
                return this.bodyType.equals(key.getBodyType());
            }
            return false;
        }

        @Override
        public String toString() {
            return this.name + ": " + this.bodyType;
        }
    }
}
