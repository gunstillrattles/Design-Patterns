package kz.narxoz.patterns.matrix;

public interface Matrix {
    public void print(int matrix[][]);
    public void fill(int matrix[][]);
    public int[][] sum(int matrix1[][], int matrix2[][]);
    public int[][] minus(int matrix1[][], int matrix2[][]);
    public int[][] multiply(int matrix1[][], int matrix2[][]);
    public int[][] inverse(int matrix1[][]);
    public double det(int matrix1[][]);
}
