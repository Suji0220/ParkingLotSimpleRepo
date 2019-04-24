public class Jeep implements Parkable {
    @Override
    public void park(ParkingLot parkingLot) {
        parkingLot.addVehicle();
       // System.out.println("Jeep is parked");

    }

    @Override
    public void unpark(ParkingLot parkingLot) {
        parkingLot.removeVehicle();
       // System.out.println("Jeep is not been parked");

    }
}
