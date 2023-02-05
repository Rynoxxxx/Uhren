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
    public void weiterStu(){// stundenzeiger auf aktuelle Uhrzeit

        stunden.stuDrehe();
    }
    public void weiterMin(){// minutenzeiger auf aktuelle Uhrzeit

        minuten.minDrehe();
    }
    public void weiterSek(){// sekundenzeiger auf aktuelle Uhrzeit

        sekunden.sekDrehe();
    }

}
