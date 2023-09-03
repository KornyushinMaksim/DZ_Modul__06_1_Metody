package Task2;

import java.util.Random;

class Method {
    static public int[] initArray(int a, int cols) {
        int[] tempArr = new int[cols];
        for (int i = 0; i < cols; i++){
            tempArr[i] = (int)(Math.random() * 100);
        }
        return tempArr;
    }
    static public int[][] initArray(int a, int row, int cols) {
        int[][] tempArr = new int[row][cols];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < cols; j++) {
                tempArr[i][j] = (int) (Math.random() * 100);
            }
        }
        return tempArr;
    }
    static public String[] initArray(String a, int strLength, int cols) {
        String[] tempArr = new String[cols];
        Random rand = new Random();
        for (int i = 0; i < cols; i++){
            StringBuffer build = new StringBuffer();
            for (int j = 0; j < strLength; j++) {
                char ch = (char) (rand.nextInt(26) + 65);
                build.append(ch);
            }
            tempArr[i] = String.valueOf(build);
        }
        return tempArr;
    }
    static public String[][] initArray(String a, int strLength, int row, int cols) {
        String[][] tempArr = new String[row][cols];
        Random rand = new Random();
        for (int i = 0; i < row; i++){
            for (int j = 0; j < cols; j++) {
                StringBuffer build = new StringBuffer();
                for (int f = 0; f < strLength; f++) {
                    char ch = (char) (Math.random() * 26 + 65);
                    build.append(ch);
                }
                tempArr[i][j] = String.valueOf(build);
            }
        }
        return tempArr;
    }

    static public float[][] initArray(float a, int row, int cols) {
        float[][] tempArr = new float[row][cols];
        for (int i = 0; i < row; i++){
            for (int j = 0; j < cols; j++) {
                tempArr[i][j] = (float) (Math.random() * 100);
            }
        }
        return tempArr;
    }

}
