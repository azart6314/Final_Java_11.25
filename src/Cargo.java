public class Cargo extends Ground {
    private int maxLoadTons;

    public Cargo(int horsePower, int maxSped, int masKg, String make, int wheelCount, double fuelConsumption, int maxLoadTons) {
        super(horsePower, maxSped, masKg, make, wheelCount, fuelConsumption);
        this.maxLoadTons = maxLoadTons;
    }



    public void checkWeight(int weightСargo){
        if (weightСargo > maxLoadTons) {
            System.out.println("Вам нужен грузовик побольше");
        } else if (weightСargo <= maxLoadTons) {
            System.out.println("Грузовик загружен");
        }
    }

}
