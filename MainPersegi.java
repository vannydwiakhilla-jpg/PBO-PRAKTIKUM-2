
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adema
 */
public class MainPersegi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("-- MENU --");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Keluar");
            System.out.print("Pilih : ");
            pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.print("\nMasukkan sisi : ");
                int sisi = input.nextInt();
                // Untuk persegi, panjang dan lebar nilainya sama
                Persegi persegi = new Persegi(sisi, sisi);
                
                System.out.println("Sisi     : " + persegi.getP());
                System.out.println("Luas     : " + persegi.getLuas());
                System.out.println("Keliling : " + persegi.getKeliling() + "\n");

            } else if (pilihan == 2) {
                System.out.print("\nMasukkan panjang : ");
                int p = input.nextInt();
                System.out.print("Masukkan lebar   : ");
                int l = input.nextInt();
                
                Persegi pPanjang = new Persegi(p, l);
                
                System.out.println("Panjang  : " + pPanjang.getP());
                System.out.println("Lebar    : " + pPanjang.getL());
                System.out.println("Luas     : " + pPanjang.getLuas());
                System.out.println("Keliling : " + pPanjang.getKeliling() + "\n");

            } else if (pilihan == 3) {
                System.out.println("\nTerima kasih");
            } else {
                System.out.println("\nPilihan salah\n");
            }

        } while (pilihan != 3);
        
        input.close();
    }
}

