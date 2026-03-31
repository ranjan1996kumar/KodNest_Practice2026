package Default;

class Plane {
    void takeOff() {
        System.out.println("Plane is taking off");
    }
    void fly() {
        System.out.println("Plane is flying");
    }
    void land() {
        System.out.println("Plane is landing");
    }
}

class CargoPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Cargo plane fly at low height");
    }
}

class PassengerPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Passenger plane fly at medium height");
    }
}

class FighterPlane extends Plane {
    @Override
    void fly() {
        System.out.println("Fighter plane fly at high hight");
    }
}
