/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.data;

/**
 *
 * @author ACER
 */
class Lingkaran {
     double PHI = 3.14, r;
    double hitungLuas(double r){
        double luas = PHI*2 * r;
        return luas;
    }
    double hitungkeliling(double r){
        double keliling  = PHI *2 * r;
        return keliling;
    }
}

