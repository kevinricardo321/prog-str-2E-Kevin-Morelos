import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        //solicitar y leer datos del estudiante
        Scanner sc = new Scanner(System.in);
        GradeService gs = new GradeService();

        System.out.print("Nombre del alumno: ");
        String nombre = sc.nextLine();

        System.out.print("Parcial 1: ");
        double p1 = sc.nextDouble();

        System.out.print("Parcial 2: ");
        double p2 = sc.nextDouble();

        System.out.print("Parcial 3: ");
        double p3 = sc.nextDouble();

        System.out.print("Asistencia (%): ");
        int asistencia = sc.nextInt();

        System.out.print("Entrego proyecto (true/false): ");
        boolean entregoProyecto = sc.nextBoolean();


        double promedio = gs.calcularPromedio(p1, p2, p3);
        double finalCal = gs.calcularFinal(promedio, asistencia);
        String estado = gs.determinarEstado(finalCal, asistencia, entregoProyecto);

        //imprime el reporte final en la pantalla
        System.out.println("\n-- Reporte Final --");
        System.out.println("Alumno: " + nombre);
        System.out.println("Parciales: " + p1 + ", " + p2 + ", " + p3);
        System.out.println("Promedio: " + promedio);
        System.out.println("Asistencia: " + asistencia);
        System.out.println("Entrego proyecto: " + entregoProyecto);
        System.out.println("Final: " + finalCal);
        System.out.println("Estado: " + estado);

        sc.close();
    }
}