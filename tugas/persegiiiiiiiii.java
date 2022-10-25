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
public class persegiiiiiiiii {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
            int s;
            double luas;
            double keliling;
        System.out.println("Menghitung Luas Persegi");    
        System.out.print("Masukkan Sisi  : ");
        s = input.nextInt();
        
        luas = s*s;
        System.out.println("Luas persegi = "+luas);
        keliling = 4*s;
        System.out.println("Keliling persegi = "+keliling);
    }
}
