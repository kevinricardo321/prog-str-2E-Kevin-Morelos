import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroIngresado = leerNumero(entrada);
        int sumaFinal = obtenerSuma(numeroIngresado);

        imprimirSuma(sumaFinal);

        entrada.close();
    }

    public static int leerNumero(Scanner entrada) {
        System.out.println("Digite un número para calcular la suma:");
        return entrada.nextInt();
    }

    public static int obtenerSuma(int numero) {
        int resultado = 0;

        for (int i = 1; i <= numero; i++) {
            resultado = resultado + i;
        }

        return resultado;
    }

    public static void imprimirSuma(int suma) {
        System.out.println("El resultado total es: " + suma);
    }
}