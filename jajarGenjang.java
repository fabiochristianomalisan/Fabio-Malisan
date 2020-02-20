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
public class jajarGenjang {
    public int tinggi;
    public int panjang;
    public int sisiMiring;
    
    int hitungLuas(){
        return panjang*tinggi;
    }
    int hitungKeliling(){
        return 2 * panjang + sisiMiring;
    }
    public static void main(String[] args){
        jajarGenjang[] jGArray = new jajarGenjang[5];
        Scanner input = new Scanner (System.in);
        
        for(int a=0; a<5; a++){
            jGArray[0] = new jajarGenjang();
            System.out.println("Jajar Genjang ke-" +a);
            System.out.println("Masukkan Tinggi     : ");
            jGArray[0].tinggi = input.nextInt();
            System.out.println("Masukkan Tinggi     :");
            jGArray[0].panjang = input.nextInt();
            System.out.println("Masukkan Sisi Miring : ");
            jGArray[0].sisiMiring = input.nextInt();
            System.out.println("=========================================");
        }
        
        for(int a = 0; a<5; a++){
            System.out.println("Luas Jajar Genjang ke-"+a+"     :"+jGArray[0].hitungLuas());
            System.out.println("Keliling Jajar Genjang ke-"+a+"  :"+jGArray[0].hitungKeliling());
            
            System.out.println("================================================");
        }
    }
}
