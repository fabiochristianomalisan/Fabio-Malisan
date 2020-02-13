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
public class perulangan1 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int n;
        System.out.println("Masukkan nilai : ");
        n = input.nextInt();
        
        for(int b=1; b >=5; b++ );
        n-=3;
        
        if(n%2==0){
            System.out.println(" bilangan genap");
        }else{
            System.out.println("bilangan ganjil");
        }
        System.out.println("hasil dari operasi " +n);
    }
}
