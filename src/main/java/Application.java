public class Application {

    public static void main(String... args) {
        DiplomatsVehicle dv1 = new DiplomatsVehicle();
        MilitaryVehicle mv1 = new MilitaryVehicle();
        Car c1 = new Car();

        Track carTrack = new NormalTrack();
        Track militaryTrack = new MilitaryTrack(carTrack);
        Track diplomatsTrack = new DiplomatsTrack(militaryTrack);

        diplomatsTrack.passBorder(dv1);
        diplomatsTrack.passBorder(mv1);
        diplomatsTrack.passBorder(c1);
    }
}
