public class Lesson_7_OOP {
    public static void main(String[] args) {
        Human_7 zhenya = new Human_7("Zenyz", 18);
//        // System.out.println(zhenya.);  нет доступа к полям
//        zhenya.printInfo(); // но к методу есть доступ

       /* System.out.println(zhenya.getAge());
        System.out.println(zhenya.getName());
        System.out.println("============");

        zhenya.setName("qwerty");
        zhenya.setAge(54321);
        zhenya.printInfo();*/

      /*  TV samsung = new TV(10, 11, 1, 10);

        samsung.changeCurrentChannel(2);
        samsung.updateVolume(false);*/


 /*       Worker worker1 = new Worker("Igar", 33, 80);
        worker1.printInfo();
        worker1.printHelloWorld();*/

        Client client1 = new Client("Sasha", 32, 6, "Gamak");
        client1.printInfo();
        client1.printHelloWorld();

    }
}
