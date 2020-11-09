public class Seno extends Operacion{
    double sen;
    public Seno (double n){
        super(n,"sin");
        this.sen=Math.sin(n);
        this.setResultado(this.sen);
    }
    
}
