
package calisangir;

public class PrimliCalisan extends Calisan{
    int SatıNum;
    int SatıAve;
    
    

    PrimliCalisan(String Adı, String SoyAd, int ssnko, int SatıNum , int SatıAve) {
  super(Adı,SoyAd,ssnko);
  this.SatıNum=SatıNum;
  this.SatıAve=SatıAve;

    }

    /**
     *
     * @return
     */
    @Override
    public int maasHesapla()
    {
       int AyMaaş;
       AyMaaş=SatıNum*SatıAve;
       return AyMaaş;
    }
          
    
}
