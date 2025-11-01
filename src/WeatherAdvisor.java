import java.util.Scanner;

public class WeatherAdvisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el rango al usuario
        System.out.print("Ingrese el número inicial del rango: ");
        int inicio = scanner.nextInt();

        System.out.print("Ingrese el número final del rango: ");
        int fin = scanner.nextInt();

        System.out.println("\n--- Resultado FizzBuzz mejorado ---");

        // Bucle principal
        for (int i = inicio; i <= fin; i++) {
            // Caso para múltiplos de 3, 5 y 7
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.println("FizzBuzzBoom");
            }
            // Caso múltiplos de 3 y 5
            else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Caso múltiplos de 3 y 7
            else if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("FizzBoom");
            }
            // Caso múltiplos de 5 y 7
            else if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("BuzzBoom");
            }
            // Caso múltiplos de 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Caso múltiplos de 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Caso múltiplos de 7
            else if (i % 7 == 0) {
                System.out.println("Boom");
            }
            // En los demás casos, imprime el número
            else {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
