import GLOOP.GLZylinder;

public class Minutenzeiger {
    GLZylinder zeiger;

    double MinZeigerPosX;
    double MinZeigerPosY;
    public Minutenzeiger(double pX, double pY) {
        zeiger = new GLZylinder(pX, pY+180/2, 0,3,180);
        zeiger.drehe(90,0,0);
        //zeiger.skaliere(0.5);
        MinZeigerPosX = pX;
        MinZeigerPosY = pY;
    }
    public void minDrehe(){
        zeiger.drehe(0,0,-0.1,MinZeigerPosX,MinZeigerPosY,0);//-0.1
    }

}
