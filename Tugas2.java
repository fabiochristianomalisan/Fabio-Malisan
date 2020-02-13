/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;
import java.util.Scanner;
/**
 *
 * @author Daryanto
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int y;
        
        System.out.print("Masukkan nilai Y : ");
        y=sc.nextInt();
        
        if(y%2==0 && y%6!=0 && y%15!=0){
            System.out.println("Bilangan Kelipatan 2");
        }
        else if (y%6==0 && y%15!=0){
            System.out.println("Bilangan Kelipatan 6");
        }
        else if (y%15==0){
            System.out.println("Bilangan Kelipatan 15");
        }
        else {
            System.out.println("Bilangan Bukan Kelipatan 2, 6, ataupun 15");
        }
    }
    
}
