/**
 * Ibarra Chavez Luis Mario Emmanuel
 *  Desc: Graficadora de funciones matematicas...
 */
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
         
        
        double n = 17.0;
        double n1 = 10.0;
        double n2 = 10.0;
        double n3 = 7.0;

        Division nuevaResta1D = new Division(n,n1);
        nuevaResta1D.mostrarResultado1D();

        Division nuevaResta2D = new Division(n,n1,n2,n3);
        nuevaResta2D.mostrarResultado2D();

        Potencia elevarPotencia = new Potencia(5, 2);
        elevarPotencia.mostrarPotencia();

        RaizCuadrada nuevRaizCuadrada = new RaizCuadrada(9);
        nuevRaizCuadrada.mostrarRaizCuadrada();

        RaizCuadrada nuevRaiz = new RaizCuadrada(3,64);
        nuevRaiz.mostrarRaizCuadrada();

    }
}
