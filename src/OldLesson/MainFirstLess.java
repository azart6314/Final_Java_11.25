package OldLesson;

public class MainFirstLess {
    public static void main(String[] args) {

        // Операторы if / else / else if
      /*  if (5 < 3) {
            System.out.println("Hello worls");
        } else {
            System.out.println("Codding is false");
        }*/

      /*  if (5 < 3) {
            System.out.println("5 < 3 ");
        } else if (6 < 3) {
            System.out.println("6 < 3");
        } else if (5 > 3) {
            System.out.println("5 > 3");
        }*/

        /*if (5 == 5) {
            System.out.println("5 == 5");
        }
        if (5 != 4) {
            System.out.println("5 ! =4");
        }
        if (!false) {
            System.out.println("Инверсия false ");
        }

        int a = 5;
        if (a > 0 && a < 10) {
            System.out.println("А позитивное ");
        }

        if (a > 0 || a < 0) {
            System.out.println("А не равно нулю");
        }*/


        //Свич кейсы
       /* switch ( condition value) {
            case <value> :
            case <value> :
        }*/

     /*   int a = 4;
        switch (a){
            case 1:
                System.out.println("1");
                break; // если кейс верный и нет брейка то идет этот ответ и смотриться далее
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("default");
        }*/

        // Тернарный оператор  condition ? value if true : value if false

       /* int a = 5;
        int b = a == 5 ? a * 10 : a / 5;
        System.out.println(b);
       // System.out.println(b = a == 5 ? a * 10 : a / 5);*/


        //Циклы
        //--- ЦИкл FOR
       /* for (int i = 0; i < 10 || i < 100; i++){
            System.out.println(i);
        }*/

        /*for (int a = 0; a < 10; a++){
            System.out.println(a + " - ");
            for (int j = 0; j < 5; j++){
                System.out.println(j);
            }
        }*/

        // -- WHILE ЦИКЛ
     /*   int a = 0;
        while (a < 10){
            System.out.println(a);
            a ++;
        }*/

        // -- DO WHILE ЦМКЛ КОТОРЫЙ ГАРАНТИРУЕТ ВЫПОЛНЕНИЕ ЕГО ХОТЬ РАЗ
       /* int a = 0;
        do {
            System.out.println(a);
            a++;
        } while (a <= 0);*/

        // -- Бесконечныые циклы
       /* for (int i = 0;; i++){
            System.out.println(i);
        }*/

        // ////////////

    /*    while (true){

        }*/

        // ////////////
        /*do {

        } while (true);*/

        // breake;
      /*  for (int i = 0; i < 10; i++){
            System.out.println(i);
            if (i ==5){
                System.out.println(i + " break");
                break;
            }
            System.out.println(i + " ----------");
        }*/

        // ---- CONTINUE;
       /* for (int i = 0; i < 10; i++){
            if (i ==5){
                continue;
            }
            System.out.println(i);
        }*/

        // --ДОМАШКА --------
        // №1
       /* int a = 0;
        if ( a > 0) {
            if (a > 0 && a < 10){
                System.out.println("Число " + a + " положительное и однозначное");
            }
            if (a > 9 && a < 100) {
                System.out.println("Число " + a + " положительное и двух значное");
            }
        } else if (a < 0 ) {
            if (a < 0 && a > -10 ) {
                System.out.println("Число " + a + " отрицательное и однозначное");
            }
            if (a < -9 && a > -100) {
                System.out.println("Число " + a + " отрицательное и двухзначное");
            }
        } else {
            System.out.println("Число " + a + "  и однозначное");
        }*/

   /*     int a = 11;
        int b = 5;
        int c = 9;

        if (a + b > c && a + c > b && b + c > a ) {
            System.out.println("Треугольник существует ");
        } else {
            System.out.println("Треугольник не существует");
        }*/
/*
        int a = 0;
        if (a > 0) {
            a += 1;
            System.out.println(a);
        } else if (a < 0 ) {
            a -= 2;
            System.out.println(a);
        } else {
            a = 10;
            System.out.println(a);
        }*/

        /*int a = -3;
        int b = -3;
        int c = -2;
        if (a > 0 && b > 0 && c > 0 ) {
            System.out.println("Дано три положительных числа");
        } else if ((a > 0 && b > 0 && c < 0) || (a > 0 && b < 0 && c > 0) || (a < 0 && b > 0 && c > 0)) {
            System.out.println("Дано два положительны и одно отрицательное число ");
        } else if ((a > 0 && b < 0 && c < 0) || (a < 0 && b < 0 && c > 0) || (a < 0 && b > 0 && c < 0)) {
            System.out.println("Дано одно положительное число");
        } else {
            System.out.println( "Все числа отрицательные");
        }

        System.out.println();
        System.out.println("================================================");

        int count = 0; // Создаем счетчик положительных чисел
        int otricCaunt = 0;
        if (a > 0) {
            count++;
        } else if (a < 0) {
            otricCaunt++;
        }
        if (b > 0) {
            count++; // Увеличиваем счетчик, если 'b' положительное
        }else if (b < 0) {
            otricCaunt++;
        }
        if (c > 0) {
            count++; // Увеличиваем счетчик, если 'c' положительное
        }else if (c < 0) {
            otricCaunt++;
        }

        System.out.println("Количество положительных чисел: " + count);
        System.out.println("Количество отрицательных чисел: " + otricCaunt);*/

       /* int a = 11;
        int b = 11;
        if (a > b) {
            System.out.println(a);
        } else if (b > a) {
            System.out.println(b);
        } else {
            System.out.println( "Числа равны");
        }*/

        /*int a = 22;
        if (a == 1 || a == 21 || a == 31 || a == 41 || a == 51 || a == 61 || a == 71 ) {
            System.out.println(a + " Програмист");
        }
        if ((a > 1 && a < 5) || (a > 21 && a < 25) || (a > 31 && a < 35) || (a > 41 && a < 45)) {
            System.out.println(a + " Програмиста");
        } if ((a > 4 && a < 21) || (a > 24 && a < 31)) {
            System.out.println(a + " Програмистов");
        }*/

        // / ///////////////////////////////////////////////

      /*  double distance = 10;   // первый день
        double total = 0;

        for (int day = 1; day <= 7; day++) {
            total += distance;
            System.out.println("День " + day + ": " + distance + " км");
            distance += distance * 0.1; // увеличение на 10%
        }

        System.out.println("Общий путь за 7 дней: " + total + " км");*/

        // №2 ////////////////////////////////////////////

       /* int amoeba = 1;  // начальное количество амеб
        int hoursStep = 3;

        for (int hours = hoursStep; hours <= 24; hours += hoursStep) {
            amoeba *= 2; // каждые 3 часа каждая амеба делится на 2
            System.out.println("Через " + hours + " часа(ов): " + amoeba + " амеб");
        }

        System.out.println("Общее количество через 24 часа: " + amoeba);*/

        // №3 ///////////////////////////////////////////////////////////

     /*   int a = 1;
        int sum = 1;
        for (int i = 0; ; i++){
            sum += a;
            System.out.println(sum);
            if (a == 256) {
                break;
            }
            a *= 2;
        }
        System.out.println( "Итоговоая " + sum);*/

        // №4 /////////////////////////////////////////

     /*   int a = 5;
        int b = 10;
        int sum = 0;
        for (int i = 0; i < b; i++ ){
            sum += a;
        }
        System.out.println(sum);*/

        // №5 /////////////////////////////////////////
      /*  int inch = 1;
        double sm = 2.54;
        double transleit = 0;

        for (int i = 0; i < 20; i++) {
            transleit = inch * sm;
            System.out.println(inch + " Дюйм равен " + transleit + " См");
            inch += 1;
        }*/

        // №6 /////////////////////////////////////////

      /*  int a = 1;
        for (int i = 0; i < 100; i++){
            if (a % 2 == 0) {
                System.out.println(a);
            }
            a += 1;
        }*/
        /*for (int a = 2; a <= 100; a += 2){
            System.out.println(a);
        }*/

        // №7 /////////////////////////////////////////
       /* int sum = 0;        // сюда складываем все нечетные числа

        for (int i = 1; i <= 99; i += 2) { // перебор всех нечетных чисел
            sum += i;                      // добавляем каждое к сумме
            System.out.println(sum);       // можно видеть, как растет сумма
        }

        System.out.println("Final: " + sum); // выводим результат*/

        // №8 /////////////////////////////////////////



      /*  for (int a = 1; a < 9; a++) {
            if (a < 4) {
                for (int b = 0; b < a; b++) {
                    System.out.print("*");
                }
                System.out.println();
            } else if (a > 5) {
                for (int b = 9; b > a; b--) {
                    if (a == 7 && b == 9) {
                        System.out.print(" ");
                    }
                    else if (a == 8){
                        for (int d = 0; d < 2; d++){
                            System.out.print(" ");
                        }
                    }
                    System.out.print("*");
                }
                System.out.println();
            } else System.out.println();
        }*/

        // №9 /////////////////////////////////////////

       /* int d = 10;

        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 0; i < d; i++) {
            if (a == 0 && b == 1) {
                System.out.println(a);
                System.out.println(b);
            }
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }*/

        // №10 /////////////////////////////////////////

      /*  int a = 20;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i);
            }
        }*/

        // №11 /////////////////////////////////////////
















     /*   1)Начав тренировки, спортсмен в первый день пробежал 10 км. Каждый
        день он увеличивал дневную норму на 10% нормы предыдущего дня. Какой
        суммарный путь пробежит спортсмен за 7 дней?
                2)Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
                сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
        3)Вычислить: 1+2+4+8+…+256
        4)Составьте программу, вычисляющую A*B, не пользуясь операцией
        умножения.
        5)Напишите программу печати таблицы перевода расстояний из дюймов в
        сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см
        6)Напишите программу вывода всех четных чисел от 2 до 100
        включительно
        7)Напишите программу, определяющую сумму всех нечетных чисел от 1
        до 99
        8)
*

***


***

    *
        9) Реализация числа Фибоначчи
        10) Выведите на экран все положительные делители натурального числа
        11) Определить, является ли число простым
        12)В переменную присвойте какое-то число. Посчитайте сумму его цифр. Представим, что вводимое число неизвестно заранее.
*/

    }
}

