import GLOOP.*;
public class Ziffernblatt{
    private GLZylinder rueckwand,narbe;
    private GLTorus umrandung;

    public Ziffernblatt(double pX, double pY){        
        rueckwand = new GLZylinder(pX,pY,-5, 210,5,"src/Holz.jpg");
        narbe = new GLZylinder (pX,pY,0,10,10);
        umrandung = new GLTorus (pX,pY,0,215,15,"src/Holzboden.jpg");
    }  

}
