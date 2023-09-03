//      В массиве хранится n явно заданных текстовых строк. Создать метод:
//        ■ выводящий содержимое массива в строку через пробел;
//        ■ сортирующий массив в обратном порядке (без учета
//        регистра) от z до a;
//        ■ сортирующий массив по количеству слов в строке (слова
//        разделены пробелами).
//        Программа должна вывести строки в начальном и отсортированном порядке.
//        Дополнительно: 1 балл за генерацию случайных уникальных строк реализованных в виде метода.

package Task3;

public class Main {
    public static void main(String[] args) {
        final int size = 5;
        StrArr strArr = new StrArr(size);
        strArr.strRandon();
        System.out.println(strArr.printStr());

        StrArr strArrSort = strArr;
        strArrSort.sort();
        System.out.println(strArrSort.printStr());

        StrArr strArrSortQuantity = strArr;
        strArrSortQuantity.sortOfQuantity();
        System.out.println(strArrSortQuantity.printStr());
    }
}
