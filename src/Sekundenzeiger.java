import GLOOP.*;

public class Sekundenzeiger {
    GLZylinder zeiger;

    double SekZeigerPosX;
    double SekZeigerPosY;



    public Sekundenzeiger(double pX, double pY) {
        zeiger = new GLZylinder(pX, pY+180/2, 0,1.5,180);
        zeiger.drehe(90,0,0);
        //zeiger.drehe(0,0,SekZeigerDrehung,pX,pY,0);
        SekZeigerPosX = pX;
        SekZeigerPosY = pY;
    }
    public void sekDrehe(){
        zeiger.drehe(0,0,-6,SekZeigerPosX,SekZeigerPosY,0);
    }

}
