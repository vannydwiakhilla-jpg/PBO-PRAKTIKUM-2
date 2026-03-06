/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author adema
 */
public class MainBuku {
    public static void main(String[] args) {
        
        // membuat objek buku
        Buku buku1 = new Buku("Naruto", "Masashi Kishimoto", "12345");

        // menampilkan data buku
        System.out.println("Judul Buku : " + buku1.getJudul());
        System.out.println("Pengarang  : " + buku1.getPengarang());
        System.out.println("ISBN       : " + buku1.getIsbn());
    }
}