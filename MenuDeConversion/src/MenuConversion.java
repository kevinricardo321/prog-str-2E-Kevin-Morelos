import java.util.Scanner;

public class MenuConversion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion = 0;
        int total = 0;
        int CaF = 0;
        int FaC = 0;
        int KmaM = 0;
        int MaKm = 0;

        do {
            System.out.println("MENU");
            System.out.println("1) °C a °F");
            System.out.println("2) °F a °C");
            System.out.println("3) Km a Millas");
            System.out.println("4) Millas a Km");
            System.out.println("5) Salir");
            System.out.print("Opcion: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
            } else {
                System.out.println("Error: ingresa un numero");
                scanner.next();
                return;
            }

            if (opcion < 1 || opcion > 5) {
                System.out.println("Opcion invalida");
                return;
            }

            if (opcion == 5) {
                break;
            }

            System.out.print("Ingresa el valor: ");

            if (!scanner.hasNextDouble()) {
                System.out.println("Error: ingresa un numero valido");
                scanner.next();
                return;
            }

            double valor = scanner.nextDouble();

            if (opcion == 1) {
                System.out.println("Resultado: " + ((valor * 9 / 5) + 32)+"F");
                CaF++;
            } else if (opcion == 2) {
                System.out.println("Resultado: " + ((valor - 32) * 5 / 9)+"C");
                FaC++;
            } else if (opcion == 3) {
                System.out.println("Resultado: " + (valor * 0.621371)+"M");
                KmaM++;
            } else if (opcion == 4) {
                System.out.println("Resultado: " + (valor / 0.621371)+"Km");
                MaKm++;
            }

            total++;

        } while (opcion != 5);

        System.out.println("\nRESUMEN");
        System.out.println("Total conversiones: " + total);
        System.out.println("°C a °F: " + CaF);
        System.out.println("°F a °C: " + FaC);
        System.out.println("Km a Millas: " + KmaM);
        System.out.println("Millas a Km: " + MaKm);

        scanner.close();
    }
}
