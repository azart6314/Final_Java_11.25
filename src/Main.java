import java.util.Arrays;

public class Main {
        public static void main(String[] args) {


/*        //тип_данных название переменной = new конструктор_класса
        Phone iphone = new Phone("Iphone Pro 1234", 1, true); //Phone тип данных
        System.out.println(iphone.expirationDate); //обращение к функциональности объекта
        System.out.println(iphone.isDevelopmentDone);
        System.out.println(iphone.model);
        System.out.println("===================");
        Phone samsung = new Phone("Somsun Galaksi", 999, false);
        System.out.println(samsung.model);
        System.out.println(samsung.isDevelopmentDone);
        System.out.println(samsung.expirationDate);*/

   /*         //вывод когда есть метод
        Phone iphone = new Phone("Iphone Pro 1234", 1, true);
        Phone samsung = new Phone("Somsun Galaksi", 999, false);
        iphone.printIfo();// та функциональность которую мы описали (метод)
        System.out.println("=========");
        samsung.printIfo();*/

        /*int[] array1 = new int[] {0, 5, 10};
        System.out.println(Arrays.toString(array1));
        a3(array1);
        System.out.println(Arrays.toString(array1));*/

        int[] array1 = new int[] {4, 17, 23, 0};
        System.out.println(Arrays.toString(array1));
        a4(array1);
        System.out.println(Arrays.toString(array1));

//        int[] array1 = new int[] {4, 17, 23, 0};
//        System.out.println(Arrays.toString(array1));
//        array1 = a5(array1);
//        System.out.println(Arrays.toString(array1));
//
    }
//
//    public static int[] a5(int[] array) {
//        array = new int[4];
//        array[1] = 20;
//        return array;
//    }

    public static void a4 (int[] array) {
        array = new int[4];
        array[1] =20;
    }


    public static void a3 ( int[] array){
        array[1] = 15;
    }


//            Сalculator calculator = new Сalculator(10, 2);
//            calculator.addition();
//            calculator.subtraction();
//            calculator.division();
//            calculator.multiplication();

//            Desktop desktop = new Desktop("M5", 111, 256, 2);
//            desktop.turnOn();
//            desktop.turnOff();





    }

