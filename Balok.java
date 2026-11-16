/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulator_bangun_ruang;

/**
 *
 * @author M. Iswahyudi
 */
public class Balok {
    private double panjang;
    private double lebar;
    private double tinggi;
    
    public void setData(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public double getPanjang() {
        return this.panjang;
    }
    
    public double getLebar() {
        return this.lebar;
    }
    
    public double getTinggi() {
        return this.tinggi;
    }
    
    public double luas() {
        return 2 * ((panjang*lebar) + (panjang*tinggi) + (lebar*tinggi));
    }
    
    public double volume() {
        return panjang * lebar * tinggi;
    }
    
    public double keliling() {
        return 4 * (panjang+lebar+tinggi);
    }
}
