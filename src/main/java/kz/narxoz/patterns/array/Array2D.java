package kz.narxoz.patterns.array;

import java.util.Random;

public class Array2D implements ArrayTemplate{
    int array [][];

    Array2D(int length){
        this.array = new int[length][length];
    }

    @Override
    public void print() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }

    @Override
    public void initValues(int n) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt() % n;
            }
        }
    }

    @Override
    public int max() {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j])
                    max = array[i][j];
            }
        }
        return max;
    }

    @Override
    public int min() {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min > array[i][j])
                    min = array[i][j];
            }
        }
        return min;
    }

    @Override
    public int sum() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }

    @Override
    public void sort() {
        for (int k = 0; k < array.length; k++) {
            for (int i= 0; i < array[k].length; i++) {
                for (int j = 0; j < array[k].length; j++) {
                    if (array[k][i] < array[k][j]) {
                        int temp = array[k][i];
                        array[k][i] = array[k][j];
                        array[k][j] = temp;
                    }
                }
            }
        }
    }

    @Override
    public void sortDesc() {
        for (int k = 0; k < array.length; k++) {
            for (int i= 0; i < array[k].length; i++) {
                for (int j = 0; j < array[k].length; j++) {
                    if (array[k][i] > array[k][j]) {
                        int temp = array[k][i];
                        array[k][i] = array[k][j];
                        array[k][j] = temp;
                    }
                }
            }
        }
    }
}