import GLOOP.*;
public class Wand {
GLQuader wand;
public void Wand(int pX,int pY, int pZ){
    wand = new GLQuader(pX,pY,pZ,1000,500,10);
    wand.setzeFarbe(0,1,0);

}


}
