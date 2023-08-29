package Final;
import java.util.ArrayList;
import java.util.Scanner;


public class Trabajo {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean salir = true;

        while (salir) {
            System.out.print("Ingrese un nombre: ");
            String nombre = scanner.nextLine();
            nombres.add(nombre);

            System.out.print("¿Desea agregar otro nombre? (S/N): ");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("N")) {
                salir = false;
            }
        }

        System.out.println("Nombres en la lista:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        System.out.println("Tamaño del ArrayList: " + nombres.size());
    }

}
