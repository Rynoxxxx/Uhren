import GLOOP.*;
public class Wand {
GLQuader wand;
public void Wand(int pX,int pY, int pZ){
    wand = new GLQuader(pX,pY,pZ,100,70,10);
    wand.setzeFarbe(0,0,1);

}


}
