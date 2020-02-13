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
public class TUGASSS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int  Tugas, Uts, Uas, Nilaiakhir, NamaSiswa;
        System.out.print("Niai Tugas : ");
        Tugas = sc.nextInt();
        System.out.print("Nilai Uts : ");
        Uts = sc.nextInt();
        System.out.print("Nilai Uas : ");
        Uas = sc.nextInt();
        
        if(Tugas>=0 && Tugas<=100 || Uts>=0 && Uts<=100 || Uas>=0 && Uas<=100) {
            
            Tugas = Tugas*20/100;
            Uts = Uts*35/100;
            Uas = Uas*45/100;
            Nilaiakhir=Tugas+Uts+Uas;
            System.out.print("Nilai akhir : " + Nilaiakhir);
             System.out.println();
            
        }
        else {
            System.out.println("Batas Nilai yang dimasukkan harus 0-100");
        }
    }
    
}
