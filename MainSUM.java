/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertanyaan3;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class MainSUM {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.println("===========================");
        System.out.println("Program Menghitung Keuntungan total (Satuan juta. misal 5.6)");
        System.out.print("Masukkan jumlah bulan : ");
        int elm = sc.nextInt();
        
        SUM Sm = new SUM(elm);
        System.out.println("===================================");
        for (int i = 0; i < Sm.elemen; i++){
            System.out.print("Masukkan untung bulan ke - " + (i+1) + " = ");
            Sm.keuntungan[i] = sc.nextDouble();
        }
            System.out.println("================================================");
            System.out.println("Algoritma brute force");
            System.out.println("total keuntungan perusahaan selama " + Sm.elemen + " Bulan Adalah = "+ Sm.totalBF(Sm.keuntungan));
            System.out.println("==================================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + Sm.elemen + " Bulan Adalah = " +Sm.totalDC(Sm.keuntungan, 0, Sm.elemen-1));
        }
    }
    



