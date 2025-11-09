package OldLesson.Hw_6_Java;

import java.util.Scanner;

public class Homework_6_java {
//    Создать класс Калькулятор
//    В нем будет 2 переменные.
//    Создать конструктор для инициализации этих полей.
//    Создать 4 метода, которые реализуют основные математические операции


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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
        }


    }
}
