package Task1;

public class Matrix {
    private int[][] mtrx;

    private int size;
    private int res;

    public Matrix() {
    }

    public Matrix(int size) {
        this.size = size;
        this.res = 0;
        this.mtrx = new int[this.size][this.size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.mtrx[i][j] = 0;
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void initMtrx() {
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                this.mtrx[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    public void diagonalMtrx() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    this.mtrx[i][j] = (int) (Math.random() * 10);
                }
            }
        }
    }

    public Matrix summaMtrx(Matrix obj) {
        Matrix tempMtrx = new Matrix(this.size);
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                tempMtrx.mtrx[i][j] = this.mtrx[i][j] + obj.mtrx[i][j];
            }
        }
        return tempMtrx;
    }

    public Matrix multiplicationMtrx(Matrix obj) {
        Matrix tempMtrx = new Matrix(this.size);
        for (int i = 0; i < size; i++) {
            for (int u = 0; u < size; u++) {
                for (int j = 0; j < size; j++) {
                    tempMtrx.mtrx[i][u] += this.mtrx[i][j] * obj.mtrx[j][u];
                }
            }
        }
        return tempMtrx;
    }

    public Matrix scalarMtrx(int scalar){
        Matrix tempMtrx = new Matrix(this.size);
        for (int i = 0; i < this.size; i++){
            for (int j = 0; j < this.size; j++){
                tempMtrx.mtrx[i][j] = this.mtrx[i][j] * scalar;
            }
        }
        return tempMtrx;
    }

    public int determinantMtrx(Matrix obj){
//        int res = 0;
        if (obj.mtrx.length == 2){
            this.res = obj.mtrx[0][0] * obj.mtrx[1][1] - obj.mtrx[1][0] * obj.mtrx[0][1];
        } else {
            int k = 1;
            for (int i = 0; i < obj.mtrx.length; i++) {
                if (i % 2 == 1) {
                    k = -1;
                } else {
                    k = 1;
                }
                this.res += k * obj.mtrx[0][i] * this.determinantMtrx(getMinor(this, 0, i));
            }
        }
        return this.res;
    }

    public Matrix getMinor(Matrix obj, int row, int cols){
        Matrix tempMtrx = new Matrix(this.size - 1);
        int passRow = 0;
        int passCols;
        for (int i = 0; i < tempMtrx.mtrx.length; i++){
            passCols = 0;
            for (int j = 0; j < tempMtrx.mtrx.length; j++){
                if (i == row){
                    passRow = 1;
                } else {
                    if (j == cols) {
                        passCols = 1;
                    } else {
                        tempMtrx.mtrx[i - passRow][j - passCols] = obj.mtrx[i][j];
                    }
                }
            }
        }
        //int res = 0;
//        int res1= 1;
//        int res2= 1;
//        for (int i = 0; i < this.size - 1; i++){
//            for (int j = 0; j < this.size - 1; j++){
//                if (i == j) {
//                    res1 *= tempMtrx.mtrx[i][j];
//                }
//                if (i + i == j + i){
//                    res2 *= tempMtrx.mtrx[i][j];
//                }
//            }
//        }

        return tempMtrx;
    }

    public String print() {
        String str = "";
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                if (this.mtrx[i][j] < 10) {
                    str += (this.mtrx[i][j] + "  ");
                } else {
                    str += this.mtrx[i][j] + " ";
                }
            }
            str += "\n";
        }
        return str;
    }
}

