/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.data;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class Barang {
    String namaBarang;
    int hargasatuan, jumlahBarang;
    int diskon;
    
public static void main(String[] args){
    Barang brg = new Barang();
    Scanner input = new Scanner (System.in);
    System.out.println("Masukkan Nama Barang : ");
    brg.namaBarang = input.nextLine();
    System.out.println("Masukkan Harga Satuan  : ");
    brg.hargasatuan = input.nextInt();
    System.out.println("Masukkan Jumlah Barang : ");
    brg.jumlahBarang = input.nextInt();
    
    System.out.println("========================================================");
    System.out.println("Nama Barang : " + brg.namaBarang);
    System.out.println("Harga Satuan : " + brg.hargasatuan);
    System.out.println("Jumlah Barang : " + brg.jumlahBarang);
    System.out.println("Harga Total : " + brg.hitungHargatotal());
    System.out.println("Diskon : " + brg.hitungDiskon());
    System.out.println("Total Harga Barang : " +brg.hitungHargabayar());
}    
int hitungHargatotal (){
    return hargasatuan*jumlahBarang;
}
int hitungDiskon (){
    if (hitungHargatotal() > 20000) {
        diskon = hitungHargatotal() * 10/1000;
    }
    else if (hitungHargatotal() >= 5000 && hitungHargatotal() <= 100000){
        
    }
    return diskon;
}
int hitungHargabayar(){
    return hitungHargabayar() - hitungDiskon();
}
}
