public class Application {

    public static void main(String... args){
        DiplomatsVehicle dv1 = new DiplomatsVehicle();

        Track carTrack = new NormalTrack();
        Track militaryTrack = new MilitaryTrack();
        Track diplomatsTrack = new DiplomatsTrack();

        diplomatsTrack.passBorder(dv1);
    }
}
