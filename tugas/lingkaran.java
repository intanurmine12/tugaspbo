/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

import java.util.Scanner;

/**
 *
 * @author UMUM FISIP
 */
public class lingkaran {
    public static void main(String[] args) {
       //Inisialisasi objek input dari class scanner
       Scanner input=new Scanner(System.in);

       //Deklarasi variabel
       double luas;
       double keliling;
       double phi=3.14;
       int r;

       //Input nilai jari-jari
       System.out.println("Menghitung Luas Lingkaran");
       System.out.print("Masukan Jari-jari : ");
       r=input.nextInt();

       //Menghitung luas lingkaran
       luas=phi*r*r;
       //Tampilkan hasil
       System.out.println("Luas Lingkaran = "+luas);
       
       keliling=2*phi*r;
        System.out.println("Keliling Lingkaran = "+keliling);
    }
}
