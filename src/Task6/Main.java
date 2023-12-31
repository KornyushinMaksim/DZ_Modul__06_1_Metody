//      Напишите метод, проверяющую правильность расстановки скобок в строке, введенной с клавиатуры.
//        При правильной расстановке выполняются условия:
//        ■ количество открывающих и закрывающих скобок равно;
//        ■ внутри любой пары открывающая–соответствующая закрывающая скобка, скобки расставлены правильно.
//        В строке могут присутствовать как круглые, так и квадратные скобки (и др. символы).
//        Каждой открывающей скобке соответствует закрывающая того же типа (круглой – круглая, квадратной – квадратная).
//        Пример неправильной расстановки: ( [ a) b]
//        Пример правильных входных данных: (a[b](f[(g)(g)]))
//        Программа должна вывести результат в виде сообщения, примеры:
//        ■ Правильная строка
//        ■ Ошибка отсутствие (
//        ■ Ошибка отсутствие )
//        ■ Ошибка отсутствие [
//        ■ Ошибка отсутствие ]

package Task6;

public class Main {
    public static void main(String[] args) {
        //String str = "( ()())(] a) b]";
        String str = "(a[b](f[(g)(g)]))";

        System.out.println(TestStr.test(str));
    }
}
