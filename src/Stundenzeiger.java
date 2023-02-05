import GLOOP.GLZylinder;

public class Stundenzeiger {
    GLZylinder zeiger;

    double StuZeigerPosX;
    double StuZeigerPosY;
    public Stundenzeiger(double pX, double pY) {
        zeiger = new GLZylinder(pX, pY+110/2, 0,5,110);
        zeiger.drehe(90,0,0);
        //zeiger.skaliere(0.5);
        zeiger.setzeFarbe(0,0,0);
        StuZeigerPosX = pX;
        StuZeigerPosY = pY;
    }
    public void stuDrehe(){
        zeiger.drehe(0,0,-0.0083,StuZeigerPosX,StuZeigerPosY,0);//-0.0083
    }

}
