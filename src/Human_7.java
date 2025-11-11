public class Human_7 {
    // Все поля на уровне класса должны быть приватными что бы ни кто не знал что у меня храниться в моем объекте
    private String name;
    private int age;


    public Human_7(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printInfo() {
            System.out.println(name + " " + age);
            /*move();*/
        }

        //если изменить private на protected он будет доступен у наслденика
        /*private*/ protected void printHelloWorld(){
            System.out.println("Hello World");
        }

/*        // В рамках этого класса я могу вызывать метод. Но в стороннем классе я не могу его вызвать
        private void move(){
            System.out.println("Передвижение ");
        }*/

    /*    //используется как в рамках это класса. При созданий объекта. И в под уровнене каких то папок
        protected void doSomething(){
        //code
        }*/

    @Override
    public String toString() {
        return "Human_7{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

