import java.util.concurrent.SynchronousQueue;

public class ParkingLot {

    private int capacity;
   // private int noOfParkedCars;

    public ParkingLot(int capacity) {
        this.capacity = capacity;
    }

    public  boolean isFull()
    {
        if(capacity == 0)
            return true;
        else return false;

    }

    public void addVehicle()
    {

        if(!isFull()){
             capacity--;
        System.out.println("Vehicle parked successfully");
        }
        else
        System.out.println("No more slot available");

    }

    public void removeVehicle()
    {
        capacity++;
    }






}
