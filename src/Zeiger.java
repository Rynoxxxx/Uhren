import GLOOP.*;

public class Zeiger{
    GLZylinder zeiger;
    public void Zeiger(double pX, double pY, double laenge) {
        zeiger = new GLZylinder(pX, pY+laenge/2, 0,2,laenge);
        zeiger.drehe(90,0,0);
        zeiger.skaliere(0.5);
    }
    public void weiter(){

    }

}
