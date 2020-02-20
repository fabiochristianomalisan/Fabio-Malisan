/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.data;

/**
 *
 * @author ACER
 */
public class vidioGame {
    int id, lamapinjam, hargasewa, total;
    String namaMember, namaGame;
    
    public static void main (String[] args){
        vidioGame vG = new vidioGame();
                  vG.id = 311002022;
                  vG.namaMember = "battok";
                  vG.lamapinjam = 20;
                  vG.hargasewa = 50000;
                  vG.totalHarga();
                  vG.tampilData();
                  
    }
    void tampilData(){
        System.out.println("ID : " +id);
        System.out.println("Nama Member : " + namaMember);
        System.out.println("Lama Menminjam : " + lamapinjam);
        System.out.println("Harga Sewa : " + hargasewa);
        System.out.println("Total Pembayaran : " + total);
    }
    void totalHarga(){
        total = lamapinjam*hargasewa;
    }
}
