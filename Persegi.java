/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adema
 */
public class Persegi {
    private int p;
    private int l;

    public Persegi(int p, int l) {
        this.p = p;
        this.l = l;
    }

    // Getter untuk Panjang
    public int getP() {
        return p;
    }

    // Getter untuk Lebar
    public int getL() {
        return l;
    }

    public int getLuas() {
        return p * l;
    }

    public int getKeliling() {
        return 2 * (p + l);
    }
}

