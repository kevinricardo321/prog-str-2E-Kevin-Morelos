public class GradeService {

    //metodos para calcular la calificacion
    public double calcularPromedio(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public double calcularFinal(double promedio, int asistencia) {
        return (promedio * 0.7) + (asistencia * 0.3);
    }

    public String determinarEstado(double finalCal, int asistencia, boolean entregoProyecto) {

        //determina si aprueba o no
        if (asistencia < 80) {
            return "Reprobado por asistencia";
        }

        if (entregoProyecto == false) {
            return "Reprobado por proyecto";
        }

        if (finalCal >= 70) {
            return "Aprobado";
        }

        return "Reprobado por calificacion";
    }
}
