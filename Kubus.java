/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulator_bangun_ruang;

/**
 *
 * @author M. Iswahyudi
 */
public class Kubus {
    private double sisi;
    
    //setter
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
    
    // getter
    public double getSisi() {
        return this.sisi;
    }
    
    public double luas() {
        return 6*(sisi*sisi);
    }
    
    public double volume() {
        return Math.pow(sisi, 3.0);
    }
    
    public double keliling() {
        return 12 * sisi;
    }
}
