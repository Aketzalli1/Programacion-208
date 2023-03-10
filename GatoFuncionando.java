import java.util.Scanner;
public class GatoFuncionando {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa solo X, O y _ para poder jugar, en total deben de ser 9 caracteres: ");
        String cadena = scanner.nextLine();
        if (cadena.length() != 9) {
            System.out.println("Solo puedes ingresar 9 caracteres");
            return;
        }
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c != 'X' && c != 'O' && c != '_') {
                System.out.println("Lo siento no es posible jugar,solo puedes ingresar la cadena que se te pide, ejecuta denuevo el programa");
                return;
            }
        }
        System.out.println("El juego queda asi: " + cadena);
        System.out.println(" ------------- ");
        System.out.println("| " + cadena.charAt(0) + " | " + cadena.charAt(1) + " | " + cadena.charAt(2) + " |");
        System.out.println(" ------------- ");
        System.out.println("| " + cadena.charAt(3) + " | " + cadena.charAt(4) + " | " + cadena.charAt(5) + " |");
        System.out.println(" ------------- ");
        System.out.println("| " + cadena.charAt(6) + " | " + cadena.charAt(7) + " | " + cadena.charAt(8) + " |");
        System.out.println(" ------------- ");
    }
}

