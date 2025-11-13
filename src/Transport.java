public class Transport {
    private int horsePower;
    private int maxSped;
    private int masKg;
    private String make;

    public Transport(int horsePower, int maxSped, int masKg, String make) {
        this.horsePower = horsePower;
        this.maxSped = maxSped;
        this.masKg = masKg;
        this.make = make;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public int getMaxSped() {
        return maxSped;
    }

    public int getMasKg() {
        return masKg;
    }

    public String getMake() {
        return make;
    }

}
