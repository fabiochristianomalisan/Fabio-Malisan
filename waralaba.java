/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugassatu;
import java.util.Scanner;
/**
 *
 * @author ACER
 */
public class waralaba {
    public static void  main(String[] args){
        
    }
    static Scanner input = new Scanner (System.in);
    static void menu(){
        String [] Paketchiken = new String[100];
        String [] Paketoke = new String[100];
        int i=0;
        int [] harga = new int[100];
        int [] harga2 =new int[100];
        int jumlah = 0;
        int hargatotal = 0;
       

        System.out.print("======================================================");
        System.out.print("                    WARUNG MAMA                       ");
        System.out.print("                    SELAMAT PAGI                      ");
        System.out.print("======================================================");
        System.out.println("");
        System.out.println("                 SILAHKAN PILIH MENU                ");
        System.out.println("1.Paket chiken ");
        System.out.println("A.Chiken A                  |Rp.12.000|");
        System.out.println("B. Chiken B                 |Rp.15.000|");
        System.out.println("C. Chiken C                 |Rp.20.000|");
        System.out.println("2.Paket oke");
        System.out.println("A.oke A                     |Rp.10.000|");
        System.out.println("B.oke B                     |Rp.12.000|");
        System.out.println("C.oke C                     |Rp.15.000|");
        System.out.println("");
        
   
   System.out.print("Silahkan pilih makanan yang anda inginkan");
   int pil=input.nextInt();
   switch (pil){
       case 1:
           Paketchiken [i] = "Chiken A";
          harga [i] = 12000;
          break;
       case 2:
           Paketchiken [i] = "Chiken B";
           harga [i] = 15000;
           break;
       case 3:
           Paketchiken [i] = "Chiken C";
           harga [i] = 20000;
           break;
       case 5:
       default:
           System.out.println("Pilihan makanan yang anda pesan sudah siap");
           break;
            
          }
   for (int k=pil;k<3;k++){
       System.out.println("makanan pilihan anda adalah : "+Paketchiken[i]);
       System.out.print("Jumlah pesanan anda");
       int jmlhmakanan = input.nextInt();
       harga[i]=harga[i]*jmlhmakanan;
       System.out.println("Harga makanan : Rp."+harga[i]+";");
       break;
   }
   System.out.println("");
   System.out.print("Silahkan pilih paket makanan : ");
   int pil2=input.nextInt();
   switch (pil2){
       case 1:
           Paketoke [i] = "oke A";
           harga [i] = 10000;
           break;
       case 2:
           Paketoke [i] = "oke B";
           harga [i] = 12000;
           break;
       case 3:
           Paketoke [i] = "oke C";
           harga [i] = 15000;
           break;
       default:
           System.out.println("Maknan yang ada pilih sudah siap");
   }
   for (int j=pil2;j<3;j++){
       System.out.println("Makanan yang anda pilih adalah : "+Paketoke[i]);
       System.out.print("jumlah pesanan :");
       int jmlhpesanan = input.nextInt();
       harga2[i]=harga2[i]*jmlhpesanan;
       System.out.println("harga makanan sebesar : Rp. "+harga2[i]+ ";");
       break;
   }
   System.out.println("");
   int totalPaketchiken = 0;
   int totalPaketoke = 0;
   int total=harga[i]+harga2[i];
   System.out.println("Total belanja sebesar : Rp. "+total+ ";");
    }
}
   
   