import java.util.Scanner;

public class GATO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe una cadena de 9 caracteres: X, O o espacio ");
        String cadena = scanner.nextLine().toUpperCase();

        if (cadena.length() != 9) {
            System.out.println("La cadena debe tener exactamente 9 caracteres.");
            return;
        }

        System.out.println(" --------- ");
        System.out.println(" | " + cadena.charAt(0) + " " + cadena.charAt(1)+ " " + cadena.charAt(2) + " | ") ;
        System.out.println(" | " + cadena.charAt(3) + " " + cadena.charAt(4)+ " " + cadena.charAt(5) + " | ") ;
        System.out.println(" | " + cadena.charAt(6) + " " + cadena.charAt(7)+ " " + cadena.charAt(8) + " | ") ;
        System.out.println(" --------- ");
    }



}

