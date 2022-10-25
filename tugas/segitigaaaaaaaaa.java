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
public class segitigaaaaaaaaa {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a;
        int t;
        double luas;
        
        System.out.println("Menghitung Luas Segitiga");
        System.out.print("Masukan Sisi a : ");
        a=input.nextInt();
        System.out.print("Masukan Sisi t : ");
        t=input.nextInt();
        
        luas=0.5*a*t;
        System.out.println("Luas Segitiga : "+luas);
    }
}
