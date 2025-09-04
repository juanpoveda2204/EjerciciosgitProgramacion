import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
Scanner teclado =new Scanner(System.in);
int n1, n2, suma;
        System.out.println("Digite primer valor");
        n1=teclado.nextInt();
        System.out.println("Digite segundo valor");
        n2=teclado.nextInt();
        suma=n1+n2;
        System.out.println("la suma es: "+suma);




        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            int numero = random.nextInt(1200) + 1;
            System.out.println("Número " + (i + 1) + ": " + numero);
            suma+= numero;
                }

                System.out.println("La suma de los 100 números es: " + suma);


    }
}



