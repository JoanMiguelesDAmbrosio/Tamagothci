import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int saciedad = 6;
    static int energia = 6;
    static int diversion = 6;

    static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        IO.println(String.format("Hola Git!"));


        int accion = menuPrincipal();

        switch (accion) {
            case 1:
                mostrarEstado();
                break;
            case 2:
                if (saciedad >= 10)
                    System.out.println("No tengo hambre.");
                else {
                    saciedad += 3;
                    if (saciedad > 10)
                        saciedad = 10;
                    if (diversion > 0)
                        diversion -= 1;
                }
                mostrarEstado();
                break;
        }
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

    private static void mostrarEstado() {
        if (saciedad <= 0 || energia <= 0 || diversion <= 0){
            System.out.print("" +
                    " (x_x) :( Game Over ):\n" +
                    " /|_|\\\n" +
                    "  | |\n");
        } else if (saciedad <= 4) {
            System.out.print("" +
                    " (•︵•) ¡ Tengo hambre! \uD83C\uDF57\n" +
                    " /|x|\\\n" +
                    "  | |\n");
        } else if (energia <= 4) {
            System.out.print(
                    " (-_-) Zzz\n" +
                    " /|_|\\\n" +
                    "  | |\n");
        } else if (diversion <= 4) {
            System.out.print("" +
                    " (-︵-) Estoy aburrido\n" +
                    " /|_|\\ ¡Juega conmigo!\n" +
                    "  / \\\n");
        } else {
            System.out.print("" +
                    " (•‿•) ¡Estoy feliz!\n" +
                    " /|_|\\\n" +
                    "  | |\n");
        }
    }
}
