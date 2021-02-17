package com.hawkins;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PolitePerson jane = new PolitePerson("Jane");
        PolitePerson john = new PolitePerson("John");

        Map<Integer,String> map = new HashMap<>();

        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            // ...
        }

        // thread one has a lock on jane,
        // thread two hbas a lock on john
        // then when thread 1 tries to call john it is blocked etc.

        new Thread(new Runnable() {
            @Override
            public void run() {
                jane.sayHello(john);

            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                john.sayHello(jane);
            }
        }).start();



    }

    static class PolitePerson{
        private final String name;

        public PolitePerson(String name){
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public synchronized void sayHello(PolitePerson person){
            System.out.format("%s: %s" + " has said hello to me!%n", this.name, person.getName());
            person.sayHelloBack(this);
        }

        public synchronized void sayHelloBack(PolitePerson person){
            System.out.format("%s: %s" + " has said hello back to me!%n", this.name, person.getName());
        }
    }
}
