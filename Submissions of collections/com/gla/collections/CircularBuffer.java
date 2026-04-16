package com.gla.collections;

public class CircularBuffer {
    int[] buffer;
    int head = 0, tail = 0, size = 0, capacity;

    public CircularBuffer(int cap) {
        buffer = new int[cap];
        capacity = cap;
    }

    public boolean add(int val) {
        if (size == capacity) return false;
        buffer[tail] = val;
        tail = (tail + 1) % capacity;
        size++;
        return true;
    }

    public int remove() {
        if (size == 0) throw new RuntimeException("Empty");
        int val = buffer[head];
        head = (head + 1) % capacity;
        size--;
        return val;
    }

    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);
        cb.add(10); cb.add(20); cb.add(30);
        System.out.println("Removed: " + cb.remove());
        cb.add(40);
        System.out.println("Removed: " + cb.remove());
    }
}
