import GLOOP.*;
import java.util.Calendar;

import static java.lang.Math.abs;

public class Uhrenszene {
    private GLTastatur tastatur;
    private Uhr uhr1, uhr2, uhr3, uhr4, uhr5, uhr6;

    private GLTafel datum;
    int anpassungStu, anpassungMin, anpassungSek, anpassungDatum, anpassungStuDublin;

    int anpassungStuSydney, anpassungStuSeoul, anpassungStuHonolulu, anpassungStuAbuDhabi;
    public void Uhrenszene() {
        GLEntwicklerkamera kamera = new GLEntwicklerkamera();
        GLLicht licht = new GLLicht(100, 250, 400);
        tastatur = new GLTastatur();
        kamera.setzePosition(0, 250, 2000);
        Wand wand = new Wand();
        wand.Wand(0, 0, -10);
        Calendar Datum = Calendar.getInstance();
        anpassungDatum = (Datum.get(Calendar.DATE));
        uhr1 = new Uhr(0, 0,"src/uhr3.png","Berlin",anpassungDatum);
        uhr2 = new Uhr(0,500,"src/uhr1.png","Dublin",anpassungDatum);
        uhr3 = new Uhr(500,500,"src/uhr6.png","Sydney",anpassungDatum);
        uhr4 = new Uhr(500,0.,"src/uhr5.png","Seoul",anpassungDatum);
        uhr5 = new Uhr(-500,500,"src/uhr4.png","Honolulu",anpassungDatum);
        uhr6 = new Uhr(-500,0,"src/uhr2.png","Abu Dhabi",anpassungDatum);

        Zeitanpassung();

    }
        //zeitanpassung der Uhren

            public void Zeitanpassung(){
                    Calendar jetzt = Calendar.getInstance();

                    //Calendar heute = Calendar.getInstance();
                    anpassungStu = (jetzt.get(Calendar.HOUR_OF_DAY));// passt die Stunde an
                    anpassungMin = (jetzt.get(Calendar.MINUTE));// passt die minute an
                    anpassungSek = (jetzt.get(Calendar.SECOND))+4;// passt die sekunde an


                    //datum.setzeText(String.valueOf(anpassungDatum),25); //datum

                    //------NEU--------
                    anpassungStuDublin = (jetzt.get(Calendar.HOUR_OF_DAY));           //
                    anpassungStuSydney = (jetzt.get(Calendar.HOUR_OF_DAY));          //
                    anpassungStuSeoul = (jetzt.get(Calendar.HOUR_OF_DAY));            //-Stunden von Uhren
                    anpassungStuHonolulu = (jetzt.get(Calendar.HOUR_OF_DAY));        //
                    anpassungStuAbuDhabi = (jetzt.get(Calendar.HOUR_OF_DAY));           //
                    //------NEU--------

                    if(anpassungStu>12) anpassungStu = anpassungStu - 12;      //-12 wegen 12 strichen auf ziffernblatt

                    //------NEU--------
                    if(anpassungStuDublin>12) anpassungStuDublin = anpassungStuDublin - 12;         //
                    if(anpassungStuSydney>12) anpassungStuSydney = anpassungStuSydney - 12;         //
                    if(anpassungStuSeoul>12) anpassungStuSeoul = anpassungStuSeoul - 12;            //
                    if(anpassungStuHonolulu>12) anpassungStuHonolulu = anpassungStuHonolulu - 12;   //
                    if(anpassungStuAbuDhabi>12) anpassungStuAbuDhabi = anpassungStuAbuDhabi - 12;   //

                    anpassungStuDublin=anpassungStuDublin-1;                                        //
                    anpassungStuSydney=anpassungStuSydney+10;                                       //
                    anpassungStuSeoul=anpassungStuSeoul+8;                                          //
                    anpassungStuHonolulu=anpassungStuHonolulu-11;                                   //
                    anpassungStuAbuDhabi=anpassungStuAbuDhabi+3;                                    //

                    if(anpassungStuDublin<0) anpassungStuDublin=anpassungStuDublin*(-1);                //
                    if(anpassungStuSydney<0) anpassungStuSydney=anpassungStuSydney*(-1);                //
                    if(anpassungStuSeoul<0) anpassungStuSeoul=anpassungStuSeoul*(-1);                   //
                    if(anpassungStuHonolulu<0) anpassungStuHonolulu=anpassungStuHonolulu*(-1);          //
                    if(anpassungStuAbuDhabi<0) anpassungStuAbuDhabi=anpassungStuAbuDhabi*(-1);          //
                    //------NEU--------

                    System.out.println(anpassungStuHonolulu);
                    System.out.println(anpassungMin);       //check ob zeiten kommen
                    System.out.println(anpassungSek);

                    anpassungMin=anpassungMin*60+anpassungSek;
                    anpassungStu=anpassungStu*60*60+anpassungMin;

                    //------NEU--------
                    anpassungStuDublin=anpassungStuDublin*60*60+anpassungMin;      //
                    anpassungStuSydney=anpassungStuSydney*60*60+anpassungMin;      //
                    anpassungStuSeoul=anpassungStuSeoul*60*60+anpassungMin;        //
                    anpassungStuHonolulu=anpassungStuHonolulu*60*60+anpassungMin;  //
                    anpassungStuAbuDhabi=anpassungStuAbuDhabi*60*60+anpassungMin;  //
                    //------NEU--------



                    //uhr1

                    for (int stu = 0; stu < anpassungStu; stu++) {
                        uhr1.weiterStu();
                    }

                    //------NEU-------
                    for (int stuDublin = 0; stuDublin < anpassungStuDublin; stuDublin++) {          //
                        uhr2.weiterStu();                                                           //
                    }                                                                               //
                    for (int stuSydney = 0; stuSydney < anpassungStuSydney; stuSydney++) {          //
                        uhr3.weiterStu();                                                           //
                    }                                                                               //
                    for (int stuSeoul = 0; stuSeoul < anpassungStuSeoul; stuSeoul++) {              //
                        uhr4.weiterStu();                                                           //
                    }                                                                               //
                    for (int stuHonolulu = 0; stuHonolulu < anpassungStuHonolulu; stuHonolulu++) {  //
                        uhr5.weiterStu();                                                           //
                    }                                                                               //
                    for (int stuAbuDhabi = 0; stuAbuDhabi < anpassungStuAbuDhabi; stuAbuDhabi++) {  //
                        uhr6.weiterStu();                                                           //
                    }                                                                               //
                    //------NEU-------

                    for (int min = 0; min < anpassungMin; min++) {
                        uhr1.weiterMin();
                        uhr2.weiterMin();
                        uhr3.weiterMin();
                        uhr4.weiterMin();
                        uhr5.weiterMin();
                        uhr6.weiterMin();
                    }
                    for (int sek = 0; sek < anpassungSek; sek++) {
                        uhr1.weiterSek();
                        uhr2.weiterSek();
                        uhr3.weiterSek();
                        uhr4.weiterSek();
                        uhr5.weiterSek();
                        uhr6.weiterSek();
                    }


                    //uhr2




                    while(!tastatur.esc()) {
                        uhr1.weiterStu();
                        uhr1.weiterMin();
                        uhr1.weiterSek();
                        uhr2.weiterStu();
                        uhr2.weiterMin();
                        uhr2.weiterSek();
                        uhr3.weiterStu();
                        uhr3.weiterMin();
                        uhr3.weiterSek();
                        uhr4.weiterStu();
                        uhr4.weiterMin();
                        uhr4.weiterSek();
                        uhr5.weiterStu();
                        uhr5.weiterMin();
                        uhr5.weiterSek();
                        uhr6.weiterStu();
                        uhr6.weiterMin();
                        uhr6.weiterSek();
                        Sys.warte(1000);
                    }

    }
}









