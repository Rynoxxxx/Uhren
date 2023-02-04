public class Uhr{
    private Ziffernblatt dasZiffernblatt;
    private Sekundenzeiger sekunden;
    private Minutenzeiger minuten;
    private Stundenzeiger stunden;


    public Uhr(double pX, double pY){
        dasZiffernblatt = new Ziffernblatt(pX,pY);
        sekunden = new Sekundenzeiger(pX,pY);
        minuten = new Minutenzeiger(pX,pY);
        stunden = new Stundenzeiger(pX,pY);

    }
    public void weiter(){
        sekunden.sekDrehe();
        minuten.minDrehe();
        stunden.stuDrehe();
    }
}
