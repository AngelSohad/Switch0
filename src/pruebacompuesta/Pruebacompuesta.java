package pruebacompuesta;
import java.util.Scanner;

/**
 * @author ASAG
 *
 */

public class Pruebacompuesta {

    public void CompSw() {
        int nota;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca calificación (1 - 10), pulse Intro:");
        nota = entrada.nextInt();
        switch (nota) {
            case 10:
                System.out.println("Perfect.");
                break;
            case 9:
                System.out.println("Excelente.");
                break;
            case 8:
            case 7:
                System.out.println("Notable.");
                break;
            case 6:
                System.out.println("Aprobado.");
            case 5:
                System.out.println("Reprobado.");
                break;
            case 4:
                System.out.println("Echale ganas.");
                break;
            case 3:
            case 2:
            case 1:
                System.out.println("Ya no la armaste.");
                break;
            case 0:
                System.out.println("Suspendido.");
                break;
            default:
                System.out.println("no es posible esta nota.");
        }
        System.out.println("Final de programa.");
    }
     public static void main(String[] args) {
        Pruebacompuesta aprob = new Pruebacompuesta();
        aprob.CompSw();}
}
