/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasss;
import java.util.Scanner;
/**
 *
 * @author Daryanto
 */
public class perulangan2 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int saldoawal;
       System.out.print("Masukkan Saldo Awal : ");
       saldoawal=sc.nextInt();
       
       for(int i=0; i<12; i++){
           saldoawal+=saldoawal*2/100;
       }
       System.out.println("Saldo akhir : " + saldoawal);
    }
}
