/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J11;

import java.util.Locale;

/**
 *
 * @author Anandarafi
 */
public class Praktikum1 {
    public static void main(String[] args)
    {
        String identitas = ("Ananda Rafi Amanullah / X RPL 3 / 04");
        System.out.println("Identitas : " + identitas);
        
        String x = "Operasi";
        System.out.println("isi variabel x : " + x);
        System.out.println("\"" + x + "\" panjang karakter =" + x.length() );
        
        System.out.println("x adalah kosong : " + x.isEmpty());
        
        String y = "";
        System.out.println("isi variabel y : " + y);
        System.out.println("y adalah kosong : " + y.isEmpty());
        
        System.out.println("isi x sama dengan y : " + x.equals(y));
        
        String z = "Operasi";
        System.out.println("isi variabel z : " + z);
        System.out.println("isi x sama dengan z (Case Sensitive): " + x.equals(z));
        
        String r = "operasi";
        System.out.println("isi variabel r : " + r);
        System.out.println("isi x sama dengan r (Case Sensitive): " + x.equals(r));
        System.out.println("isi x sama dengan r (Not Case Sensitive): " + x.equalsIgnoreCase(r));
        
         System.out.println("Perbandingan isi x dengan y : " + x.compareTo(y));
        System.out.println("Perbandingan isi x dengan z (Case Sensitive) : " + x.compareTo(z));
        System.out.println("Perbandingan isi x dengan r (Case Sensitive) : " + x.compareTo(r));
        System.out.println("Perbandingan isi x dengan r (Not Case Sensitive) : " + x.compareToIgnoreCase(r));
        
        String s = "operasI";
        System.out.println("isi variabel s : " + s);
        System.out.println("Perbandingan isi r dengan s (Case Sensitive): " + r.compareTo(s));
        
        System.out.println("pada x terdapat huruf 'a' : " + x.contains("a"));
        
        System.out.println("isi variabel x besar semua : " + x.toUpperCase());
        System.out.println("isi variabel x kecil semua : " + x.toLowerCase());

        String t ="     operasi     ";
        System.out.println("isi variabel t : \""+ t +"\"");
        System.out.println("isi variabel t tanpa spasi : \"" + t.trim() + "\"");
        
        System.out.println("gabungkan isis variabel x dan r : " + x.concat(r));
        
        System.out.println("karakter mulai posisi 3 di variabel x : " + x.substring(3));
        System.out.println("karakter mulai posisi 3-5 di variabel x : " + x.substring(3,6));
        
        String tclean = t.trim();
        System.out.println("isi variabel tolean : " + t.trim());
        System.out.println("rubah 'i' jadi 'E' di variabel toelan : " + tclean.replace("i","E") );
        
        String[] arrT = tclean.split(" ");
        System.out.println("pecah kata di variabel tolean : ");
        for(int i = 0; i < arrT.length; i++)
            System.out.println(arrT[i]);
            
        String[] arrTr = tclean.split("r");
        System.out.println("pecah berdasarkan huruf 'r' di variabel tclean : ");
        for(int i = 0; i < arrTr.length; i++)
            System.out.println(arrTr[i]);
       double d =1545454000;
        System.out.println(String.format("Uang saya %,.4f", d ));
        
        System.out.println(String.format(Locale.forLanguageTag("in-ID"), "Uang saya Rp %,.2f", d));
 
    
    }
}
