/**
 * Ibarra Chavez Luis Mario Emmanuel
 */
public class Potencia extends Operacion{
   
    private double potencia;

    public Potencia(double n, double n1) {      
        super(n, n1, '^');
        while(n1 > 0){
        this.potencia = n*n;
        n1--;
        }
        this.setResultado(this.potencia);
    }
    
}
