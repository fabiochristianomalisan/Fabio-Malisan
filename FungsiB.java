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
public class FungsiB {
    static int fibo(int n){
        if(n==0||n==1){
            return n;
        }else{
            return(fibo(n-1)+fibo(n-2));
        }
    }
    public static void main(String[]args){
        int i, j = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Deret Bilangan Fibonacci: ");
        int n = scan.nextInt();
        System.out.print("Hasil Bilangan Fibonacci: ");
        for(i= 0;i<n;i++){
            System.out.print(fibo(j)+",");
            j++;
        }
        System.out.println();
    }
}
