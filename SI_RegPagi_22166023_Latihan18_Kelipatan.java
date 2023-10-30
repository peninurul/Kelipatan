/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi_22166023_latihan18_kelipatan;
import java.until.Scanner;
/**
 *
 * @author user
 * NAMA : Peni Nurul Fauzah
 * KELAS : PBO18
 * NIM : 22166023
 * DESKRIPSI PROGRAM : Program Kelipatan
 */
public class SI_RegPagi_22166023_Latihan18_Kelipatan {

    public static void main(String[] args) {
        System.out.println("Bilangan kelipatan 3.5 dari 3.5 hingga 35:");

        for (double i = 3.5; i <= 35; i+= 0.5) {
            // Cek apakah bilangan merupakan kelipatan 3 atau 5
            if (i % 3.5 == 0) {
                System.out.println(i);
            }
        }
    }
    
}
