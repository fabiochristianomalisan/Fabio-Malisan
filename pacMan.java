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
public class pacMan {
    int x, y, widht, height;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        pacMan pM = new pacMan();
        System.out.println("Masukkan widht : ");
        pM.widht = input.nextInt();
        System.out.println("Masukkan height  : ");
        pM.height = input.nextInt();
        System.out.println("Masukkan Koordinat X : ");
        pM.x = input.nextInt();
        System.out.println("Masukkan Koordinat Y : ");
        pM.y = input.nextInt();
        
            if ((pM.x > 0 && pM.x < pM.widht) && (pM.y > 0 && pM.y < pM.height)){
                pM.moveLeft(pM.x);
                pM.moveup(pM.y);
                pM.CetakPosisi();
            }
    }
    void moveLeft(int M){
        int g = M - 1;
        x = g;
    }
    void moveRight(int M){
        int g = M + 1;
        x = g;
    }
    void moveup(int V){
        int f = V - 1;
        y = f;
    }
    void moveDown(int V){
        int f = V + 1;
        y = f;
    }
    void CetakPosisi(){
        System.out.println("Koordinat terbaru : " + x + " , " + y);
    }
}
