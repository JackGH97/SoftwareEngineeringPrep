package com.hawkins.AlgoExpert.Medium;

import java.util.ArrayList;
import java.util.List;

public class StackConstruction {

    public static void main(String[] args) {
        StackConstruction stack = new StackConstruction();
        stack.push(4);
        stack.push(8);
//        System.out.println(stack.peek());
//        stack.pop();
//        System.out.println(stack.peek());
        stack.push(5);
        stack.push(6);
//        stack.peek();
//        stack.stackClear();
//        System.out.println(stack.isEmpty());
        stack.viewStack();

        System.out.println(stack.peek());
    }

    List<Integer> stack = new ArrayList<>();

    public void stackClear(){
        while(stack.size() != 0){
            pop();
        }
    }

    public void viewStack(){
        for(int i = 0; i<stack.size(); i++){
            System.out.println(stack.get(i));
        }
    }

    public boolean isEmpty() {
        return (stack.size() == 00);
    }


    public int peek() {
        // Write your code here.
        return stack.get(stack.size()-1);
    }

    public int pop() {
        return stack.remove(stack.size()-1);
    }

    public void push(Integer number) {
        stack.add(number);
    }


}
