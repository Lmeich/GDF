/**
 * Ibarra Chavez Luis Mario Emmanuel
 */
public class Multiplicacion extends Operacion {
    
    double multiplicacion;
    double multiplicacionx;
    double multiplicaciony;
       
    public Multiplicacion(double n, double n1) {      
        super(n, n1, '*');
        this.multiplicacion = n * n1;
        this.setResultado(this.multiplicacion);
    }

    public Multiplicacion(double n,double n1,double n2,double n3){
        super(n, n1, n2, n3, '*');
        this.multiplicacionx = n * n2;
        this.multiplicaciony = n1 * n3;
        this.setResultadox(this.multiplicacionx);
        this.setResultadoy(this.multiplicaciony); 
    }
    
}
