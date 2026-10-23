import java.util.Scanner;

public class par2 {
    // Método para calcular el factorial de un número
    public static long factorial(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos.");
        }

        long resultado = 1;
        for (int i = 2; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Método para calcular las combinaciones C(n, r)
    public static long calcularCombinacion(int n, int r) {
        if (r < 0 || n < 0 || r > n) {
            throw new IllegalArgumentException("Valores inválidos: debe cumplirse n >= 0 y 0 <= r <= n.");
        }

        long factN = factorial(n);
        long factR = factorial(r);
        long factNR = factorial(n - r);

        return factN / (factR * factNR);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese n: ");
        int n = scanner.nextInt();

        System.out.print("Ingrese r: ");
        int r = scanner.nextInt();

        try {
            long combinaciones = calcularCombinacion(n, r);
            System.out.println("Las combinaciones de " + n + " en " + r + " es: " + combinaciones);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


