import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class Lesson4 {
    public static void main(String[] args) throws IOException {

        //Пузырьковая сортировка // можно переделать на возрастание
//        int[] array = new int[]{3, 1, 2, 4};
//        for (int i = 0; i < array.length; i++) {
//            for (int j = array.length - 1; j > i; j--) {
//                if (array[j] < array[j - 1]) {
//                    int tmp = array[j - 1];
//                    array[j - 1] = array[j];
//                    array[j] = tmp;
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }

        // Многомерные массивы
        //заполнение идет 00 01 02 в начале идет заполнение строки
      /*  int[][] array = new int[3][3];
        Random random = new Random();
        for (int i = 0; i < 3; i++ ) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < 3; i++ ) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }*/

       /* Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер матрицы");
        int a = scan.nextInt();
        int[][] matrica = new int[a][a];
        for (int i = 0; i < matrica.length; i++) {
            for (int j = 0; j < matrica.length; j++) {
                matrica[i][j] = random.nextInt(50);
                System.out.print(matrica[i][j] + " ");
            }
            System.out.println(" ");
        }*/


        // №1 HW
   /*     System.out.println("Введите размер квадратной матрицы ");
        Scanner scannerOne = new Scanner(System.in);
        int a = scannerOne.nextInt();
        Random random = new Random();
        int[][] array = new int[a][a];
        int sum = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = random.nextInt(50);
                System.out.print( array[i][j] + " ");
                if (i == j && array[i][j] % 2 == 0 ){
                    sum += array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println(sum);
        */

                  //№2
    /*        Scanner scan = new Scanner(System.in);
            System.out.println("Введите размер матрицы");
            int a = scan.nextInt();
            int [][] mas = new int [a][a];
        Random ran = new Random();
        for (int i = 0; i < a; i++ ) {
            for (int j = 0; j < a; j++){
                mas[i][j] = ran.nextInt(50);
                System.out.print(mas[i][j]+ " ");
            }
            System.out.println();
            }
        System.out.println();
        for (int i = 0 ; i < a; i ++ ) {
            for (int j = 0 ; j < a; j++ ) {
                if (j < i && i !=0 ) {
                    if (mas[i][j] % 2 != 0)
                        System.out.print( mas[i][j]+ " ");
                }
            }
        }*/


        //3
        /*Scanner scannerOne = new Scanner(System.in);
        System.out.println("Введите размер квадратной матрицы: ");
        int a = scannerOne.nextInt();
        Random random = new Random();
        int[][] array = new int[a][a];

        // Создаём и выводим матрицу
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                array[i][j] = random.nextInt(10) + 1; // от 1 до 10, чтобы не было нулей
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        // Произведения диагоналей
        int prodMain = 1;   // главная
        int prodSide = 1;   // побочная

        for (int i = 0; i < a; i++) {
            prodMain *= array[i][i];             // главная диагональ (i == j)
            prodSide *= array[i][a - 1 - i];     // побочная диагональ (j = a-1-i) а всегда = 3 от суда и вычисляем что то
        }

        System.out.println("\nПроизведение главной диагонали: " + prodMain);
        System.out.println("Произведение побочной диагонали: " + prodSide);

        if (prodMain > prodSide) {
            System.out.println("Главная диагональ имеет большее произведение");
        } else if (prodMain < prodSide) {
            System.out.println("Побочная диагональ имеет большее произведение");
        } else {
            System.out.println("Произведения диагоналей равны");
        }*/


        //№4
       /* int [][] array = new int[][] {{1 ,2, 3},
                                      {4 ,5 ,6},
                                      {7 ,8 ,9}};
        int caunt = 0;

        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - 1 - i; j++ ){
                System.out.print(array[i][j] + " ");
                if (array[i][j] % 2 == 0) {
                    caunt += array[i][j];
                }
            }
            System.out.println();
        }
        System.out.println(caunt);*/


        //№5
      /*  Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a = scanner.nextInt();
        int [][] mas = new int[a][a];
        int[][] transposed = new int[a][a];


        for (int i = 0; i < mas.length; i++){
            for (int j = 0; j < mas.length; j++){
                mas[i][j] = random.nextInt(10);
                System.out.print(mas[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < mas.length; i++){
            for (int j = 0; j < mas.length; j++){
                transposed [j][i] = mas[i][j];
            }
        }

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }*/


        //№5
        char [][] array = new char[][] {{ '-' , '-', '-' },
                {'-' , '-', '-'},
                {'-' , '-', '-'}};

        for (int a = 0; a < array.length; a ++){
            for (int b = 0; b < array.length; b ++){
                System.out.print( array[a][b] + " ");
            }
            System.out.println(); }

        System.out.println("Введите место 1 x o ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Введите место 2 x o ");
        int b = scanner.nextInt();

        char c = scanner.next().charAt(0);

































        //№1
//        Random random = new Random();
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите размер матрицы");
//        int sum = 0;
//        int a = scan.nextInt();
//        int[][] matrica = new int[a][a];
//        for (int i = 0; i < matrica.length; i++) {
//            for (int j = 0; j < matrica.length; j++) {
//                matrica[i][j] = random.nextInt(50);
//                System.out.print(matrica[i][j] + " ");
//            }
//            System.out.println(" ");
//        }
//        for (int i = 0; i < matrica.length; i++) {
//            sum += matrica[i][i]; // Накапливаем сумму диагональных элементов
//        }
//
//        System.out.println("Сумма диагональных элементов: " + sum);

//          //№2
//            Scanner scan = new Scanner(System.in);
//            System.out.println("Введите размер матрицы");
//            int a = scan.nextInt();
//            int [][] mas = new int [a][a];
//        Random ran = new Random();
//        for (int i = 0; i < a; i++ ) {
//            for (int j = 0; j < a; j++){
//                mas[i][j] = ran.nextInt(50);
//                System.out.print(mas[i][j]+ " ");
//            }
//            System.out.println();
//            }
//        System.out.println();
//        for (int i = 0 ; i < a; i ++ ) {
//            for (int j = 0 ; j < a; j++ ) {
//                if (j < i && i !=0 ) {
//                    if (mas[i][j] % 2 != 0)
//                        System.out.print( mas[i][j]+ " ");
//                }
//            }
//        }

//        Random random = new Random();
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите размер матрицы");
//        int a = scan.nextInt();
//        int[][] matrica = new int[a][a];
//        for (int i = 0; i < matrica.length; i++) {
//            for (int j = 0; j < matrica.length; j++) {
//                matrica[i][j] = random.nextInt(50);
//                System.out.print(matrica[i][j] + " ");
//            }
//            System.out.println(" ");
//        }
//        int sum1 = 1;
//        int sum2 = 1;
//        for (int k = 0; k < matrica.length; k++) {
//            System.out.print(matrica[k][k] + " ");
//            sum1 *= matrica[k][k];
//        }
//        System.out.println(" 1 линия ");
//
//        for (int i = matrica.length -1; i >= 0; i--) {
//               int j = matrica.length -1 - i;
//            System.out.print(matrica[i][j] + " ");
//                sum2 *= matrica[i][j];
//
//        }
//        System.out.println(" 2 линия ");
//        System.out.println(sum1 + " sum1");
//        System.out.println(sum2 + " sum2");

//        Random random = new Random();
//        int[][] matrica = new int[3][3];
//        for (int i = 0; i < matrica.length; i++) {
//            for (int j = 0; j < matrica.length; j++) {
//                matrica[i][j] = random.nextInt(50);
//                System.out.print(matrica[i][j] + " ");
//            }
//            System.out.println(" ");
//        }
//        int sum1 = 1;
//        int sum2 = 1;
//        for (int k = 0; k < matrica.length; k++) {
//            System.out.print(matrica[k][k] + " ");
//            sum1 *= matrica[k][k];
//        }
//        System.out.println(" 1 линия ");
//
//        for (int i = matrica.length -1; i >= 0; i--) {
//            int j = matrica.length -1 - i;
//            System.out.print(matrica[i][j] + " ");
//            sum2 *= matrica[i][j];
//
//        }
//        System.out.println(" 2 линия ");
//        System.out.println(sum1 + " sum1");
//        System.out.println(sum2 + " sum2");

        //№4
//        Scanner scan = new Scanner(System.in);
//        Random ran = new Random();
//        System.out.println(" введите ");
//        int z = scan.nextInt();
//        int[][] array = new int[z][z];
//
//        for (int i = 0; i < array.length ; i++) {
//            for (int j = 0; j < array.length; j++) {
//                array[i][j] = ran.nextInt(9);
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//        System.out.println();
//
//        int sum = 0;
//        for (int i = 0; i <array.length ; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if ((i + j) < array.length -1)  {
//                    if (array[i][j] % 2 == 0 && array[i][j] != 0){
//                        System.out.print(array[i][j] + " ");
//                        sum += array[i][j];
//                    }
//                }
//            }
//
//        }
//        System.out.println();
//        System.out.println(sum);

        //№5

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введи больше 3");
//        int z = scan.nextInt();
//        Random random = new Random();
//        int[][] matrica = new int[z][z];
//
//        for (int i = 0; i <matrica.length ; i++) {
//            for (int j = 0; j < matrica.length; j++) {
//                matrica[i][j] = random.nextInt(9);
//                System.out.print(matrica[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        for (int i = 0; i <matrica.length ; i++) {
//            for (int j = 0; j < matrica.length; j++) {
//                System.out.print(matrica[j][i] + " ");
//            }
//            System.out.println();
//        }


        //№6 крестики


    }
}
