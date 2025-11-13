package lesson_7;

public class Client extends Worker {
    private String lastName;

    public Client(String name, int age, int experience, String lastName) {
        super(name, age, experience);
        this.lastName = lastName;
    }

    @Override
    public void printInfo() {
        System.out.println("Фамилия " + lastName);
        super.printInfo();
    }


    //Можно создать класс в классе обходя наследование.
    // Но есть проблема Это не верное описание внутренних класов.
    // Подходит для небольших описаний логики (в основном сортировки)
    private class ExtendedClient extends Human_7 {
        public ExtendedClient(String name, int age) {
            super(name, age);
        }
        public void printInformation(){
            System.out.println("Вывод текста из ExtendedClient ");
        }
    }


}


