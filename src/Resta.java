/**
 * Ibarra Chavez Luis Mario Emmanuel
 */
public class Resta extends Operacion {

    double resta;
    double restax;
    double restay;
       
    public Resta(double n, double n1) {      
        super(n, n1, '-');
        this.resta = n - n1;
        this.setResultado(this.resta);
    }

    public Resta(double n,double n1,double n2,double n3){
        super(n, n1, n2, n3, '-');
        this.restax = n - n2;
        this.restay = n1 - n3;
        this.setResultadox(this.restax);
        this.setResultadoy(this.restay); 
    }
    
}
