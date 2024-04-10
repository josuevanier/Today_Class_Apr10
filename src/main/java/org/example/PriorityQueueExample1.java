package org.example;

import java.util.PriorityQueue;

public class PriorityQueueExample1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers = new PriorityQueue<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(-1);

        System.out.println(numbers);
    }
}
