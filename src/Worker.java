public class Worker extends Human_7 {
    private int experience;

    public Worker(String name, int age, int experience) {
        super(name, age);
        this.experience = experience;
    }

    //Переопределение метода printInfo из Human 7

    @Override
    public void printInfo() {
      // Если дописать метод также можно стереть супер и полностью его переписать
        super.printInfo();
        System.out.println("Опыт работы " + experience);
    }

    //Перегрузка метода. Так как он публичный доступен и у наследника и выполняется тот метод который описан в Human_7
    public void justPrintInfo(){
        super.printInfo();
    }

  /*  @Override
    protected void printHelloWorld() {
        super.printHelloWorld();
    }*/


    @Override
    public String toString() {
        return "Worker{" +
                "experience=" + experience +
                '}' + super.toString();
    }

}
