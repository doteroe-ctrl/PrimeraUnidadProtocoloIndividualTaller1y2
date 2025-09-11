import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        //creo objeto libro
        Libro libro1 = new Libro("Ready Player Two", "Ernest Clain", 300);

        //creo objeto estudiante
        Estudiante estudiante1 = new Estudiante("Marvin ", 18 , "Primero ");

        //creo objeto cuentabancaria
        CuentaBancaria cuenta1 = new CuentaBancaria(1234 , 1000, "corriente");

        
        System.out.println("Ingrese nombre del libro: ");
        String titulo = scan.next();

        System.out.println("Ingresa nombre del autor: ");
        String autor = scan.next();

        System.out.println("Ingrese el numero de paginas ");
        int numeroPaginas = scan.nextInt();

        Libro libro2 = new Libro(titulo, autor, numeroPaginas);

        System.out.println(libro1);
        System.out.println(estudiante1);
        System.out.println(cuenta1);
        System.out.println(libro2);






    }

}
