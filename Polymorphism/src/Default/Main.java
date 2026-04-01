package Default;

public class Main {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();
        
        Airport a = new Airport();
        
        a.boarding(cp);
        a.boarding(pp);
        a.boarding(fp);
    }
}