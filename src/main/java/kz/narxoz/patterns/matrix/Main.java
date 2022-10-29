package kz.narxoz.patterns.matrix;

public class Main {

    public static void main(String[] args) {
        int n = 10;
        int a[][] = new int[n][n];
        MatrixClass matrixClass = new MatrixClass();
        matrixClass.fill(a);
        matrixClass.print(a);
    }
}