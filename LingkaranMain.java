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
public class LingkaranMain {
    public static void main(String[] args){
        Lingkaran Ling = new Lingkaran();
        Scanner input = new Scanner  (System.in);
        
        System.out.println("Masukkan jari-jari : ");
        Ling.r = input.nextDouble();
        
        double hitungLuas = Ling.hitungLuas(Ling.r);
        double hitungKeliling = Ling.hitungkeliling(Ling.r);
        
        System.out.println("Luas Lingkaran = " + hitungLuas);
        System.out.println("Keliling Lingkaran = " + hitungKeliling);
    }
}
