import GLOOP.*;
public class Uhrenszene{
    private GLEntwicklerkamera kamera;
    private GLLicht licht;
    private GLTastatur tastatur;
    private Wand wand;
    private Uhr uhr;


    public void Uhrenszene() {
        kamera = new GLEntwicklerkamera();
        licht = new GLLicht(50, 50, 50);
        tastatur = new GLTastatur();
        kamera.setzePosition(50, 50, 1000);
        wand = new Wand();
        wand.Wand(0, 0, -10);
        uhr = new Uhr(0, 0);

        while(!tastatur.esc()){
        uhr.weiter();
        Sys.warte(50);
        }
    }





        }



