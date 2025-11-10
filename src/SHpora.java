
public class SHpora {

/*    +	Сложение	Складывает два числа.Также может объединять строки (конкатенация).	5 + 3 → 8 "при" + "вет" → "привет"
      -	Вычитание	Вычитает одно число из другого.	10 - 4 → 6
      *	Умножение	Умножает два числа.	2 * 7 → 14
      /	Деление	Делит одно число на другое.	20 / 5 → 4.0
      %	Деление по модулю
      ! - Инверсия     !false == True
      &&  Логическое И
      || - Логическое ИЛИ
            */

    /*int a; // Объявление переменной
    int b = 0; // Инициализация переменнной */



//        Scanner scanner = new Scanner(System.in); // сканер позволяет считывать входной поток данных
//        System.out.println("введи знач с клавы");
//        int a = scanner.nextInt(); // nextInt - позволяет запросить ввод значения с клавиатуры так как nextInt ( принимает только инты значение можно менять)
//        System.out.println(a);



//        Random random = new Random(); // создает генирацию рандомных символов ( рандом тип данных)
//        int a = random.nextInt(50); //указываем правую граниу длинны массива создая рандомну длинну
//        System.out.println(a);






    //this.blocked = blocked; - this.blocked относится к переменной blocked(которая вверху). А  = blocked; относится к переменной в методе
    // void - ничего не возвращает изменяем состояние
    //private - делает поле не видимым за пределами класса. Они не доступны в не класса
    // static - статические методы не пренодлежат не какому экземпляру они пренадлежат классу. Мотод который создает какойт то новый инстанс пример в банк акаунт
    //get Для тех полей которые мы хотим дать читать get еры  создается метот для чтения который начинает называтся getBalance
    //set  Для того что бы изменить что то в private пишется метоот setir set названия setBlocked
    // ПКМ > Generate или alt+iser ставит быстро гетеры и сеторы
    // isBlocked пишем тогда когда значение булеан
    /*Month [] allMonths = new Month [] {
            january, february, march, april, may, june, july, august, september, october, november, december
        };*/

    // Альтернативные констракторы - отрабатывает только один раз, только при его создани


    //Бывает простые типы и референс тайп (Реф это массив и еще другие строка и т.д ) Они пишутся с большой буквы кроме массива
    // "" - выделяются строки
    //'' - выделяются тип char 1 символ  только 1 символ


    // Arrays.toString() работает только с одномерными массивами.
    // Arrays.deepToString() нужен, когда массив содержит другие массивы внутри — то есть, когда это массив массивов.
    // s.substring( 2, 6) -- выписать со строки с со 2 по 6 элемент но 6 не возвращает
    //>> Arrays.toString(arr1) - Вывести массив в строку
    //Arrays.length - Длинна массива
    //.clon - скопировать массив один в один

    //win+ alt + enter - помогает решить кучу проблем
    // ctrl probel подсказка что можно изменить
    //Shift + f6 - Груповое редактирование Переименование
    //Навсети курсор на метот и нажать  ctr+q можно открыть как работает метод

    // break -- остановить
    // continue -- Продолжение

    // == равенство дает ожидаемый результат только для примитивных типов int dable flout bollean . Массивы и все что с большой буквы нет
    // % - деление в котором видем только остаток
    // || -или
    // & - И
    //  / деление


    //   Преоброзование целого числа в строку
   /* String.valueOf()	    String.valueOf(123)
      Конкатенация	        123 + ""
      Integer.toString()	Integer.toString(123)
      String.format()	    String.format("%d", 123)*/


    //Все методы для строк
     /*    String str = "Hello World!";
        System.out.println(str.substring(7)); //печатать с какойго символа
        System.out.println(str.substring(0, 5)); //печатать с какойго символа по какой последний символ исключается
        System.out.println(str.substring(str.length() - 3)); //от длинны строки - 3 печать как бы с конца
        System.out.println(str.charAt(5)); //какой символ на 5 индексе

        System.out.println(str.equals("Hello World!")); // equals  сравнивает вместо ==  // ответ будет true false
                                                        //equals метод сравнения строк

        System.out.println(str.compareTo("aaaaa")); // сравнение если - то стоят раньше , если + то позже если 0 то равны У иии Узнать что это
        System.out.println(str.compareTo("Hello World!")); // можно использовать в место equals
        System.out.println(str.compareToIgnoreCase("aaaaa")); // будет сортировать не взирая на регистр
        System.out.println(str.equalsIgnoreCase("aaaaa")); //сравнение не взирая на регистры

        System.out.println(str.toUpperCase()); // ВСЯ Строка в верхнем регистре
        System.out.println(str.toLowerCase()); // ВСЯ Строка в Нижнем регистре
        System.out.println(str.contains("orl")); //проверка входит ли это в строку ответ true false
        System.out.println(str.startsWith("H")); // с какой буквы начинается
        System.out.println(str.endsWith("d"));// на что заканчивается
        System.out.println(str.toLowerCase().contains("ORL".toLowerCase())); // ЗАПУСКАЕМ КОПИЮ а не ориг строку а результат работы на главной строке

        //2 варианта
        System.out.println(str.substring(str.indexOf('W'))); // при входе определенного символа строка начинает идти

        //тут пишем начиная с W
        int indexOfW = str.indexOf('W'); //indexOf если он находит наше букву то ее и после все печатает
                                         // lstIndexOf
        if (indexOfW < 0) {
            System.out.println("не найдено");
        } else {
            System.out.println(str.substring(indexOfW));
        }

        String str1 = "в лесу родилась елочка";
        String[] worlds =  str1.split(" "); //превращает в раздельные слова, буквы Место пробело можно поставить что угодно букву символ
                                                  // сам разделитель не считается в индекс
        System.out.println(Arrays.toString(worlds));
        System.out.println(worlds.length);

        System.out.println(str1.replaceAll("o+", "O")); // О+ МЕНЯЕТ ВСЕ буквы о с маленькой на большую убрать + и только одну
*/

    // c урока


    //                                   Основные методы String
  /*  Метод	Описание	Пример
    length()-    	Возвращает длину строки.	"Hello".length(); // 5
    charAt(index)	Возвращает символ по индексу.	"Java".charAt(1); // 'a'
    isEmpty()	    Проверяет, пустая ли строка.	"".isEmpty(); // true
    isBlank()	    Проверяет, содержит ли строка только пробелы.	" ".isBlank(); // true
    toUpperCase()	Преобразует в верхний регистр.	"hello".toUpperCase(); // "HELLO"
    toLowerCase()	Преобразует в нижний регистр.	"HELLO".toLowerCase(); // "hello"
    trim()	        Убирает пробелы в начале и конце строки.	" Java ".trim(); // "Java"
    strip()	        Удаляет пробелы, включая Unicode-пробелы.	" Java ".strip(); // "Java"
    stripLeading()	Удаляет пробелы в начале строки.	" Java ".stripLeading(); // "Java "
    stripTrailing()	Удаляет пробелы в конце строки.	" Java ".stripTrailing(); // " Java"
*/

    //                   Поиск в строке

   /* Метод	            Описание	                          Пример
    contains(str)	    Проверяет, есть ли в строке str.	"Java".contains("av"); // true
    startsWith(str)	    Проверяет, начинается ли строка с str.	"Java".startsWith("Ja"); // true
    endsWith(str)	    Проверяет, заканчивается ли строка на str.	"Java".endsWith("va"); // true
    indexOf(str)	    Возвращает индекс первого вхождения.	"Java".indexOf("a"); // 1
    lastIndexOf(str)	Индекс последнего вхождения.	"Java".lastIndexOf("a"); // 3
*/

    //                   Сравнение строк

  /*  equals(str)	Сравнивает строки (учитывает регистр).	"java".equals("Java"); // false
    equalsIgnoreCase(str)	Сравнивает без учета регистра.	"java".equalsIgnoreCase("Java"); // true
    compareTo(str)	Лексикографическое сравнение.	"abc".compareTo("bcd"); // -1
    compareToIgnoreCase(str)	Лексикографическое сравнение без регистра.	"abc".compareToIgnoreCase("ABC"); // 0
*/


}

