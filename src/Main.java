import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<LIBRO> biblioteca = new ArrayList<>();
        int opcion;
        while (true) {
            System.out.println("=== SISTEMA DE BIBLIOTECA ===");
            System.out.println("1. Registrar libro físico");
            System.out.println("2. Registrar libro digital");
            System.out.println("3. Ver todos los libros");
            System.out.println("4. Buscar libro");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();
            if (opcion == 5) break;
            switch (opcion) {
                case 1 -> {
                    System.out.print("Título: ");
                    String t = sc.nextLine();
                    System.out.print("Autor: ");
                    String a = sc.nextLine();
                    System.out.print("Precio: ");
                    double p = sc.nextDouble();
                    System.out.print("Ejemplares: ");
                    int e = sc.nextInt();
                    System.out.print("Peso (kg): ");
                    double peso = sc.nextDouble();
                    biblioteca.add(new LIBROIMPRESO(t, a, p, e, peso));
                    System.out.println("Registrado.");
                }
                case 2 -> {
                    System.out.print("Título: ");
                    String t = sc.nextLine();
                    System.out.print("Autor: ");
                    String a = sc.nextLine();
                    System.out.print("Precio: ");
                    double p = sc.nextDouble();
                    System.out.print("Licencias: ");
                    int e = sc.nextInt();
                    System.out.print("Tamaño (MB): ");
                    double tam = sc.nextDouble();
                    biblioteca.add(new LIBRODIGITAL(t, a, p, e, tam));
                    System.out.println("Registrado.");
                }
                case 3 -> {
                    if (biblioteca.isEmpty()) System.out.println("Sin registros.");
                    else biblioteca.forEach(LIBRO::mostrarLibro);
                }
                case 4 -> {
                    System.out.print("Título a buscar: ");
                    String b = sc.nextLine();
                    LIBRO encontrado = null;
                    for (LIBRO l : biblioteca) {
                        if (l.getTitulo().equalsIgnoreCase(b)) {
                            encontrado = l;
                            break;
                        }
                    }
                    if (encontrado == null) System.out.println("No existe.");

                }
            }
        }
    }

}