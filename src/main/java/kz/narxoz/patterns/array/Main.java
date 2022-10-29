package kz.narxoz.patterns.array;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("CHOOSE DIMENSION");
        int num;
        int dimensionNum;
        dimensionNum = scan.nextInt();
        if (dimensionNum == 1) {
            System.out.println("CHOOSE LENGTH");
            int length;
            length = scan.nextInt();
            Array1D array1D = new Array1D(length);
            while (true) {
                System.out.println("PRESS [1] TO PRINT ARRAY");
                System.out.println("PRESS [2] TO FILL ARRAY WITH RANDOM NUMBERS IN GIVEN RANGE");
                System.out.println("PRESS [3] TO FIND MAX NUMBER");
                System.out.println("PRESS [4] TO FIND MIN NUMBER");
                System.out.println("PRESS [5] TO FIND SUM OF ELEMENTS");
                System.out.println("PRESS [6] TO SORT");
                System.out.println("PRESS [7] TO SORT DESC");
                System.out.println("PRESS [0] TO EXIT");
                num = scan.nextInt();
                if (num == 0)
                    break;
                else if (num == 1)
                    array1D.print();
                else if (num == 2)
                    array1D.initValues(100);
                else if (num == 3)
                    System.out.println(array1D.max());
                else if (num == 4)
                    System.out.println(array1D.min());
                else if (num == 5)
                    System.out.println(array1D.sum());
                else if (num == 6)
                    array1D.sort();
                else if (num == 7)
                    array1D.sortDesc();
            }
        } else if (dimensionNum == 2) {
            System.out.println("CHOOSE LENGTH");
            int length;
            length = scan.nextInt();
            Array2D array2D = new Array2D(length);
            while (true) {
                System.out.println("PRESS [1] TO PRINT ARRAY");
                System.out.println("PRESS [2] TO FILL ARRAY WITH RANDOM NUMBERS IN GIVEN RANGE");
                System.out.println("PRESS [3] TO FIND MAX NUMBER");
                System.out.println("PRESS [4] TO FIND MIN NUMBER");
                System.out.println("PRESS [5] TO FIND SUM OF ELEMENTS");
                System.out.println("PRESS [6] TO SORT");
                System.out.println("PRESS [7] TO SORT DESC");
                System.out.println("PRESS [0] TO EXIT");
                num = scan.nextInt();
                if (num == 0)
                    break;
                else if (num == 1)
                    array2D.print();
                else if (num == 2)
                    array2D.initValues(100);
                else if (num == 3)
                    System.out.println(array2D.max());
                else if (num == 4)
                    System.out.println(array2D.min());
                else if (num == 5)
                    System.out.println(array2D.sum());
                else if (num == 6)
                    array2D.sort();
                else if (num == 7)
                    array2D.sortDesc();
            }
        } else if (dimensionNum == 3) {
            System.out.println("CHOOSE LENGTH");
            int length;
            length = scan.nextInt();
            Array3D array3D = new Array3D(length);
            while (true) {
                System.out.println("PRESS [1] TO PRINT ARRAY");
                System.out.println("PRESS [2] TO FILL ARRAY WITH RANDOM NUMBERS IN GIVEN RANGE");
                System.out.println("PRESS [3] TO FIND MAX NUMBER");
                System.out.println("PRESS [4] TO FIND MIN NUMBER");
                System.out.println("PRESS [5] TO FIND SUM OF ELEMENTS");
                System.out.println("PRESS [6] TO SORT");
                System.out.println("PRESS [7] TO SORT DESC");
                System.out.println("PRESS [0] TO EXIT");
                num = scan.nextInt();
                if (num == 0)
                    break;
                else if (num == 1)
                    array3D.print();
                else if (num == 2)
                    array3D.initValues(100);
                else if (num == 3)
                    System.out.println(array3D.max());
                else if (num == 4)
                    System.out.println(array3D.min());
                else if (num == 5)
                    System.out.println(array3D.sum());
                else if (num == 6)
                    array3D.sort();
                else if (num == 7)
                    array3D.sortDesc();
            }
        }
    }
}