public class SUV implements Parkable {
    @Override
    public void park(ParkingLot parkingLot) {
        parkingLot.addVehicle();
      //  System.out.println("SUV is parked");

    }

    @Override
    public void unpark(ParkingLot parkingLot) {
        parkingLot.removeVehicle();
        //System.out.println("SUV is not been parked");

    }
}
