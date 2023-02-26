package ru.suai.lab01;

public class Int {
    private int value;

    public Int() {
        value = 0;
    }
    
    @Override
    public String toString() {
        return String.valueOf(value);
    }
    
    public void increment() {
        value++;
    }

    public void decrement() {
        value--;
    }

    public void add(Int n) {
        value += n.value;
    }

    public void substract(Int n) {
        value -= n.value;
    }
}