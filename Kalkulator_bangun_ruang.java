/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulator_bangun_ruang;
import java.util.Scanner;

/**
 *
 * @author M. Iswahyudi
 */
public class Kalkulator_bangun_ruang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Kubus kubus = new Kubus();
        Balok balok = new Balok();
        System.out.print("Masukkan nilai sisi untuk kubus: ");
        double sisi = input.nextDouble();
        kubus.setSisi(sisi);
        System.out.print("Masukkan panjang, lebar, tinggi untuk balok (dipisahkan dengan spasi):\n");
        double panjang = input.nextDouble();
        double lebar = input.nextDouble();
        double tinggi = input.nextDouble();
        balok.setData(panjang, lebar, tinggi);
        System.out.println("====================================================");
        System.out.println("Hasil hitung luas permukaan kubus: " + kubus.luas());
        System.out.println("Hasil hitung keliling kubus: " + kubus.keliling());
        System.out.println("Hasil hitung volume kubus: " + kubus.volume());
        System.out.println("====================================================");
        System.out.println("Hasil hitung luas permukaan balok: " + balok.luas());
        System.out.println("Hasil hitung keliling balok: " + balok.luas());
        System.out.println("Hasil hitung volume balok: " + balok.volume());
        System.out.println("====================================================");
    }
    
}
