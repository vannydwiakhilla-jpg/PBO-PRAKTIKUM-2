/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adema
 */
public class Rekening {
    private final String nomorRekening;
    private String namaPemilik;
    private double saldo;

    public Rekening(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    public String getNomorRekening() {
        return nomorRekening;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public void deposit(double jumlah) {
        saldo += jumlah;
        System.out.println("Jumlah deposit sebesar Rp. " + jumlah);
        System.out.println("Sisa saldo anda : Rp. " + saldo);
    }

    public void withdraw(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Jumlah withdraw sebesar Rp. " + jumlah);
            System.out.println("Sisa saldo anda : Rp. " + saldo);
    
        } else {
            System.out.println("Saldo tidak mencukupi");
        }
    }
}

