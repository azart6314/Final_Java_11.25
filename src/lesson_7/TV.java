package lesson_7;

import java.util.Scanner;

public class TV {
/*    Создать класс Телевизор. У него будут поля:
- количество каналов
- максимальный уровень громкости
- текущий канал
- текущий уровень громкости
    Нужно реализовать 2 метода:
            1) переключение канала по конкретному номеру
    В методе необходимо вывести информацию о текущем канале и обновить значение  текущего канала.
2) переключение звука. В методе необходимо обновить текущее уровень громкости  через инкремент или декремент.
    Сама логика методов должна быть в private методе
    Подсказка: метод 1) будет принимать 1 параметр int
    метод 2) может принимать, например, true/false значение, где true - инкремент false - декремент
            ( подсказка будет 4 метода.
                    2 публичныхметода
                    первый - которые я кобы отвечают за кнопки ну пульте  (принемает int )
    второй за увелечения или уменьшение звука (тру или фодс  ( где тру увелечение на 1 фолс на уменьшение на 1 )))*/

    private int totalChannel;
    private int maxVolume;
    private int currentChannel;
    private int currentVolume;

    Scanner scanner = new Scanner(System.in);

    public TV(int totalChannel, int maxVolume, int currentChannel, int currentVolume) {
        this.totalChannel = totalChannel;
        this.maxVolume = maxVolume;
        this.currentChannel = 1;
        this.currentVolume = 10;
    }

    public void changeCurrentChannel (int selectChannel){
        switchToChannel(selectChannel);
    }

    private void switchToChannel(int selectChannel ){
        System.out.println("Текущий канал " + currentChannel );
        if (selectChannel > totalChannel || selectChannel < 1){
            System.out.println("Такого канала не существует " + selectChannel);
        } else if (selectChannel >= 1 && selectChannel <= totalChannel){
            System.out.println("Включен " + selectChannel + " канал");
            currentChannel = selectChannel;
        }
    }


    public void updateVolume( boolean update) {
        System.out.println("Количество звука сейчас " + currentVolume);
        switchToVolume(update);
    }

    private void switchToVolume(boolean update){
        if (update) {
            currentVolume++;
        } else {
            currentVolume--;
        }
        System.out.println("Количество звука " + currentVolume);

        /* Позже это переписал на более простое
        if (update){
            if (currentVolume < maxVolume){
                currentVolume++;
                System.out.println("Громкость увеличена " + currentVolume);
            }else {
                System.out.println("Максимальная громкость " + currentVolume);
            }
        } else {
            if (currentVolume > 0){
                currentVolume --;
                System.out.println("Громкость уменьшена " + currentVolume);
            } else {
                System.out.println("Минимальная громкость " + currentVolume);
            }
        }*/

    }

}
