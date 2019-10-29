package latihan1;

public class Kedua extends Pertama{
    // deklarasi
    private int b = 8;
    
    // Method-method
    protected void BacaSuper(){
        System.out.println("Nilai b : " + b);
        terprotek();
        info();
    }
}
