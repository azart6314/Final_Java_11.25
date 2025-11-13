public class PassengerCar extends Ground {
    private String carBodyType;
    private int countOfPassenger;

    public PassengerCar(int horsePower, int maxSped, int masKg, String make, int wheelCount, double fuelConsumption, String carBodyType, int countOfPassenger) {
        super(horsePower, maxSped, masKg, make, wheelCount, fuelConsumption);
        this.carBodyType = carBodyType;
        this.countOfPassenger = countOfPassenger;
    }


    public void printInformationPassengerCar(double time) {
        double calculateDistance = calculateDistance(time);
        System.out.println("За время " + time + "ч автомобиль "
                + getMake() + " двигаясь с максимальной скоростью " + getMaxSped() + "км/ч  проедет " + calculateDistance
                + "  км  и израсходует " + calculateTravelFuel(calculateDistance) + " литров топлива"
        );
    }


   /* private void calculateTravelDistanceAndFuel(double time){
       double distance = time * getMaxSped();
       double fuelUsed = distance * getFuelConsumption() / 100.0;

        System.out.println( distance + "км и израсходует " + fuelUsed + " литров топлива");
    }*/

    private double calculateDistance(double time) {
        double distance = time * getMaxSped();
        //System.out.println(distance + "км и израсходует ");
        return distance;
    }

        private double calculateTravelFuel (double distance) {
            double fuelUsed = distance * getFuelConsumption() / 100.0;
            //System.out.println(fuelUsed + " литров топлива");
            return fuelUsed;
    }


            private void calculatePowerKw () {
                double powerKw = getHorsePower() * 0.74;
            }


//    За время (ваше введённое время) ч, автомобиль (марка автомобиля)
//    двигаясь с максимальной скоростью (ваша максимальная скорость) км/ч
//    проедет (xxx) км  и израсходует (xxx) литров топлива.
        }
