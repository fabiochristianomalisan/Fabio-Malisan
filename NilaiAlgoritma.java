/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet.pkg3;

/**
 *
 * @author ACER
 */
class NilaiAlgoritma {
    String namaMhs;
    int nilaiTugas;
    int nilaiKuis;
    int nilaiUAS;
    int nilaiUTS;
    
    double hitungTotalNilai(){
        int total= (nilaiTugas*30/100) + (nilaiKuis*20/100)+ 
                (nilaiUTS*20/100)+ (nilaiUAS*30/100);
        return total;
    }
}

