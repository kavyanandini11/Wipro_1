public class Car implements Vehicle, FourWheeler {

    @Override
    public void message() {
        System.out.println("Inside Car");
        Vehicle.super.message();
        FourWheeler.super.message();
    }
}
