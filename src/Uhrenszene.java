import GLOOP.*;
import java.util.Calendar;
public class Uhrenszene {
    private GLEntwicklerkamera kamera;
    private GLLicht licht;
    private GLTastatur tastatur;
    private Wand wand;
    private Uhr uhr1, uhr2, uhr3;

    private GLTafel datum;
    int anpassungStu, anpassungMin, anpassungSek, anpassungDatum, zeitJetzt;


    public void Uhrenszene() {
        kamera = new GLEntwicklerkamera();
        licht = new GLLicht(50, 50, 50);
        tastatur = new GLTastatur();
        kamera.setzePosition(50, 50, 1000);
        wand = new Wand();
        wand.Wand(0, 0, -10);
        uhr1 = new Uhr(0, 0);
        uhr2 = new Uhr(0,450);
        datum = new GLTafel(140,0,0,55,35);
        Zeitanpassung();
        /*while (!tastatur.esc()) {
            uhr1.weiter();
            Sys.warte(50);
        }

         */
    }
        //zeitanpassung der Uhren

            public void Zeitanpassung(){
                    Calendar jetzt = Calendar.getInstance();
                    //Calendar heute = Calendar.getInstance();
                    anpassungStu = (jetzt.get(Calendar.HOUR_OF_DAY));// passt die Stunde an
                    anpassungMin = (jetzt.get(Calendar.MINUTE));// passt die minute an
                    anpassungSek = (jetzt.get(Calendar.SECOND));// passt die sekunde an
                    anpassungDatum = (jetzt.get(Calendar.DATE));

                    datum.setzeText(String.valueOf(anpassungDatum),25);


                    if(anpassungStu>12) anpassungStu = anpassungStu - 12;           //



                    System.out.println(anpassungStu);
                    System.out.println(anpassungMin);
                    System.out.println(anpassungSek);


                    anpassungStu=anpassungStu*12*60;                                //HIER FEHLER
                    anpassungMin=anpassungMin*60;

                    //uhr1

                    for (int stu = 0; stu < anpassungStu; stu++) {
                        uhr1.weiterStu();
                        uhr2.weiterStu();
                    }
                    for (int min = 0; min < anpassungMin; min++) {
                        uhr1.weiterMin();
                        uhr2.weiterMin();
                    }
                    for (int sek = 0; sek < anpassungSek; sek++) {
                        uhr1.weiterSek();
                        uhr2.weiterSek();
                    }


                    //uhr2




                    while(!tastatur.esc()) {
                        uhr1.weiterStu();
                        uhr1.weiterMin();
                        uhr1.weiterSek();
                        uhr2.weiterStu();
                        uhr2.weiterMin();
                        uhr2.weiterSek();
                        Sys.warte(1000);
                    }

    }
}









