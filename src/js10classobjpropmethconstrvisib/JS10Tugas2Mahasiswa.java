/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js10classobjpropmethconstrvisib;

/**
 *
 * Created by 21343018_Anita Nursi
 */

public class JS10Tugas2Mahasiswa {
    String nama, sem;
    double ip = 3.5;
    int nim;
    
    public void sks(){
        if (ip >= 3.5)
            System.out.println("Anda berhak mengontrak 24 SKS pada semester V");
        else if (ip >= 3.0)
            System.out.println("Anda berhak mengontrak 22 SKS pada semester V");
        else if (ip >= 2.5)
            System.out.println("Anda berhak mengontrak 20 SKS pada semester V");
        else if (ip >= 2.0)
            System.out.println("Anda berhak mengontrak 18 SKS pada semester V");
        else if (ip < 2.0)
            System.out.println("Anda berhak mengontrak 15 SKS pada semester V");
    }
}

