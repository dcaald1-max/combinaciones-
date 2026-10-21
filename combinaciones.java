import java.util.Scanner;
public class combinaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de n (número total de elementos): ");
        int n = scanner.nextInt();
        System.out.println("Ingrese el valor de r (número de elementos a seleccionar): ");
        int r = scanner.nextInt();

        if (n < 0 || r < 0 || r > n) {
            System.out.println("Valores inválidos: debe cumplirse n >= 0 y 0 <= r <= n.");
            scanner.close();
            return;
        }

        int combinaciones = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("El número de combinaciones de " + n + " elementos tomados de " + r + " en " + r + " es: " + combinaciones);
        scanner.close();
    }
     public static int factorial(int n) {
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
