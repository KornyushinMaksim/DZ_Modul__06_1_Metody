//Написать и протестировать перегруженный метод, выво- дящий на экран:
//        ■ одномерный массив типа int;
//        ■ одномерный массив типа String;
//        ■ двухмерный массив типа int;
//        ■ двухмерный массив типа float;

package Task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final int row = 4;
        final int cols = 5;
        int dig = 1;
        float digFloat = 1f;
        String str = "";

        int[] arr = Method.initArray(dig, row);
        System.out.println(Arrays.toString(arr) + "\n");

        int[][] mtrx = Method.initArray(dig, row, cols);
        System.out.println(Arrays.deepToString(mtrx) + "\n");

        String[] strArr = Method.initArray(str, 5, 5);
        System.out.println(Arrays.toString(strArr) + "\n");

        String[][] strMtrx = Method.initArray(str, 4, row, cols);
        System.out.println(Arrays.deepToString(strMtrx) + "\n");

        float[][] floatMtrx = Method.initArray(digFloat, row, cols);
        System.out.println(Arrays.deepToString(floatMtrx) + "\n");

    }
}
