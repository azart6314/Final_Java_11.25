public class MilitaryAviation extends Air {
    private boolean ejectionSystem;
    private int countRocketsOnBoard;

    public MilitaryAviation(int horsePower, int maxSped, int masKg, String make, double wingspanMeters, double minTakeoffRunwayLength,
                            boolean ejectionSystem, int countRocketsOnBoard) {
        super(horsePower, maxSped, masKg, make, wingspanMeters, minTakeoffRunwayLength);
        this.ejectionSystem = ejectionSystem;
        this.countRocketsOnBoard = countRocketsOnBoard;
    }

    public void checkingNumberRockets(int countRockets ){
        if (countRockets <= countRocketsOnBoard) {
            System.out.println("Ракета запущена");
        } else if (countRockets >= countRocketsOnBoard) {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void tryToEject(boolean checkEject){
        if (!checkEject) {
            System.out.println("У вас нет такой системы");
        } else {
            System.out.println("Катапультирование прошло успешно");
        }
    }



}
