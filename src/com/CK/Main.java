package com.CK;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}

class MovingAverage {
    Queue<Integer> list = new LinkedList<>();
    int capacity = 0;
    int current = 0;
    int sum = 0;

    /** Initialize your data structure here. */
    public MovingAverage(int size) {
        capacity = size;
    }

    public double next(int val) {
        current++;
        if (current <= capacity) {
            sum += val;
            list.offer(val);
            return (double) sum / (double) current;
        } else {
            sum -= list.poll();
            sum += val;
            list.offer(val);
            return (double) sum / (double) capacity;
        }
    }
}