/**
 * Ibarra Chavez Luis Mario Emmanuel
 */
public class Operacion {


    private double numero;
    private double numero1;
    private double numero2;
    private double numero3;
    private double resultado;
    private double resultadox;
    private double resultadoy;
    private char operacion;

    public Operacion(double n, char operacion) {
        this.numero = n;
        this.operacion = operacion;
    }

    public Operacion(double n, double n1, char operacion) {
        
        this.numero = n;
        this.numero1 = n1;
        this.operacion = operacion;
    }

    public Operacion(double n, double n1,double n2, double n3, char operacion) {
        
        this.numero = n;
        this.numero1 = n1;
        this.numero2 = n2;
        this.numero3 = n3;
        this.operacion = operacion;
    }
    public void mostrarRaizCuadrada(){
        System.out.println("2"+"√"+this.numero+" = "+this.resultado+"\n");
    }

    public void mostrarRaiz(){
        System.out.println(this.numero+"√"+this.numero1+" = "+this.resultado+"\n");
    }

    public void mostrarPotencia(){
        System.out.println(this.numero+"^"+this.numero1+""+" = "+this.resultado+"\n");
    }

    public void mostrarResultado1D(){
        
        System.out.println(this.numero+"x"+","+this.numero1+"y"+"\n"+"-------------------------naj");
        
    }
        
    public void mostrarResultado2D(){
        
        System.out.println(this.numero+"x"+","+this.numero1+"y"+"\n"
        +this.operacion+"\n"+this.numero2+"x"+","+this.numero3+"y"+ "\n"
        +"-------------------------------\n"
        +this.resultadox+"x"+","+this.resultadoy+"y");
        
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero3() {
        return numero3;
    }

    public void setNumero3(double numero3) {
        this.numero3 = numero3;
    }
    

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado =resultado;
    }

    public double getResultadox() {
        return resultadox;
    }

    public void setResultadox(double resultadox) {
        this.resultadox = resultadox;
    }

    public double getResultadoy() {
        return resultadoy;
    }

    public void setResultadoy(double resultadoy) {
        this.resultadoy = resultadoy;
    }

    public char getOperacion() {
        return operacion;
    }

    public void setOperacion(char operacion) {
        this.operacion = operacion;
    }
    
}
