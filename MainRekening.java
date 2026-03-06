/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adema
 */
public class MainRekening {
    public static void main(String[] args) {

       
        Rekening r1 = new Rekening ("13579", "Naruto", 10000);

        System.out.println("Rekening 1");
        System.out.println("Norek : " + r1.getNomorRekening());
        System.out.println("Nama  : " + r1.getNamaPemilik());
        System.out.println("Saldo : " + r1.getSaldo());

        System.out.println("\nMelakukan deposit...");
        r1.deposit(1000);

        System.out.println("\nMelakukan withdraw...");
        r1.withdraw(2000);

        System.out.println("\n========================\n");

      
        Rekening r2 = new Rekening("24680", "Sasuke", 20000);

        System.out.println("Rekening 2");
        System.out.println("Norek : " + r2.getNomorRekening());
        System.out.println("Nama  : " + r2.getNamaPemilik());
        System.out.println("Saldo : " + r2.getSaldo());

        System.out.println("\nMelakukan deposit...");
        r2.deposit(3000);

        System.out.println("\nMelakukan withdraw...");
        r2.withdraw(50000); 
    }
}

