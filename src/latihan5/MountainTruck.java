package latihan5;

public class MountainTruck extends Truck {
    //the MountainTruck subclass adds one field
    public int seatHeight;
    //the MountainTruck subclass has one constructor
    public MountainTruck(int startHeight, int startCadence, int startSpeed, int startGear){
        super (startCadence, startSpeed, startGear);
        seatHeight = startHeight;
    }
    //the MountainTruck subclass adds one method
    public void seetHeight(int newValue){
        seatHeight = newValue;
    }
    public static void main(String[] abc){
        System.out.println("On the Road!");
        MountainTruck MB = new MountainTruck(0,0,0,0);
        System.out.println("gear = " + MB.gear);
        System.out.println("speed = " + MB.speed);
        MB.setGear(2);
        MB.speedUp(2);
        System.out.println("gear = " + MB.gear);
        System.out.println("speed = "+MB.speed);
        MB.speedUp(2);
        System.out.println("gear = " + MB.gear);
        System.out.println("speed = "+MB.speed);
    }
}
