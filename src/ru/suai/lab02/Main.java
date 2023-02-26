package ru.suai.lab02;

public class Main {
    public static void main(String[] args) {
        Matrix a = new Matrix(2);
        a.setElement (0, 0, 1);
        a.setElement (0, 1, 1);
        a.setElement (1, 0, 1);
        a.setElement (1, 1, 0);
        System.out.println (a);

        Matrix b = a;
        for (int i = 0; i < 9; i++) {
            b = b.product(a);
            System.out.println (b);
        }
    }
} 