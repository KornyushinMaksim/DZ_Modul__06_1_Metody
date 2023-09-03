//      Написать и протестировать методы работы с квадратными матрицами
//      (матрицы представить в виде двухмерных массивов).
//        Должны присутствовать методы:
//        ■ создания единичной (диагональной) матрицы;
//        ■ создания нулевой матрицы;
//        ■ сложение матриц;
//        ■ умножения матриц;
//        ■ умножение матрицы на скаляр;
//        ■ определение детерминанта матрицы;
//        ■ вывод матрицы на консоль.

package Task1;

public class Main {
    public static void main(String[] args) {
        final int size = 3;
        Matrix mtr0 = new Matrix(size);         //нулевая матрица
        Matrix mtr1 = new Matrix(size);
        Matrix mtr2 = new Matrix(size);
        Matrix res = new Matrix(size);
        mtr1.initMtrx();        //инициализация рандомными числами
        mtr2.initMtrx();


        //диагональная матрица
        mtr0.diagonalMtrx();
        System.out.println("диагональная матрица\n" + mtr0.print());

        //нулевая матрица
        Matrix mtrNull = new Matrix(size);
        System.out.println("нулевая матрица\n" + mtrNull.print());

        //сложение матриц
        res = mtr1.summaMtrx(mtr2);
        System.out.printf("сложение матриц\n%s\n%s\n%s", mtr1.print(), mtr2.print(), res.print());

        //умножения матриц
        res = mtr1.multiplicationMtrx(mtr2);
        System.out.printf("умножения матриц\n%s\n%s\n%s", mtr1.print(), mtr2.print(), res.print());

        //умножение матрицы на скаляр
        int scalar = 4;
        res = mtr1.scalarMtrx(scalar);
        System.out.printf("умножение матрицы на скаляр %d\n%s\n%s",scalar , mtr1.print(), res.print());

        //определение детерминанта матрицы
        System.out.println(mtr2.print());
        //Task1.Matrix matrix = mtr1.getMinor(mtr1,0,0);        //работает только с матрицей 2х2
        System.out.println(mtr1.determinantMtrx(mtr2));

        //вывод матрицы на консоль
    }
}
