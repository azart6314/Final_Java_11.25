import javax.sound.midi.Soundbank;
import java.util.Random;
import java.util.Scanner;

public class PC {

    String processor;
    int ram;
    int hardDrive;
    int resource;


    boolean isWoking;
    boolean isBurntOut;

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public PC(String processor, int ram, int hardDrive, int resource) {
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.resource = resource;
    }

    public void printInfoPC() {
        System.out.println("Процессор - " + processor);
        System.out.println("Оперативка - " + ram);
        System.out.println("Жестки диск - " + hardDrive);
        System.out.println("Ресурс - " + resource);
    }

    public void tornOn() {
        System.out.println("isBurntOut - " + isBurntOut);
        System.out.println("isWorking - " + isWoking);
        if (isBurntOut) {
            System.out.println("Комп сгорел");
            return;
        }
        if (!isWoking && resource > 0) {
            System.out.println("Введите 1 или 0");
            int scannerValue = scanner.nextInt();
            int randomValue = random.nextInt(2);
            System.out.println(randomValue);
            System.out.println("===============");
            if (scannerValue != randomValue) {
                System.out.println("Комп сгорел ");
                isBurntOut = true;
            }
            if (scannerValue == randomValue) {
                System.out.println("Компа включен");
                isWoking = true;
            }
        }
    }

    public void tornOf() {
        System.out.println("isBurntOut - " + isBurntOut);
        System.out.println("isWorking - " + isWoking);

        if (isBurntOut) {
            System.out.println("Комп сгорел 2.0");
        }
        if (isWoking && resource > 0) {
            System.out.println("Введите 1 или 0");
            int scannerValue = scanner.nextInt();
            int randomValue = random.nextInt(2);
            System.out.println(randomValue);
            System.out.println("===============");
            if (randomValue != scannerValue) {
                System.out.println("Комп сгорел");
                isBurntOut = true;
            }
            if (randomValue == scannerValue) {
                System.out.println("Комп выключен");
                isWoking = false;
            }
        }
    }

}
