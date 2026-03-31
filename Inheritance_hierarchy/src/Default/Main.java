package Default;

public class Main {
    public static void main(String[] args) 
    {
        CargoPlane cp = new CargoPlane();
        cp.takeOff();
        cp.fly();
        cp.land();
        System.out.println("----------");
        
        PassengerPlane pp = new PassengerPlane();
        pp.takeOff();
        pp.fly();
        pp.land();
        System.out.println("----------");
        
        FighterPlane fp = new FighterPlane();
        fp.takeOff();
        fp.fly();
        fp.land();
    }
}