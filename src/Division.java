/**
 * Ibarra Chavez Luis Mario Emmanuel
 */
public class Division extends Operacion{
    double division;
    double divisionx;
    double divisiony;
       
    public Division(double n, double n1) {      
        super(n, n1, '/');
        this.division = n / n1;
        this.setResultado(this.division);
    }

    public Division(double n,double n1,double n2,double n3){
        super(n, n1, n2, n3, '/');
        if (n1 == 0 || n3 == 0){
            System.out.println("No se puede dividir entre 0");
        } else {
        this.divisionx = n / n2;
        this.divisiony = n1 / n3;
        this.setResultadox(this.divisionx);
        this.setResultadoy(this.divisiony); 
        }
    }
}
