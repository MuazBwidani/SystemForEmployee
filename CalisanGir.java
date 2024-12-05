
package calisangir;

import java.util.Scanner;

public class CalisanGir {
    
    public static void main(String[] args) {
        Calisan []list=new Calisan[3];
        String choise;
        Calisan a=new MaasliCalisan(" "," ",100,200);
        Calisan b=new PrimliCalisan(" "," ",100,200,300);
        Calisan c=new SaatliCalisan(" "," ",100,200,300);
        Scanner input=new Scanner(System.in);
       
       System.out.print("Welcome to you in our program");
       for(int i=0;i<=2;i++)
       {
       System.out.print("Enter MaasliCalisan or PrimliCalisan Yada SaatliCalisan ");
        
        choise=input.nextLine();
        if(choise.equalsIgnoreCase("MaasliCalisan"))
        {
         a.read();
         a.maasHesapla();
        }else
        if(choise.equalsIgnoreCase("PrimliCalisan"))
        {
         b.read();
         b.maasHesapla();
        }else
        if(choise.equalsIgnoreCase("MaasliCalisan"))
        {
         c.read();
         c.maasHesapla();
        }
       }
        for(int i=0;i<=2;i++)
       {
         list[0]=a;
         list[0].print();
         System.out.print("Maaş:"+list[0].maasHesapla());
         list[1]=b;
         list[1].print();
         System.out.print("Maaş:"+list[1].maasHesapla());
         list[2]=c;
         list[3].print();
         System.out.print("Maaş:"+list[2].maasHesapla());
       }
    }
    
    
}