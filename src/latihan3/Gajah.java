package latihan3;

public class Gajah extends Hewan{
    public static void testClassMethod(){
        System.out.println("The class method in Hewan...");
    }
    //meng-override method pada class Hewan
    public void testInstanceMethod(){
        System.out.println("The Instance method in Gajah");
    }
    public static void main(String[] abc){
        Gajah myGajah = new Gajah();
        Hewan myHewan = myGajah;
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
}
