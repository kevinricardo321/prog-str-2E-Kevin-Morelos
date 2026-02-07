import java.util.Scanner;

/**
 * Clase principal con menú para operaciones básicas:
 * IMC, área de rectángulo, área de círculo y conversión °C a °F.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("===== Menú =====");
            System.out.println("1. Calcular IMC");
            System.out.println("2. Calcular área de un rectángulo");
            System.out.println("3. Convertir °C a °F");
            System.out.println("4. Calcular área de un círculo");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");

            // leer opción
            while (!scanner.hasNextInt()) {
                System.out.print("Entrada inválida. Ingresa un número entero: ");
                scanner.next(); // descarta lo que escribió
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar salto de línea

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa tu peso en kg: ");
                    double peso = leerDouble(scanner);
                    System.out.print("Ingresa tu altura en metros: ");
                    double altura = leerDouble(scanner);
                    System.out.println("Tu IMC es: " + calcularIMC(peso, altura));
                    break;

                case 2:
                    System.out.print("Ingresa la base: ");
                    double base = leerDouble(scanner);
                    System.out.print("Ingresa la altura: ");
                    double alt = leerDouble(scanner);
                    System.out.println("Área del rectángulo: " + areaRectangulo(base, alt));
                    break;

                case 3:
                    System.out.print("Ingresa la temperatura en °C: ");
                    double celsius = leerDouble(scanner);
                    System.out.println("Equivale a °F: " + celsiusAFahrenheit(celsius));
                    break;

                case 4:
                    System.out.print("Ingresa el radio: ");
                    double radio = leerDouble(scanner);
                    System.out.println("Área del círculo: " + areaCirculo(radio));
                    break;

                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

            System.out.println();

        } while (opcion != 5);

        scanner.close();
    }

    // Métodos con Javadoc

    /**
     * Calcula el Índice de Masa Corporal (IMC).
     * @param pesoKg peso en kilogramos
     * @param alturaM altura en metros
     * @return IMC calculado
     */
    public static double calcularIMC(double pesoKg, double alturaM) {
        return pesoKg / (alturaM * alturaM);
    }

    /**
     * Calcula el área de un rectángulo.
     * @param base longitud de la base
     * @param altura longitud de la altura
     * @return área del rectángulo
     */
    public static double areaRectangulo(double base, double altura) {
        return base * altura;
    }

    /**
     * Convierte grados Celsius a Fahrenheit.
     * @param celsius temperatura en °C
     * @return temperatura en °F
     */
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 1.8) + 32;
    }

    /**
     * Calcula el área de un círculo.
     * @param radio radio del círculo
     * @return área del círculo
     */
    public static double areaCirculo(double radio) {
        return Math.PI * radio * radio;
    }

    /**
     * Lee un número double de forma segura.
     * @param scanner instancia de Scanner
     * @return número double válido
     */
    public static double leerDouble(Scanner scanner) {
        while (!scanner.hasNextDouble()) {
            System.out.print("Entrada inválida. Ingresaun número: ");
            scanner.next(); // descarta lo que escribió
             }
            double valor = scanner.nextDouble();
             scanner.nextLine();
             // limpiar salto de línea
             return valor;
             }
}
