public class Air extends Transport {
    private double wingspanMeters;
    private double minTakeoffRunwayLength;

    public Air(int horsePower, int maxSped, int masKg, String make, double wingspanMeters, double minTakeoffRunwayLength) {
        super(horsePower, maxSped, masKg, make);
        this.wingspanMeters = wingspanMeters;
        this.minTakeoffRunwayLength = minTakeoffRunwayLength;
    }
}
