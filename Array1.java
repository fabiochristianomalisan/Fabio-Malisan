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
public class Array1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n, ray, g=0, j=0;
        System.out.println("");
        System.out.println("Masukkan Jumlah Baris : ");
        n = sc.nextInt();
        int[] Array = new int[n];
        int[] genap = new int[n];
        int[] ganjil = new int[n];
        
        for(int i=0;i<Array.length;i++){
            System.out.print("Masukkan Array Ke-" + (i+1)+":");
            Array[i] = sc.nextInt();
            ray = Array[i];
            if(ray%2==0){
                genap[g] = ray;
            }else if(Array[i]%2==1){
                ganjil[j]= ray;
                j++;
            }
        }
        System.out.println("");
        for(int i=0;i<g;i++){
            System.out.println("Angka Genap : " + genap[i]);
        }
        System.out.println("");
        System.out.println("");
        for(int i=0;i<j;i++){
          System.out.println("Angka Ganjil : "+ ganjil[i]);
        }
        System.out.println("");
    }
}
