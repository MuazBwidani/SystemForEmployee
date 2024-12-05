
package calisangir;

public class MaasliCalisan extends Calisan {
   int HaftalıkMaaş;
   int AyMaaş;

    MaasliCalisan(String Adı,String SoyAd,int ssnko,int HaftalıkMaaş ) {
            super(Adı,SoyAd,ssnko);
            this.HaftalıkMaaş=HaftalıkMaaş;
        }

    /**
     *
     * @return
     */
    @Override
   public int maasHesapla()
    {
       
       AyMaaş=HaftalıkMaaş*4;
       return AyMaaş;
    }
  
   
}

