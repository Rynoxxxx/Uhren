import GLOOP.*;
public class Ziffernblatt{
    private GLZylinder rueckwand,narbe;
    private GLTorus umrandung;
    private GLQuader [] uhrStrich;
    public Ziffernblatt(double pX, double pY){        
        rueckwand = new GLZylinder(pX,pY,-5, 210,5,"src/uhr2.png");
        rueckwand.drehe(0,0,180);
        narbe = new GLZylinder (pX,pY,0,15,10);
        umrandung = new GLTorus (pX,pY,0,215,15,"src/Holzboden.jpg");
        umrandung.setzeSkalierung(1,1,0.5);
        umrandung.setzeTextur("src/silver-shimmery-paper-background.jpg");
        uhrStrich = new GLQuader[12];
        /*for(int i=0;i<uhrStrich.length;i++){
        uhrStrich[i] = new GLQuader(pX,pY+180,0,20,2,10);
        uhrStrich[i].drehe(90,0,90);
        uhrStrich[i].rotiere(360/12*i,0,0,1,pX,pY,0);

        }

         */

    }

}
