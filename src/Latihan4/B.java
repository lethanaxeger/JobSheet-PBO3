package Latihan4;

public class B extends A {
    private int b;
    public void setB(int nilai){
        b = nilai;
    }
    
    public int getB(){
        return b;
    }
    
    //melakukan override terhadap method tampilkanNilai ()
    //yang terdapat pada kelas A
    
    public void tampikanNilai(){
        super.tampilkanNilai(); //memanggil method dalam kelas A
        System.out.println("Nilai b : " + getB());
    }
}
