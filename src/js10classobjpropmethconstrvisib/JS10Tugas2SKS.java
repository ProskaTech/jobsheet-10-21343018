/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package js10classobjpropmethconstrvisib;

/**
 *
 * Created by 21343018_Anita Nursi
 */

public class JS10Tugas2SKS {
    public static void main(String[] args) {
        JS10Tugas2Mahasiswa data = new JS10Tugas2Mahasiswa();
        
        data.nama = "Joni";
        data.nim = 12345;
        data.sem = "V";
        
        System.out.println("Nama\t\t: " + data.nama);
        System.out.println("NIM\t\t: " + data.nim);
        System.out.println("Semester\t: " + data.sem);
        System.out.println("IP Semester ini\t: " + data.ip);
        data.sks();
    }
}
