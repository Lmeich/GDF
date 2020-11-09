/**
 * Ibarra Chavez Luis Mario Emmanuel
 */
public class RaizCuadrada extends Operacion{
    
    private double raiz;
    
    public RaizCuadrada(double n) {      
        super(n, '√');
        double x = 1.0;
        for(int i =0; i<10; i++){
            x = (x + n/x) / 2;
        }
        this.raiz = x;
        //this.raiz = (double) Math.sqrt(n);
        this.setResultado(this.raiz);
    }
    
    public RaizCuadrada(double indice, double radicando) {      
        super(radicando,indice, '√');
        int j = 1;
        double aux;
        double res;
        double r=0;
        do{
            do{
                r = r + 0.1f;
                aux = r * r;
            j++;
            }while( j <= indice-j);
            res = aux;
        }while( radicando >= res);
        this.raiz = res;
        this.setResultado(this.raiz);
    }
}
