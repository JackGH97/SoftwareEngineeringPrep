package com.hawkins.AlgoExpert.Medium;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {

    List<Integer> heap = new ArrayList<Integer>();

    public MinHeap(List<Integer> array) {
        heap = buildHeap(array);
    }

    public List<Integer> buildHeap(List<Integer> array) {
        // Write your code here.
        return new ArrayList<Integer>();
    }

    public void siftDown(int currentIdx, int endIdx, List<Integer> heap) {
        // Write your code here.
    }

    public void siftUp(int currentIdx, List<Integer> heap) {
        // Write your code here.
    }

    public int peek() {
        // Write your code here.
        return heap.get(0);
    }

    public int remove() {
        // Write your code here.
        int removed = heap.get(0);

        return removed;
    }

    public void insert(int value) {
        // Write your code here.
    }
}
