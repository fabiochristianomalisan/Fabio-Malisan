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
public class jualBeliTanah {
    int panjang, lebar;
    
        int hitungTanah(){
            return panjang * lebar;
        }
    public static void main(String[] args){
        jualBeliTanah jBL = new jualBeliTanah();
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah Tanah : ");
        int jmlTanah = input.nextInt();
        jualBeliTanah[] jBLArray = new jualBeliTanah[jmlTanah];
                        for(int z = 0; z < jmlTanah; z++){
                            jBLArray[z] = new jualBeliTanah();
                            System.out.println("Tanah   :" + (z));
                            System.out.println("Panjang :");
                            jBLArray[z].panjang = input.nextInt();
                            System.out.println("Lebar : ");
                            jBLArray[z].lebar = input.nextInt();
                            System.out.println();
                        }
                        for (int y = 0; y < jmlTanah; y++){
                            System.out.println("Luas Tanah " + (y) + " : " + jBLArray[y].hitungTanah());
                        }
    }
}
