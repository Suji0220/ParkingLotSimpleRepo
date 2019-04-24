public class Car implements Parkable{
    @Override
    public void park(ParkingLot parkingLot) {
        parkingLot.addVehicle();
      //  System.out.println("Car is been parked");
    }

    @Override
    public void unpark(ParkingLot parkingLot) {
        parkingLot.removeVehicle();
       // System.out.println("car has not been parked");

    }








    /*public void park(ParkingLot parkinglot)
    {
       parkinglot.addCar();


    }

    public void unpark(ParkingLot parkingLot)
    {
        parkingLot.removeCar();
    }*/




}
