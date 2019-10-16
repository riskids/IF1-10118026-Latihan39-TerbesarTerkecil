/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxmin;

import java.util.Scanner;

/**
  * @author
 * NAMA			: Riski Dwi Sabariyanto
 * KELAS		: IF-1
 * NIM			: 10118026
 * Deksripsi Program : Program ini berisi program untuk membedakan nilai terbesar
 * dan nilai terkecila yang berbasis objek oriented
 */
public class Nilai {
      public int nilai[] = new int[20];
    public int max, min;
    
    public void inputNilai(int jumlahSiswa) {
        int i;
        Scanner scn = new Scanner(System.in);
        for (i = 1; i <= jumlahSiswa; i++) {
            System.out.print("Masukkan nilai Mahasiswa ke-" + i + " : ");
            nilai[i] = scn.nextInt();
        }
    }
    public void tampilNilai(int jumlahSiswa){
        int i;
        System.out.println("===Hasil Nilai Mahasiswa===");
        for (i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Nilai Mahasiswa ke-" + i + " = " + nilai[i]);
        }
    }
    public void tampilNilaimaxmin(int jumlahSiswa) {
        int i;
        
        //Inisialisasi Max dan Min
        min = nilai[1];
        max = nilai[1];
        
        //Penghitungan Nilai Terbesar dan Terkecil
        for (i = 1; i <= jumlahSiswa; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            } else if (nilai[i] < min) {
                min = nilai[i];
            }
        }
    }
}
