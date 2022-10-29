package kz.narxoz.patterns.matrix;

import java.util.Random;

public class MatrixClass implements Matrix{
    @Override
    public void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }

    @Override
    public void fill(int[][] matrix) {
        Random random = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j]=random.nextInt()%100;
            }
        }
    }

    @Override
    public int[][] sum(int[][] matrix1, int[][] matrix2) {
        return new int[0][];
    }

    @Override
    public int[][] minus(int[][] matrix1, int[][] matrix2) {
        return new int[0][];
    }

    @Override
    public int[][] multiply(int[][] matrix1, int[][] matrix2) {
        return new int[0][];
    }

    @Override
    public int[][] inverse(int[][] matrix1) {
        return new int[0][];
    }

    @Override
    public double det(int[][] matrix1) {
        return 0;
    }
}