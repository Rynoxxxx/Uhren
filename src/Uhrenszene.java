import GLOOP.*;
public class Uhrenszene{
    private GLKamera kamera;
    private GLLicht licht;
    private GLTastatur tastatur;

    private Uhr uhr;

    public Uhrenszene(){
        kamera = new GLKamera();        
        licht  = new GLLicht();
        tastatur = new GLTastatur();
        kamera.setzePosition(0,0,1000);
      
        uhr = new Uhr(0, 0);
       
        while (!tastatur.esc()){
            uhr.weiter();            
            Sys.warte(100);
        }
        Sys.beenden();
    }
}
