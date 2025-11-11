package OldLesson.Hw_6_Java;

public class Homework_6_java {
        // Практика на уроке
//    Создать класс Калькулятор
//    В нем будет 2 переменные.
//    Создать конструктор для инициализации этих полей.
//    Создать 4 метода, которые реализуют основные математические операции


    public static void main(String[] args) {

      /*  Scanner scanner = new Scanner(System.in);

        System.out.println("Ввеите первую переменную");
        int first = scanner.nextInt();

        System.out.println("Введите вторую переменную");
        int second = scanner.nextInt();

        System.out.println("Введите матиматический знак " +
                "1 = + ; " +
                "2 = - ; " +
                "3 = * ; " +
                "4 = / ;");
        int sign = scanner.nextInt();

        Calculator calculator = new Calculator(first, second);
        if (sign == 1) {
            calculator.addition();
        } else if (sign == 2) {
            calculator.subtraction();
        } else if (sign == 3) {
            calculator.multiplication();
        } else if (sign == 4) {
            calculator.division();
        } else if (sign != 1 && sign != 2 && sign != 3 && sign != 4) {
            System.out.println("Выбрали не верный математический знак");
        } else if (second == 0 && sign == 4 ) {
            System.out.println("Деление на ноль запрещено");
        }*/




        //!!!! Домашка пошла

//        Создать класс компьютер.
//                Поля:
//        - процессор (String)
//        - оперативка (int)
//        - жесткий диск (int)
//        - ресурс полных циклов работы (включений/выключений) (int)
//                Методы:
//        - метод описание(вывод всех полей)
//        - метод включить, при включении может произойти сбой, при вывзове метода рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если угадали комп включается, если нет сгорает.Если комп сгорел, при попытке включить нужно выдать сообщение что ему конец
//        - выключить (аналогично включению)
//        - при превышении лимита ресурса комп сгорает



        PC honer = new PC("HD", 600, 1000, 1);
       /* honer.printInfoPC();
        System.out.println();
        honer.tornOn();
        honer.tornOf();*/
        honer.OllMyMetods();
//ssss


    }
}
