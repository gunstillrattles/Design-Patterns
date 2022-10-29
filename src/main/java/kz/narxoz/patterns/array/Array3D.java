package kz.narxoz.patterns.array;

import java.util.Random;

public class Array3D implements ArrayTemplate{
    int array [][][];

    Array3D(int length){
        this.array = new int[length][length][length];
    }

    @Override
    public void print() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i].length; k++) {
                    System.out.print(array[i][j][k] + "\t");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    @Override
    public void initValues(int n) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i].length; k++) {
                    array[i][j][k] = random.nextInt() % n;
                }
            }
        }
    }

    @Override
    public int max() {
        int max = array[0][0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i].length; k++) {
                    if (max < array[i][j][k])
                        max = array[i][j][k];
                }
            }
        }
        return max;
    }

    @Override
    public int min() {
        int min = array[0][0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i].length; k++) {
                    if (min > array[i][j][k])
                        min = array[i][j][k];
                }
            }
        }
        return min;
    }

    @Override
    public int sum() {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i].length; k++) {
                    sum += array[i][j][k];
                }
            }
        }
        return sum;
    }

    @Override
    public void sort() {
        for (int l = 0; l < array.length; l++) {
            for (int k = 0; k < array.length; k++) {
                for (int i = 0; i < array[k].length; i++) {
                    for (int j = 0; j < array[k].length; j++) {
                        if (array[l][k][i] < array[l][k][j]) {
                            int temp = array[l][k][i];
                            array[l][k][i] = array[l][k][j];
                            array[l][k][j] = temp;
                        }
                    }
                }
            }
        }
    }

    @Override
    public void sortDesc() {
        for (int l = 0; l < array.length; l++) {
            for (int k = 0; k < array.length; k++) {
                for (int i = 0; i < array[k].length; i++) {
                    for (int j = 0; j < array[k].length; j++) {
                        if (array[l][k][i] > array[l][k][j]) {
                            int temp = array[l][k][i];
                            array[l][k][i] = array[l][k][j];
                            array[l][k][j] = temp;
                        }
                    }
                }
            }
        }
    }
}