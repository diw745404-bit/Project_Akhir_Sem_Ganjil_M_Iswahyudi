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
        System.out.print("Pilihan hitung:\n1. Kubus\n2. Balok\n:");
        int choice = input.nextInt();
        switch (choice) {
            case 1 ->                 {
                    System.out.print("Masukkan nilai sisi: ");
                    double sisi = input.nextDouble();
                    kubus.setSisi(sisi);
                    System.out.print("Ingin hitung apa?\n1. Luas Permukaan\n2. Keliling\n3. Volume\n:");
                    int calchoice = input.nextInt();
                    switch (calchoice) {
                        case 1 -> System.out.println("Hasil hitung luas permukaan kubus: " + kubus.luas());
                        case 2 -> System.out.println("Hasil hitung keliling kubus: " + kubus.keliling());
                        case 3 -> System.out.println("Hasil hitung volume kubus: " + kubus.volume());
                        default -> System.out.println("Pilihan " + calchoice + " tidak valid.");
                    }                      }
            case 2 ->                 {
                    System.out.println("Masukkan panjang, lebar, tinggi (pisah dengan spasi): ");
                    double panjang = input.nextDouble();
                    double lebar = input.nextDouble();
                    double tinggi = input.nextDouble();
                    balok.setData(panjang, lebar, tinggi);
                    System.out.println("Ingin hitung apa?\n1. Luas Permukaan\n2. Keliling\n3. Volume\n:");
                    int calchoice = input.nextInt();
                    switch (calchoice) {
                        case 1 -> System.out.println("Hasil hitung luas permukaan balok: " + balok.luas());
                        case 2 -> System.out.println("Hasil hitung keliling balok: " + balok.keliling());
                        case 3 -> System.out.println("Hasil hitung volume balok: " + balok.volume());
                        default -> System.out.println("Pilihan " + calchoice + " tidak valid.");
                    }                      }
            default -> System.out.println("Pilihan tidak valid");
        }
    }
    
}
