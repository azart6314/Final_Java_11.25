package OldLesson;

public class Phone {

        String model;
        int expirationDate;
        boolean isDevelopmentDone;

        public Phone() {
        }

        // ctr + insert - создание конструктора
        //пкм -> generate

        public Phone(String model, int expirationDate, boolean isDevelopmentDone) {
            this.model = model;
            this.expirationDate = expirationDate;
            this.isDevelopmentDone = isDevelopmentDone;
        }

        public void printIfo() {  //метод
            System.out.println("Модель " + model);
            System.out.println("Срок годности " + expirationDate);
            System.out.println("Созда ли телефон " + isDevelopmentDone);
        }

    }

