/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J11;

/**
 *
 * @author Anandarafi
 */
public class ConvertVocal2Angka {
    private static void tampilJudul(String identitas)
    {
        System.out.println("Identitas : " + identitas);
        
        System.out.println("\nConvert Kalimat Alay Angka (Vokal Ke Angka)\n");
    }
    
    public static void main(String[] args)
    {
        String identitas = ("Ananda Rafi Amanullah / X RPL 3 / 04");
        tampilJudul(identitas);
    }
}
