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
public class Maxmin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;
        int jumlahSiswa;

        Nilai result = new Nilai();
        Scanner scanner = new Scanner(System.in);

        System.out.println("===Program nilai terbesar dan nilai terkceil===");
        System.out.print("Masukkan Nama Petugas : ");
        nama = scanner.nextLine();
        System.out.print("Masukkan Banyaknya nilai Mahasiswa :  ");
        jumlahSiswa = scanner.nextInt();
        System.out.println();

        result.inputNilai(jumlahSiswa);
        System.out.println();
        result.tampilNilai(jumlahSiswa);
        
        result.tampilNilaimaxmin(jumlahSiswa);
        System.out.println("\n"+"Nilai Terbesar : " + result.max);
        System.out.println("Nilai Terkecil : " + result.min);
        System.out.println("\n"+"Nama Petugas : " + nama);
    }
}
    
