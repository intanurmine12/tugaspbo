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
public class biodataaaa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, alamat, hobi, citacita;
        int umur, tinggibadan, nis;
        
        System.out.print("Masukkan nama  : ");
        nama = input.nextLine();
        System.out.print("Masukkan alamat  : ");
        alamat = input.nextLine();
        System.out.print("Masukkan hobi  : ");
        hobi = input.nextLine();
        System.out.print("Masukkan citacita  : ");
        citacita = input.nextLine();
        System.out.print("Masukkan umur  : ");
        umur = input.nextInt();
        System.out.print("Masukkan tinggibadan  : ");
        tinggibadan = input.nextInt();
        System.out.print("Masukkan nis  : ");
        nis = input.nextInt();
        
        System.out.println("<---------BIODATA SAYA--------->");
        System.out.println("Nama saya : "+nama);
        System.out.println("Alamat saya : "+alamat);
        System.out.println("Cita-cita saya : "+citacita);
        System.out.println("Umur saya : "+umur);
        System.out.println("Tinggi Badan saya : "+tinggibadan);
        System.out.println("Nis saya : "+nis);
        
        
    }
}
