package OldLesson;

public class Lesson6 {
    public static void main(String[] args) {

        //Домашка в видосе 02.28 Калькулятор !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


        // OO
        // Модификатор_доступа возвращаемый_тип_данных название метода (аргументы) { НАШ КОД } КАК ПРИМЕР метод MAIN

        /*
        public -
        int - (или boolean, double) если void означает что метод ничего не возвращает и не где не используется
        printABC - Дальше идет название которое описывает название что там хранится
        (int a? boolean qwer) -  в круглых скобках передаем какие то переменные из вне что бы в методе их использовать ( ИСПОЛЬЗУЕТСЯ КАК ОБЪЯСЛЕНИЕ ПЕРЕМЕННОЙ)
         {}  - тут идет код
         полнсть все public static void main(String[] args) - это назвается полная сигнатура медода до круглых скоб просто сигнатура метода
         Метод в методе делать нельзя
         */


/*        printHelloWorld(); // оброщаемся к методу
       int q = calculateTwoDigits(); // берем из метода calculateTwoDigits результат и присваеваем q
       System.out.println(q);
       //System.out.println(calculateTwoDigits()); -мой тест */

//        System.out.println(isValueTrue());

//                calculateMultiplication(5, 17);//ctr + p - появятся подсказки если кусор стоит с скобках метода тип данных и название переменной
/*        int a = 5;
        double w = 17d;
        calculateMultiplication(a, w);*/

//        a();
//        a(353);

//        print();
//        increment(10);

    }

    public static void printHelloWorld() { //void - обозночает что результат нащего метода ни где не используется только вывод
        System.out.println("Hello World");
    }

    public static int calculateTwoDigits() {
        int a = 2 + 2;
        return a; // или 2+2 !return что бы могли вернуть куда то. Обязательно возвращаем тот тип данных что указан в сигнатуре
    }

    public static boolean isValueTrue() {  //если булиан то метод должен звучать как вопрос
        System.out.println("Работа в методе");
        boolean tmp = false;
        return tmp == true; // хдесь можно печатать какие то выражения
    }

    public static void calculateMultiplication(int value1, double value2) { // при вызове метода местами  переменные менять нельзя они идут по порядку  int doble
        System.out.println("пЕРВОЕ ЧИСЛО - " + value1);
        System.out.println("вТОРОЕ ЧИСЛО - " + value2);
        System.out.println("Произведение чисел - " + value1 * value2);
    }

    // Перегрузка
    public static void a() {
        System.out.println("Hello World");
    }

    public static void a(int asdf) { // надо добавить чтосто значение
        System.out.println(asdf);
    }

    public static void print() {  //рекурсия
        System.out.println("Hello World");
        print();
    }

    public static void increment(int c) { //рекурсия с условием выхода
        if (c == 10) {
            return;
        }
        c++;
        System.out.println(c);
        increment(c);
    }





}
