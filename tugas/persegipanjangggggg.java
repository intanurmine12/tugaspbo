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
public class persegipanjangggggg {
    public static void main(String[] args) {
        int panjang, lebar;
        double luas;
        double keliling;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Menghitung Luas Persegi Panjang");
        System.out.print("Masukkan panjang : ");
        panjang = scan.nextInt();
        System.out.print("Masukkan lebar : ");
        lebar = scan.nextInt();
        
        luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang adalah " + luas);
        keliling = 2 * panjang + lebar;
        System.out.println("Keliling Persegi Panjang adalah " + keliling);

    }
}
