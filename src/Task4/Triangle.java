package Task4;

public class Triangle {

    private int[][] triangle;
    private int row;
    private int cols;
    private int remember;

    public Triangle() {
    }

    public Triangle(int row) {
        this.row = row;
        this.cols = row * 2;
        this.triangle = new int[row][cols * 2];
    }

    public int[][] getTriangle() {
        return triangle;
    }

    public void setRemember(int remember) {
        this.remember = remember;
    }

    public void initTriangle() {
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.cols; j++) {
                if ((j >= this.cols / 2 - i) && (j <= this.cols / 2 + i)) {
                    this.triangle[i][j] = (int)(Math.random() * 10);
                } else{
                    this.triangle[i][j] = -1;
                }
                if (i % 2 == 0 && j % 2 == 0){
                    this.triangle[i][j] = -1;
                } else if (i % 2 == 1 && j % 2 == 1){
                    this.triangle[i][j] = -1;
                }
            }
        }
    }

    private static void recordRemember(int cols, Triangle obj){
        for (int i = 0; i < 1; i++){
            for (int j = 0;j < cols; j++) {
                if (obj.triangle[i][j] != -1) {
                    obj.setRemember(obj.triangle[i][j]);
                    break;
                }
            }
        }
    }

    public StringBuffer print(){
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < this.row; i++){
            for (int j = 0; j < this.cols; j++){
                if (this.triangle[i][j] == -1){
                    str.append(" ");
                } else {
                    str.append(this.triangle[i][j]);
                }
            }
            str.append("\n");
        }
        return str;
    }

    public StringBuffer pathToTriangle(){
        Triangle.recordRemember(this.cols, this);
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < this.row - 1; i++){
            for (int j = 0; j < this.cols; j++){
                if(this.triangle[i][j] == this.remember) {
                    if (this.triangle[i + 1][j - 1] > this.triangle[i + 1][j + 1]) {
                        this.remember = this.triangle[i + 1][j - 1];
                        str.append("влево").append("\n");
                    } else if (this.triangle[i + 1][j - 1] < this.triangle[i + 1][j + 1]) {
                        this.remember = this.triangle[i + 1][j + 1];
                        str.append("вправо").append("\n");

                    }
                }
            }
        }
        return str;
    }
}
