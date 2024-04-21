import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] a = new int[10];
        a[0] = 1;
        // 2d array
        int[][] b = new int[4][3];
        /*
         * this array will be
         * [0,0][0,1][0,2]
         * [1,0][1,1][1,2]
         * [2,0][2,1][2,2]
         * [3,0][3,1][3,2]
         */
        Scanner sc = new Scanner(System.in);
        // now to take input in this matrix
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                int input;
                input = sc.nextInt();
                b[i][j] = input;
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
