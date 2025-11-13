public class MainHW7 {
    public static void main(String[] args) {

        /*PassengerCar honda = new PassengerCar(110, 170,1500, "Honda", 4, 7.5,
                " Хочбэк", 5);
        honda.printInformationPassengerCar(1);*/

        /*Cargo belaz = new Cargo(100, 35, 15000, "Белаз", 6,100, 60);
        belaz.checkWeight(61);
*/

        /*CivilAviation boeng747 = new CivilAviation(1000, 500, 10000, "Боенг 747", 15.5, 1500,
                150, true);
        boeng747.checkCountPassenger(150);*/

        MilitaryAviation mig = new MilitaryAviation(1000, 1000, 10000, "Миг", 5,
                1000, true, 10);
        mig.checkingNumberRockets(11);
        mig.tryToEject(false);

    }
}
