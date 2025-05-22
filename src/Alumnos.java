import java.util.Scanner;

     //Atributos de la clase//
public class Alumnos {
    private String nombre;
    private int[] calificaciones;

         // Constructor de la clase (nombre y calificaciones)
    public Alumnos(String nombre, int[] calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }
         // Método para calcular el promedio de las calificaciones (sumar las calificaciones para obtener el promedio)
    public double calcularPromedio() {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / calificaciones.length;
    }
         // Método para obtener la calificación final según el promedio
    public char obtenerCalificacionFinal(double promedio) {
        if (promedio <= 50) {
            return 'F';
        } else if (promedio <= 60) {
            return 'E';
        } else if (promedio <= 70) {
            return 'D';
        } else if (promedio <= 80) {
            return 'C';
        } else if (promedio <= 90) {
            return 'B';
        } else {
            return 'A';
        }
    }
         // Método para imprimir los resultados en pantalla (imprimer nombre y calificaciones)
    public void imprimirResultados() {
        double promedio = calcularPromedio();
        char calificacionFinal = obtenerCalificacionFinal(promedio);
        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Calificación " + (i + 1) + ": " + calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacionFinal);
    }
         // Método main para probar la clase
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese Nombre del estudiante: ");
        String nombre = scanner.nextLine();
        //int[] calificaciones = {85, 90, 78, 92, 88};//
        int[] calificaciones = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print(" ingresa calificacion "+(i +1)+": ");
            while(!scanner.hasNextLine()){
                System.out.println("ingrese calificacion valida");
                scanner.next();
            }
            calificaciones[i]= scanner.nextInt();

        }
        Alumnos alumno = new Alumnos(nombre, calificaciones);
        alumno.imprimirResultados();
        scanner.close();


    }
}
