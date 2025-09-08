import java.util.Scanner;

public class MenuMetodos {

    // -------- 1. static void sin retorno y sin parámetros --------
    public static void saludar() {
        System.out.println("¡Hola, bienvenido al aula de clase!");
    }

    public static void mostrarFechaHoy() {
        System.out.println("Hoy es un gran día para hacer ejercicio.");
    }

    // -------- 2. static void sin retorno y con parámetros --------
    public static void imprimirTabla(int numero) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public static void mostrarNombre(String nombre) {
        System.out.println("Tu nombre es: " + nombre);
    }

    // -------- 3. static con retorno y sin parámetros --------
    public static int obtenerNumeroSecreto() {
        return 89; // ejemplo con número fijo
    }

    public static String obtenerFraseMotivacional() {
        return "¡Nunca te rindas1!";
    }

    // -------- 4. static con retorno y con parámetros --------
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    // -------- Programa principal con menú --------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE MÉTODOS EN JAVA ---");
            System.out.println("1. Métodos void sin parámetros");
            System.out.println("2. Métodos void con parámetros");
            System.out.println("3. Métodos con retorno sin parámetros");
            System.out.println("4. Métodos con retorno con parámetros");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nEjemplo 1: ");
                    saludar();
                    System.out.println("Ejemplo 2: ");
                    mostrarFechaHoy();
                    break;
                case 2:
                    System.out.print("\nIngresa un número para la tabla: ");
                    int num = sc.nextInt();
                    imprimirTabla(num);

                    System.out.print("Ingresa tu nombre: ");
                    sc.nextLine(); // limpiar buffer
                    String nombre = sc.nextLine();
                    mostrarNombre(nombre);
                    break;
                case 3:
                    System.out.println("\nEjemplo 1: ");
                    int secreto = obtenerNumeroSecreto();
                    System.out.println("El número secreto es: " + secreto);

                    System.out.println("Ejemplo 2: ");
                    String frase = obtenerFraseMotivacional();
                    System.out.println(frase);
                    break;
                case 4:
                    System.out.print("\nIngresa el primer número: ");
                    int a = sc.nextInt();
                    System.out.print("Ingresa el segundo número: ");
                    int b = sc.nextInt();
                    System.out.println("La suma es: " + sumar(a, b));

                    System.out.print("Ingresa tres notas: ");
                    double n1 = sc.nextDouble();
                    double n2 = sc.nextDouble();
                    double n3 = sc.nextDouble();
                    System.out.println("El promedio es: " + calcularPromedio(n1, n2, n3));
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (opcion != 0);

        sc.close();
    }
}