public class Coseno extends Operacion {
    double cos;
    public Coseno (double n){
        super(n,"cos");
        this.cos=Math.cos(n);
        this.setResultado(this.cos);
    }
    
}
