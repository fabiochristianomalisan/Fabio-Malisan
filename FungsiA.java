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
public class FungsiA {
    static void fibonacci(){
        int n = 10, a = 0, b = 1, f;
        
        
        System.out.print("Fibonacci : ");
        for(int i = 2; i <= n; i++) {
            System.out.print(a + " ");
            f = a + b;
            a = b;
            b = f;
        }
    }
    public static void main(String [] args){
        fibonacci();
    }
}
