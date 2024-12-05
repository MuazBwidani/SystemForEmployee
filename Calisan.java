
package calisangir;

import java.util.Scanner;


abstract class Calisan implements Odeme {
            String Adı;
            String SoyAd;
            int ssnko;
    Calisan(String isim,String soisim,int sskno){ 
            Adı=isim; 
            SoyAd=soisim; 
            ssnko=sskno; 
           } 
    @Override
 public abstract int maasHesapla(); 
    void print()
    {
       
        System.out.println("Calisan Adı:");
        System.out.println(Adı);
        System.out.println("Calisan SoyAd:");
        System.out.println(SoyAd);
        System.out.println("Calisan ssnko:");
        System.out.println(ssnko);
        
        
    }
    void read()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Calisan Adı:");
        Adı=input.next();
        System.out.println("Enter Calisan SoyAd:");
        SoyAd=input.next();
        System.out.println("Enter Calisan ssnko:");
        ssnko=input.nextInt();
    }
    
}

