import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println(String.format("Hola Git!"));

        menuPrincipal();
    }

    private static int menuPrincipal() {
        Scanner lector = new Scanner(System.in);

        int opcion = -1;

        while (opcion < 0 || opcion > 4) {

            System.out.println("1. Estado");
            System.out.println("2. Comer");
            System.out.println("3. Jugar");
            System.out.println("4. Dormir");
            System.out.println("----------------");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");

            while (!lector.hasNextInt()) {
                lector.next();
                System.out.print("Introduce un número entero: ");
            }

            opcion = lector.nextInt();

            if (opcion < 0 || opcion > 4) {
                System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        }

        return opcion;
    }
}
