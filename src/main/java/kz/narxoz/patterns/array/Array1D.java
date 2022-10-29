package kz.narxoz.patterns.array;

import java.util.Random;

public class Array1D implements ArrayTemplate{
    int array [];

    Array1D(int length){
        this.array = new int[length];
    }

    @Override
    public void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    @Override
    public void initValues(int n) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt()%n;
        }
    }

    @Override
    public int max() {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }

    @Override
    public int min() {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i])
                min = array[i];
        }
        return min;
    }

    @Override
    public int sum() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    @Override
    public void sort() {
        int key, j;
        for (int i = 1; i < array.length; i++) {
            key = array[i];
            j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j -= 1;
            }
            array[j + 1] = key;
        }
    }

    @Override
    public void sortDesc() {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            boolean sorted = true;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    sorted = false;
                }
            }
            if (sorted == true)
                break;
        }
    }
}