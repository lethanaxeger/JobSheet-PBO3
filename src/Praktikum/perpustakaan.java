package Praktikum;

import java.util.Scanner;

public class perpustakaan extends Daftar {
    //Deklarasi
    private int x;
    
    Scanner input = new Scanner(System.in);
    public void daftar(){
        int inputan;
        System.out.print("Update Terbaru : \n(1) 20/10/2010\n(2) 01/11/2010\n=-=-=-=-=-=-=\nCheck Update : ");
        x = inputan = input.nextInt();
            if(inputan == 1){
                list();
            } else if (inputan == 2){
                list1();
            }
    }
}