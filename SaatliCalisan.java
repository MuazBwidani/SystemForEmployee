
package calisangir;

public class SaatliCalisan extends Calisan{
    double SaatNum;
    double SaatFiat;
    

    SaatliCalisan(String Adı, String SoyAd, int ssnko, int SaatNu , int SaatFia) {
  super(Adı,SoyAd,ssnko);
  SaatNum=SaatNu;
  SaatFiat=SaatFia;
  
    }
    /**
     *
     * @return
     */
    @Override
    public int maasHesapla()
    {
    double fazla;
    double AyMaaş;   
       
       if(SaatNum>40)
       {
           fazla=(SaatNum-40)*1.5;
           AyMaaş=(40*SaatFiat)+(fazla*SaatFiat);
       }
       else
       
           AyMaaş=SaatNum*SaatFiat;
       
       return (int)AyMaaş;
    }
   
}

