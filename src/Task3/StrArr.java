package Task3;

import java.util.Arrays;
import java.util.Collections;

public class StrArr {

    private String[] arrStr;
    private int size;

    public StrArr() {
    }

    public StrArr(int size) {
        this.size = size;
        this.arrStr = new String[this.size];
    }

    public String[] getArrStr() {
        return arrStr;
    }

    //метод заполняет рандомными строками
    public void strRandon(){
        for (int i = 0; i < size; i++) {
            StringBuffer build = new StringBuffer();
            for (int j = 0; j < (int) (Math.random() * 15 + 1); j++) {
                char ch = (char) (Math.random() * 26 + 65);
                build.append(ch);
            }
            this.arrStr[i] =String.valueOf(build);
        }
    }

    public StringBuffer printStr(){
        StringBuffer strRes = new StringBuffer();
        for (int i = 0; i < this.size; i++){
            strRes.append(this.arrStr[i]).append(" ");
        }
        return strRes;
    }

    public void sort(){
        StrArr tempObj = new StrArr();
        tempObj.arrStr = this.arrStr;
        Arrays.sort(tempObj.arrStr, Collections.reverseOrder());
    }

    public void sortOfQuantity(){
        String tempStr = "";
        for (int i = 0; i < this.size; i++){
            for (int j = 0; j < this.size - 1; j++) {
                if (this.arrStr[j].length() > this.arrStr[j + 1].length()) {
                    tempStr = this.arrStr[j];
                    this.arrStr[j] = this.arrStr[j + 1];
                    this.arrStr[j + 1] = tempStr;
                }
            }
        }
    }
}
