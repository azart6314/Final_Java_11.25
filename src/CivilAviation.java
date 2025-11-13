public class CivilAviation extends Air {
    private int countOfPassenger;
    private boolean hasBusinessClass;

    public CivilAviation(int horsePower, int maxSped, int masKg, String make, double wingspanMeters, double minTakeoffRunwayLength, int countOfPassenger, boolean hasBusinessClass) {
        super(horsePower, maxSped, masKg, make, wingspanMeters, minTakeoffRunwayLength);
        this.countOfPassenger = countOfPassenger;
        this.hasBusinessClass = hasBusinessClass;
    }


    public void checkCountPassenger(int countPassenger){
        if (countPassenger > countOfPassenger) {
            System.out.println("Вам нужен самолет побольше");
        } else if (countPassenger <= countOfPassenger) {
            System.out.println("Самолет загружен");
        }
    }
}
