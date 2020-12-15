package com.hawkins.AlgoExpert.Medium;

import com.hawkins.LinkedList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MinMaxStack {


    ArrayList<Integer> list = new ArrayList<Integer>();

    public int peek() {
        return list.get(list.size()-1);
    }

    public int pop() {
        int last = list.remove(list.size()-1);
        return last;
    }

    public void push(Integer number) {
        list.add(number);
    }

    public int getMin() {
        // Write your code here.
        return Collections.min(list);
    }

    public int getMax() {
        // Write your code here.
        return Collections.max(list);
    }
}
