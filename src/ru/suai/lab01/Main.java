package ru.suai.lab01;

public class Main {
    public static void main(String[] args) {
        Int n = new Int();
        n.increment();
        
        for (int i = 0; i < 7; i++) {
            n.add(n);
            System.out.println(n);
        }

        n.decrement();
        n.decrement();
        n.decrement();
        System.out.println(n);

        for (int i = 0; i < 3; i++) {
            n.add(n);
            System.out.println(n);
        }
    }
}