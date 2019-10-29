package Praktikum;

import java.util.Scanner;

public class Daftar {
    
    private int h;
    private int i;
    private int j;
    public String Y, N;
    
    Scanner inp = new Scanner(System.in);
    public void list(){
        h = 25;
        i = 15;
        j = 70;
        System.out.println("Penjaga Perpustakaan : Bu Heny ");
        System.out.println("Data buku tanggal 20 Oktober, 2010 : \n=======================================\n\nBuku Pembelajaran = " + h + "\nBuku Majalah = " + i + "\nBuku Novel = " + j);
    }
    
    public void list1(){
        h = 30;
        i = 25;
        j = 75;
        System.out.println("Penjaga Perpustakaan : Yulius Jati Satrio W.");
        System.out.println("Data buku tanggal 1 November, 2010 : \n=======================================\n\nBuku Pembelajaran = " + h + "\nBuku Majalah = " + i + "\nBuku Novel = " + j);
    }
}
