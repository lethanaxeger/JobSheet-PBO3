package latihan1;

public class Pertama {
    // deklarasi
    private int a = 10;
    
    //Method-method
    protected void terprotek(){
        System.out.println("Method ini hanya untuk anaknya");
    }
    
    public void info(){
        System.out.println("a = " + a);
        System.out.println("Dipanggil pada = " + this.getClass().getName());
    }
}

