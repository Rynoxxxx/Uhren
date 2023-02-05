import GLOOP.*;
import java.util.Calendar;
public class Uhrenszene {
    private GLTastatur tastatur;
    private Uhr uhr1, uhr2, uhr3, uhr4, uhr5, uhr6;

    private GLTafel datum;
    int anpassungStu, anpassungMin, anpassungSek, anpassungDatum, anpassungStuDublin;

    int anpassungStuSydney, anpassungStuSeoul, anpassungStuHonolulu, anpassungStuMoskau;
    public void Uhrenszene() {
        GLEntwicklerkamera kamera = new GLEntwicklerkamera();
        GLLicht licht = new GLLicht(100, 250, 400);
        tastatur = new GLTastatur();
        kamera.setzePosition(0, 250, 2000);
        Wand wand = new Wand();
        wand.Wand(0, 0, -10);
        uhr1 = new Uhr(0, 0);
        uhr2 = new Uhr(0,500);
        uhr3 = new Uhr(500,500);
        uhr4 = new Uhr(500,0);
        uhr5 = new Uhr(-500,500);
        uhr6 = new Uhr(-500,0);
        datum = new GLTafel(139,0,-3,55,40);
        Zeitanpassung();

    }
        //zeitanpassung der Uhren

            public void Zeitanpassung(){
                    Calendar jetzt = Calendar.getInstance();

                    //Calendar heute = Calendar.getInstance();
                    anpassungStu = (jetzt.get(Calendar.HOUR_OF_DAY));// passt die Stunde an
                    anpassungMin = (jetzt.get(Calendar.MINUTE));// passt die minute an
                    anpassungSek = (jetzt.get(Calendar.SECOND));// passt die sekunde an
                    anpassungDatum = (jetzt.get(Calendar.DATE));

                    datum.setzeText(String.valueOf(anpassungDatum),25); //datum

                    //------NEU--------
                    anpassungStuDublin = (jetzt.get(Calendar.HOUR_OF_DAY)-1);
                    anpassungStuSydney = (jetzt.get(Calendar.HOUR_OF_DAY)+10);
                    anpassungStuSeoul = (jetzt.get(Calendar.HOUR_OF_DAY)+8);            //-Stunden von Uhren
                    anpassungStuHonolulu = (jetzt.get(Calendar.HOUR_OF_DAY)-11);
                    anpassungStuMoskau = (jetzt.get(Calendar.HOUR_OF_DAY)+2);
                    //------NEU--------

                    if(anpassungStu>12) anpassungStu = anpassungStu - 12;      //-12 wegen 12 strichen auf ziffernblatt

                    //------NEU--------
                    if(anpassungStuDublin>12) anpassungStu = anpassungStu - 12;
                    if(anpassungStu>12) anpassungStu = anpassungStu - 12;
                    if(anpassungStu>12) anpassungStu = anpassungStu - 12;
                    if(anpassungStu>12) anpassungStu = anpassungStu - 12;
                    if(anpassungStu>12) anpassungStu = anpassungStu - 12;

                    System.out.println(anpassungStu);
                    System.out.println(anpassungMin);       //check ob zeiten kommen
                    System.out.println(anpassungSek);

                                                    //HIER war FEHLER
                    anpassungMin=anpassungMin*60+anpassungSek;
                    anpassungStu=anpassungStu*60*60+anpassungMin;

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









