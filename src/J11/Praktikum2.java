/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J11;

import java.util.Scanner;

/**
 *
 * @author Anandarafi
 */
public class Praktikum2 {
     private static void tampilJudul(String identitas)
    {
        System.out.println("Identitas : " + identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (Vokal Ke Angka)\n");
    }
      private static String tampilInput()
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukkan Kalimat : ");
        String kalimat = scanner.nextLine();
        System.out.println("Kalimat Asli : " + kalimat);
        return kalimat;
        
    }
     public static void main(String[] args)
    {
        String identitas = ("Ananda Rafi Amanullah / X RPL 3 / 04");
        tampilJudul(identitas);
        
        String kalimat = tampilInput();
    }
}
