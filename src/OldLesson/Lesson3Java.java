package OldLesson;

public class Lesson3Java {
    public static void main(String[] args) {


//        int [] array = new int [3]; //new выдели нам участок памяти и верни нам участок памяти ссылку
//        array [0] = 15;
//        array [1] = 9;
//        array [2] = 1234;
//
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);

        //другой способ создания массива
//        int[] array = new int[] {4, 77, 7, 10};
//        System.out.println(array[0]);
//        System.out.println(array[1]);
//        System.out.println(array[2]);
//        System.out.println(array[3]);

//        int [] array = new int [3]; //new выдели нам участок памяти и верни нам участок памяти ссылку
//        array [0] = 15;
//        array [1] = 9;
//        array [2] = 1234;
//        //for (int i = 0; i < 3; i++) {
//        for (int i = 0; i < array.length; i++) {  //length - будем получать длинну нашего массива
//            System.out.println(array[i]);
//        }



//        Scanner scanner = new Scanner(System.in); // сканер позволяет считывать входной поток данных
//        System.out.println("введи знач с клавы");
//        int a = scanner.nextInt(); // nextInt - позволяет запросить ввод значения с клавиатуры так как nextInt ( принимает только инты значение можно менять)
//        System.out.println(a);



//        Random random = new Random(); // создает генирацию рандомных символов ( рандом тип данных)
//        int a = random.nextInt(50); //указываем правую граниу длинны массива создая рандомну длинну
//        System.out.println(a);



//        int[] array = new int[10];
//        Random random = new Random(); //Random - это тип данных далее название переменных ОБЪЯСНЕНИЕ 1.06
//        for (int i = 0; i < array.length; i++ ) {
//            //  array[i] = -50 + random.nextInt(50); //для создания отрицательных чисел
//            array[i] = random.nextInt(50); // позволяет создавать в каждый индекс рандомное число до 50
//            //System.out.println(array[i]); - так на практике писать
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }



//        int[] array = new int[10];
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = -20 + random.nextInt(50);
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        int sum = 0;
//        for (int i = 0; i < array.length; i++ ) {
//            if (array[i] > 0) {
//                sum += array[i];
//            }
//        }
//        System.out.println(sum);

        //№ 1
        /*int[] mas = new int [10];
        for (int i = 0, value = 2; i < mas.length; i++, value += 2){
            mas[i] = value;
        }
        for (int i =0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            System.out.println(mas[i]);
        }*/


        //№ 2
        /*int[] array = new int[50];
        for (int i = 0, value = 1; i < array.length; i++, value += 2) {
            array[i] = value;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 49; i >= 0 ;i--){
            System.out.print(array[i] + " ");
        }*/


        //№ 3
        /*int caunt = 0;
        int[] mas = new int[15];
        Random random = new Random();

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(99);
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " ");
            if (mas[i] % 2 == 0) {
                caunt += 1;
            }
        }
        System.out.println();
        System.out.println(caunt);*/

        //№ 4
     /*   int[] mas = new int[20];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(20);
            System.out.print( mas[i] + " ");
        }
        System.out.println();
        for ( int i = 0; i < mas.length; i++) {
        if (mas[i] % 2 != 0 ){
            mas[i] = 0;

        }
            System.out.print(mas[i] + " ");
        }*/

        //№ 5
        /*Random random = new Random();
        int[] array = new int[5];
        int[] mas = new int[5];
        int caunt1 = 0;
        int caunt2 = 0;

        for (int i = 0, y = 0; i < array.length; i++, y ++){
            array[i] = random.nextInt(15);
            mas[y] = random.nextInt(15);
        }
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
            caunt1 += array[i];
        }
        System.out.println();
        for (int y = 0; y < mas.length; y++){
            System.out.print(mas[y] + " ");
            caunt2 += mas[y];
        }
        System.out.println();
        if (caunt1 > caunt2) {
            System.out.println("Значение массива array = " + caunt1 + " Оно больше значения массива mas = " + caunt2 );
        } else if (caunt2 > caunt1) {
            System.out.println("Значение массива  mas = " + caunt2 + " Оно больше значения массива array = " + caunt1 );
        } else {
            System.out.println(" Значение массивов равно");
        }*/


        //№ 6
      /*  Random mix = new Random();
        int[] mas = new int[4];
        boolean istina = true;

        for (int i = 0; i < mas.length; i ++){
            mas[i] = mix.nextInt(11);
            System.out.print(mas[i] + " ");

            }
        System.out.println();
        for (int i = 0; i < mas.length - 1; i++) {
            if (mas[i] >= mas[i + 1]){
                istina = false;
                break;
            }
        }
        if (istina) {
            System.out.println(" строго возврастающее");
        } else {
            System.out.println("не возрастающее");
        }*/


        //№ 7
      /*  Random random = new Random();
        int[] mas = new int[12];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(16);
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        int max = mas[0];
        for (int i = 0; i < mas.length; i++){
            if (mas[i] > max){
                max = mas[i];
            }
        }
        int lastIndex = 0;
        for (int i = 1; i < mas.length; i++){
            if (mas[i] == max){
                lastIndex = i;
            }
        }
        System.out.println("Максимальное число: " + max);
        System.out.println("Индекс последнего вхождения максимума: " + lastIndex);*/


        //№ 8
        /*Random mix = new Random();
        int[] mas1 = new int[10];
        int[] mas2 = new int[10];
        float[] mas3 = new float[10];
        int count = 0;

        for (int i = 0; i < mas1.length; i++){
            mas1[i] = mix.nextInt(10);
            System.out.print(mas1[i] + " ");
        }
        System.out.println();

        for (int y = 0; y < mas2.length; y++){
            mas2[y] = mix.nextInt(10);
            System.out.print(mas2[y] + " ");
        }
        System.out.println();

        for (int i = 0; i < mas3.length; i++){
            if (mas2[i] == 0) {
                mas3[i] = 0;
                continue;
            } else {
                mas3[i] = (float) mas1[i] / mas2[i];
            }
            System.out.print(mas3[i] + " ");
            if (mas3[i] == (int) mas3[i]){
                count++;
            }
        }
        System.out.println();
        System.out.println(count);*/





        //№ 9 /////////////////////////

       /* System.out.println("ведите четное положительное число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Random random = new Random();
        int[] mas = new int[a];
        int b = a / 2;
        int left = 0;
        int rite = 0;
        if (a > 0 && a % 2 == 0 ) {
            for (int i = 0; i < mas.length; i++) {
                mas[i] = random.nextInt(16);
                System.out.print(mas[i] + " ");
                if (i < b){
                    left += mas[i];
                } else if (i >= b)                 {
                    rite += mas[i];
                }
            }

        }else {
            System.out.println(" В ведено не верное число");
        }
        System.out.println();
        if (left > rite){
            System.out.println("Левая часть больше " + left + " > " + rite  );
        } else if (rite > left) {
            System.out.println("Правая часть больше " + left + " < " + rite);
        } else {
            System.out.println(" Части равны " + left + " = " + rite);
        }*/


        //№ 10

       /* System.out.println("Введите число больше 3");
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] mas1 = new int[n];
            Random random = new Random();
            int caunt = 0;
        if (n > 3) {
            for (int i = 0; i < mas1.length; i ++){
                mas1[i] = random.nextInt(n + 1);
                System.out.print(mas1[i] + " ");
                if (mas1[i] % 2 == 0 ) {
                    caunt++;
                }
            }
        } else {
            System.out.println("Введено не верное число =" + n);
        }
        System.out.println();
        System.out.print(caunt + " ");
        System.out.println();

        int idex = 0;
        int[] mas2 = new int[caunt ];
        for ( int i = 0; i < mas1.length; i++){
            if (mas1[i] % 2 == 0){
                mas2[idex] = mas1[i];
                idex++;
            }
                }
        for (int i = 0; i < mas2.length; i ++){
            System.out.print( mas2[i] + " ");
        }*/




      /*  System.out.println("Введите число больше 3");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 3) {
            System.out.println("Введено не верное число " + n +
                    " Повторите попытку");
            scanner.close();
            return;
        }

        int[] mas1 = new int[n];
        Random random = new Random();
        int caunt = 0;
        for (int i = 0; i < mas1.length; i ++) {
            mas1[i] = random.nextInt(n + 1);
            System.out.print(mas1[i] + " ");
            if (mas1[i] % 2 == 0) {
                caunt++;
            }
        }
        System.out.println();
        System.out.println(  "Длинна второго массива = " + caunt);

        int[] mas2 = new int[caunt];
        int index = 0;
        for (int i = 0; i < mas1.length; i++){
            if (mas1[i] % 2 == 0) {
                mas2[index] = mas1[i];
                index++;
            }
        }
        for (int i = 0; i < mas2.length; i++){
            System.out.print( mas2[i] + " ");
        }*/


        //№11
       /* int [] array = new int[]{64, 42 , 73, 41, 31, 53, 57, 46, 74, 9 };
        System.out.println(Arrays.toString(array));
        System.out.println();
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
        for (int i = 1; i < array.length ; i++){
            if (array[i] < array[i - 1]){
                int temp = array[ i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
                isSorted = false;
            }
        }
            System.out.println(Arrays.toString(array));
        }
*/


        // второй пункт дз
        //№1

       /* Random random = new Random();
        int[] mas1 = new int[10];
        int count = 0;

        for (int i = 0; i < mas1.length; i ++){
            mas1[i] = random.nextInt(20);
            System.out.print(mas1[i] + " ");
            if (mas1[i] % 3 == 0 && mas1[i] != 0){
                count++;
            }
        }
        System.out.println();

        int[] mas2 = new int[count];
        int index  = 0;
        int product = 1;
        for (int i = 0; i < mas1.length; i++){
            if (mas1[i] % 3 == 0 && mas1[i] != 0) {
                mas2[index ] = mas1[i];
                System.out.print(mas2[index ] + " ");
                product *= mas2[index];
                index ++;
            }
        }
        System.out.println();
        System.out.println("Произведение элементов, кратных 3: " + product);*/

        //№2
       /* Random random = new Random();
        int[] mas = new int[10];
        int count = 0;
        double sum = 0;
        for (int i = 0; i < mas.length; i++){
            mas[i] = random.nextInt(30);
            System.out.print( mas[i] + " ");
            if (i % 2 != 0 && i != 0){
                count++;
                sum += mas[i];
            }
        }
        System.out.println();
        System.out.println(count);
        System.out.println( sum / count);*/

        //№3
       /* int c = 5;
        int [] mas = new int[15];
        Random random = new Random();
        double sum = 0;
        int count = 0;
        for (int i = 0; i < mas.length; i++){
            mas[i] = random.nextInt(30);
            System.out.print(mas[i] + " ");
            if (mas[i] > c) {
                count++;
                sum += mas[i];
            }
        }
        System.out.println();
        System.out.println("Сумма = " + sum);
        System.out.println("Более " + c + " = " + count);
        System.out.println(sum / count);*/

        //№4
        /*System.out.println(" Введите число ");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int a = scanner.nextInt();
        int[] mas = new int[a];
        int minElement = Integer.MAX_VALUE;

        for (int i = 0; i < mas.length; i ++){
            mas[i] = random.nextInt(40);
            System.out.print(mas[i] + " ");
            if (mas[i] % 2 != 0) {
                if (minElement > mas[i]) {
                    minElement = mas[i];
                }
            }
        }
        System.out.println();
        System.out.println(minElement);*/


        //№5
     /*   Random random = new Random();
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i ++){
            mas[i] = random.nextInt(30);
            System.out.print(mas[i] + " ");
        }
        System.out.println( );

        for (int i = 0; i < mas.length; i++) {
            if (i % 2 != 0) {
                mas[i] = 0;
            }
            System.out.print(mas[i] + " ");
        }*/

        //№6
       /* Random random = new Random();
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++){
            mas[i] = random.nextInt(99);
            System.out.print( mas[i] + " ");
        }
        System.out.println();

        int elemetnt = 0;
        int caunt = 0;
        for (int i = 0; i < mas.length;i++) {
            for (int y = 0; y < mas.length; y++){
                elemetnt = mas[i];
                if (elemetnt == mas[y] && i != y){
                    caunt++;
                }
            }
        }
        if (caunt == 0) {
            System.out.println("Все элементы массива различны");
        }else {
            System.out.println("В массиве дулируется " + caunt / 2 + " елементов массива");
        }*/

        //№7
        /*System.out.println(" In ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        Random random = new Random();
        int[] mas = new int[10];
        int caunt =0;
        for (int i = 0; i < mas.length; i++){
            mas[i] = random.nextInt(10);
            System.out.print(mas[i] + " ");
            if (a == mas[i]){
                caunt++;
            }
        }
        System.out.println();
        System.out.println(caunt);*/

        //№8

      /*  Random random = new Random();
        int[]mas = new int[10];
        int a = 0;
        int b = 0;
        for (int i = 0; i < mas.length; i++){
            mas[i] = random.nextInt(20);
            System.out.print(mas[i] + " ");
            if (a < mas[i]){
                a = mas[i];
            }
        }
        System.out.println();

        for (int i = 0; i < mas.length; i++) {
            if (b < mas[i] && mas[i] < a) {
                b = mas[i];
            }
        }
        System.out.println(a);
        System.out.println(b);*/

        //№9
        /*Random random = new Random();
        int[]mas = new int[10];
        int minElement = Integer.MAX_VALUE;

        for (int i = 0; i < mas.length; i++){
            mas[i] = random.nextInt(20);
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < mas.length; i +=2){
            if (minElement > mas[i]){
                minElement = mas[i];
            }
        }
        System.out.println(minElement);*/


        //№10
       /*  Random random = new Random();
        int[]mas = new int[10];
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < mas.length; i++){
            mas[i] = random.nextInt(20);
            System.out.print(mas[i] + " ");
            if (maxElement < mas[i]){
                maxElement = mas[i];
            }
        }
        System.out.println();

        for (int i = 0; i < mas.length; i++){
            if (i == 0){
                mas[i] = maxElement;
            }
            System.out.print(mas[i] + " ");
        }
*/





















        //№1
//        int [] a = new int[10];
//        for (int i = 0, value = 2; i < a.length; i++, value +=  2 ) {
//            a[i] = value;
//        }
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < a.length; i++) {
//            System.out.println(a[i]);

        //№1
//        int[] a = new int [10];
//        for (int i = 0, value = 2; i <= a.length; i ++ , value +=2) {
//            a[i] = value;
//            System.out.println(a[i]);
//        for (int i = 0, value = 2; i <= a.length; i ++ , value +=2) {
//            a[i] = value;
//            System.out.print(a[i] + " ");
//        }

        //№2
//        int[] array = new int[50];
//        for (int i = 0, value = 1; i < array.length; i++, value += 2) {
//            array[i] = value;
//            }
//        for (int i = 0; i < array.length; i ++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        for (int i = array.length - 1; i >= 0; i--){
//            System.out.print(array[i] + " ");
//        }

        //№3

//        int[] array = new int[10];
//        Random random = new Random(); //Random - это тип данных далее название переменных ОБЪЯСНЕНИЕ 1.06
//        for (int i = 0; i < array.length; i++ ) {
//            //  array[i] = -50 + random.nextInt(50); //для создания отрицательных чисел
//            array[i] = random.nextInt(50); // позволяет создавать в каждый индекс рандомное число до 50
//            //System.out.println(array[i]); - так на практике писать
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }
//        int[] array = new int[10];
//        Random random = new Random();
//        for (int i = 0; i < array.length; i++) {
//            array[i] = -20 + random.nextInt(50);
//        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//        int sum = 0;
//        for (int i = 0; i < array.length; i++ ) {
//            if (array[i] > 0) {
//                sum += array[i];
//            }
//        }
//        System.out.println(sum);

//        int[] a = new int[15];
//        int sum = 0;
//        Random my = new Random();
//        for (int i =0; i < a.length; i++)
//            a[i] = my.nextInt(99);
//
//        for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i]);
//            System.out.print(" ");
//            if (a[i] % 2 == 0) {
//                sum +=1;
//            }
//        }
//        System.out.println(" ");
//        System.out.println(sum + " - количество чет чисел");

        //№4
//        int[] a = new int[20];
//        Random random = new Random();
//        for (int i = 0; i < a.length; i++) {
//            a[i] = random.nextInt(99);
//        }
//        for (int i = 0; i < a.length; i++ ){
//            System.out.print(a[i]);
//            System.out.print(" ");
//        }
//        System.out.println(" ");
//
//        for (int i = 0; i < a.length; i++) {
//            if (i % 2 !=0){
//                a[i] = 0;
//            }
//            System.out.print(a[i]);
//            System.out.print(" ");
//        }

        //№5
//        int[] a = new int[5];
//        int[] b = new int [5];
//        int sumA = 0;
//        int sumB = 0;
//        Random randomik = new Random();
//
//        for (int i = 0; i < a.length; i++ ) {
//            a[i] = randomik.nextInt(15);
//        }
//
//        for ( int i = 0; i < a.length; i++) {
//            System.out.print(a[i]);
//            System.out.print(" ");
//            sumA += a[i];
//        }
//        System.out.println(" ");
//
//        for (int j = 0; j < b.length; j++) {
//            b[j] = randomik.nextInt(15);
//        }
//
//        for (int j = 0; j < b.length; j++) {
//            System.out.print(b[j]);
//            System.out.print(" ");
//            sumB += b[j];
//        }
//        System.out.println(" ");
//        if (sumA == sumB) {
//            System.out.println("равны");
//
//        } else if (sumA < sumB ) {
//            System.out.println("Масив b больше");
//        } else {
//            System.out.println("Массив a больше");
//        }

        //№6
//        boolean b = false;
//        int[] a = new int[4];
//        Random random = new Random();
//        for (int i = 0; i < a.length; i++) {
//            a[i] = random.nextInt(15);
//            System.out.print(a[i] + " ");
//        }
//        for (int i = 0; i < a.length - 1; i++) {
//
//            if (a[i] < a[i + 1]) {
//                b = true;
//                continue;
//            } else {
//                b = false;
//                break;
//            }
//        }
//        System.out.println(" ");
//        if ( b) {
//            System.out.println(" строгой ");
//        } else {
//            System.out.println("не строгой");
//        }

        //№7
//        int[] array = new int [12];
//        Random random = new Random();
//        int a = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(15);
//            System.out.print(array[i] + " ");
//            if (a <= array[i]) {
//                a = array[i];
//            }
//        }
//        System.out.println(" ");
//        System.out.println(a);
//        int b = 0;
//        for (int k = 0; k < array.length; k++) {
//            if (array[k] == a) {
//                b = k;
//            }
//        } System.out.println(" ");
//        System.out.println(b);

        //№8
//        int[] array1 = new int[10];
//        int[] array2 = new int[10];
//        double[] array3 = new double[10];
//        Random random = new Random();
//        for (int i = 0; i < array1.length; i++) {
//            array1[i] = random.nextInt(9);
//            System.out.print(array1[i] + " ");
//        }
//        System.out.println(" ");
//
//        for (int i = 0; i < array2.length; i++) {
//            array2[i] = random.nextInt(9);
//            System.out.print(array2[i] + " ");
//        }
//        System.out.println(" ");
//
//        int pr = 0;
//        for (int i = 0; i < array3.length; i++) {
//            array3[i] = (double) array1[i] / array2[i];
//            System.out.print(array3[i] + " ");
//            if (array3[i] % 1.0 == 0 && array3[i] != 0) {
//                pr++;
//            }
//        }
//        System.out.println(" ");
//        System.out.println(pr);

        //№9
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("введи положительное чётное число");
//
//        int a = scanner.nextInt();
//        int[] array = new int[a];
//        int b = 0;
//        if ( a == 0 || a < 0) {
//            System.out.println("число отрицательное или ноль");
//        }
//        if (a % 2 == 0) {
//            for (int i = 0; i < array.length; i++ ) {
//                array[i] = random.nextInt(15);
//                System.out.print(array[i] + " ");
//            }
//            System.out.println(" ");
//        }
//        b = a / 2;
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int j = 0; j < b; j++ ) {
//            sum1 += array[j];
//        }
//        System.out.println(" ");
//        for (int j = b; j < array.length; j++ ) {
//            sum2 += array[j];
//        }
//        if (sum1 > sum2) {
//            System.out.println("левая часть больше = " + sum1 );
//        } else if (sum1 < sum2) {
//            System.out.println("правая часть больше = " + sum2);
//        }

//        //№10
//        Random ran = new Random();
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Введите число больше 3");
//        boolean qwe = false;
//        int b = 0;
//        while (!qwe) {
//            int a = scan.nextInt();
//            if (a > 3) {
//                b = a;
//                qwe = true;
//            } else {
//                System.out.println("Введено неверное числов");
//            }
//        }
//        int[] array = new int[b];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = ran.nextInt(b);
//            System.out.print(array[i] + " ");
//        }
//        int count = 0;
//        for (int j = 0; j < array.length; j++) {
//            if (array[j] % 2 == 0 && array[j] > 0) {
//                count++;
//            }
//        }
//        System.out.println(" ");
//        if (count > 0) {
//            int count1 = 0;
//            int[] array2 = new int[count];
//            for (int k = 0; k < array.length; k++) {
//                if (array[k] % 2 == 0 && array[k] > 0) {
//                    array2[count1] = array[k];
//                    System.out.print(array2[count1] + " ");
//                    count1++;
//
//                }
//            }
//        }



    }
}
