package sk.itsovy.kovalcik.skola;

public class Matice {

    public static void main(String[] args) {
        int[][] array = {
                {9,0,0,0,0},
                {1,9,0,0,0},
                {2,1,9,0,0},
                {3,2,1,9,0},
                {4,3,2,1,9}
        };

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();

        }
        System.out.println("\n");

        /*
        [1,0]
        [2,0] [2,1]
        [3,0] [3,1] [3,2]
        [4,0] [4,1] [4,2] [4,3]
         */

        int sum = 0;
        double count = 0;
        int max = 0;
        int min = array[0][0];

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(array[i][j] + " ");
                sum += array[i][j];
                count++;
                if (max < array[i][j]) {
                    max = array[i][j];
                }
                if (array[i][j] < min) {
                    min = array[i][j];
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("SUM: " + sum);
        System.out.println("AVG: " + sum / count);
        System.out.println("MAX: " + max);
        System.out.println("MIN: " + min);
    }
}
