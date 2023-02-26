package ru.suai.lab02;

import java.util.Arrays;

public class Matrix {
    private int size;
    private int[][] array;

    public Matrix(int size) {
        this.size = size;
        array = new int[size][size];
    }

    public Matrix() {
        this(1);
    }

    public void setElement(int row, int column, int value) {
        array[row][column] = value;
    }

    public int getElement(int row, int column) {
        return array[row][column];
    }

    public Matrix sum (Matrix m) {
        Matrix result = new Matrix(m.size);
        for (int i = 0; i < m.size; i++) {
            for (int j = 0; j < m.size; j++) {
                result.setElement(j, i, this.getElement(j, i) + m.getElement(j, i));
            }
        }
        return result;
    }

    public Matrix product(Matrix m) {
        Matrix result = new Matrix(this.size);
    
        for (int i = 0; i < this.size; i++) {
          for (int j = 0; j < this.size; j++) {
            int sum = 0;
            for (int k = 0; k < this.size; k++) {
              sum += this.getElement(i, k) * m.getElement(k, j);
            }
            result.array[i][j] = sum;
          }
        }
    
        return result;
      }

    @Override
    public String toString() {
      StringBuilder builder = new StringBuilder();
  
      for (int i = 0; i < size; i++) {
        builder.append(Arrays.toString(array [i]));
        builder.append("\n");
      }
  
      return builder.toString();
    }
}