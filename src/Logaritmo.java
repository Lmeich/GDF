public class Logaritmo extends Operacion {
    
    double logaritmo;

    public Logaritmo(double n) {
        super(n, '└');
        this.logaritmo = (double) Math.log(n);
        this.setResultado(this.logaritmo);
    }
}
