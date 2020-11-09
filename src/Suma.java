/**
 * Ibarra Chavez Luis Mario Emmanuel
 */
public class Suma extends Operacion {
    double suma;
    double sumax;
    double sumay;
       
    public Suma(double n, double n1) {      
        super(n, n1, '+');
        this.suma = n + n1;
        this.setResultado(this.suma);
    }

    public Suma(double n,double n1,double n2,double n3){
        super(n, n1, n2, n3, '+');
        this.sumax = n + n2;
        this.sumay = n1 + n3;
        this.setResultadox(this.sumax);
        this.setResultadoy(this.sumay); 
    }

}
