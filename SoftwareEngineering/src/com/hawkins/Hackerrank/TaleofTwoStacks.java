package com.hawkins.Hackerrank;

import java.util.Stack;

public class TaleofTwoStacks {

    public static void main(String[] args) {

    }


    /**
     * Using to stacks to represent a queueObject
     * Essentially always add to a so we have the front. if we want to remove the front element
     * push them all onto b and remove the top (first element) (same logic for peeking).
     * @param <T> Any type of object
     */
    class MyQueue<T> {
        Stack<T> a;
        Stack<T> b;

        MyQueue() {
            a = new Stack<T>();
            b = new Stack<T>();
        }

        protected void enqueue(T t){
            a.push(t);
        }

        protected void dequeue(){
            if(b.empty()){
                while(!a.empty()){
                    b.push(a.pop());
                }
            }
            b.pop();
        }

        protected String peek(){
;            if(b.empty()){
                while(!a.empty()){
                    b.push(a.pop());
                }
            }
            return b.peek().toString();
        }
    }


}
