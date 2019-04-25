public abstract class Vehicle implements Parkable{

    public void park(ParkingLot parkingLot)
    {
        parkingLot.addVehicle();
    }
    public void unpark(ParkingLot parkingLot)
    {
        parkingLot.removeVehicle();
    }


}
