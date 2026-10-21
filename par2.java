import java.util.Scanner;

    // Método para calcular el factorial de un número
    public static long factorial(int num) {

        long resultado = 1;
        for (int i = 2; i <= num; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Método para calcular las combinaciones C(n, r)
    public static long calcularCombinacion(int n, int r) {
        if (r > n) {
            return 0; // No se pueden elegir más elementos de los que hay
        }
        long factN = factorial(n);
        
        long factR = factorial(r);
        long factNR = factorial(n - r);

        return factN / (factR * factNR);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Total de elementos
        int r = scanner.nextInt(); // Elementos a elegir

        long combinaciones = calcularCombinacion(n, r);
        System.out.println("Las combinaciones de " + n + " en " + r + " es: " + combinaciones);
           scanner.close();
    }
 

