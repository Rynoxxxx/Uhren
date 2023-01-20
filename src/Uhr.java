import GLOOP.*;
public class Uhr{
    private Ziffernblatt dasZiffernblatt;    
    private Zeiger sekunden, minuten, stunden;
    //[...]

    public Uhr(double pX, double pY){
        dasZiffernblatt = new Ziffernblatt(pX,pY);         
        //[...]
    }

    public void weiter(){
        //[...]        
    }   
}
