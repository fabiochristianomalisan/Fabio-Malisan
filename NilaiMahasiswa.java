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
public class NilaiMahasiswa {
    int nilai1, nilai2, a, b;
    
    public static void main(String[] args){
        NilaiMahasiswa NM = new NilaiMahasiswa();
        Scanner input = new Scanner(System.in);
        System.out.println("Jumlah Mahasiswa : ");
        int jmlMhs = input.nextInt();
        
        NilaiMahasiswa[] NMhs = new NilaiMahasiswa[jmlMhs];
        for(int m=0; m<jmlMhs; m++){
            NMhs[m] = new NilaiMahasiswa();
        System.out.println("Mhs "+ (m+1));
        System.out.print("Nilai 1 : ");
        NMhs[m].nilai1 = input.nextInt();
        System.out.print("Nilai 2 : ");
        NMhs[m].nilai2 = input.nextInt();
        
        }
        System.out.println("");
        for(int n=0; n<jmlMhs; n++){
            if(NMhs[n].nilai1 > NMhs[n].nilai2){
                System.out.println("Nilai Terbaik "+(n+1)+": "+NMhs[n].nilai1);
            }else{
                System.out.println("Nilai Terbaik Mhs "+": "+NMhs[n].nilai2);
            }
        }
    }
}
