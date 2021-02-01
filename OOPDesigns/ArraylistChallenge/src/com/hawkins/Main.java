package com.hawkins;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayList<String> list = new ArrayList<String>(10) ;

        list.add( "Andy" );
        list.add( "Bart" );
        list.add( "Carl" );
        list.set( 0, "Eve" );

        System.out.println(list.get(2));
        Iterator iter = list.iterator();
        ArrayList list1 = new ArrayList();
        
        Contact[] contracts = new Contact[10];
    }
}
