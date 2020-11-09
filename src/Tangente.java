public class Tangente extends Operacion{

    double tan;
    public Tangente (double n){
        super(n,"tan");
        this.tan=Math.tan(n);
        this.setResultado(this.tan);
    }
    
}
