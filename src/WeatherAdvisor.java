public class WeatherAdvisor {
    public static void main(String[] args) {
        //  números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            // Verificamos si el número es múltiplo de 3 y 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            // Si solo es múltiplo de 3
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            // Si solo es múltiplo de 5
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            // Si no cumple ninguna condición anterior
            else {
                System.out.println(i);
            }
        }
    }
}
