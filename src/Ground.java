public class Ground extends Transport{
    private int wheelCount;
    private double fuelConsumption;

    public Ground(int horsePower, int maxSped, int masKg, String make, int wheelCount, double fuelConsumption) {
        super(horsePower, maxSped, masKg, make);
        this.wheelCount = wheelCount;
        this.fuelConsumption = fuelConsumption;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }
}
