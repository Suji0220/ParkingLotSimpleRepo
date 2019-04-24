public class Main {



    public static void main(String[] args) {

        Parkable car1= new Car();
        ParkingLot parkinglot = new ParkingLot(2);

        car1.park(parkinglot);


        Parkable car2 = new Car();
        car2.park(parkinglot);

        /*Car car3 = new Car();
        car3.park(parkinglot);*/

        Parkable suv = new SUV();
        suv.park(parkinglot);

        Parkable jeep = new Jeep();
        jeep.park(parkinglot);



        parkinglot.isFull();
    }




}

