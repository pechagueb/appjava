import java.util.Scanner;

public class SentenciaSwitch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número del mes: ");
        int mes = sc.nextInt();

        String nombreMes;

        switch (mes) {
            case 1:
                nombreMes = "Enero";
                break; // Sale del switch
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            default:
                nombreMes = "Después de junio";

        }
        System.out.println("El mes es:" + nombreMes);

    }
}
