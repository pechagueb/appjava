//TIP Para <b>ejecutar</b> el código, pulsar <shortcut actionId="Run"/> o
// Haz clic en el ícono <icon src="AllIcons.Actions.Execute"/> del margen.
public class Main {
    public static void main(String[] args) {
        //TIP Pulsa <shortcut actionId="ShowIntentionActions"/> con tu cursor en el texto resaltado
        // para ver cómo IntelliJ IDEA sugiere corregirlo.
/*
    System.out.printf("Hello and welcome! \n");

    for (int i = 1; i <= 5; i++) {
            //TIP Presione <shortcut actionId="Debug"/> para iniciar la depuración de su código. Hemos creado un punto de interrupción <icon src="AllIcons.Debugger.Db_set_breakpoint"/>
            // para ti, pero siempre puedes añadir más pulsando <shortcut actionId="ToggleLineBreakpoint"/>.
    System.out.println("i = " + i);

        }


 */

        String saludar = "Hola, bienvenido";

        System.out.println(saludar);

        int numero = 11;
        boolean valor = true;

        if (valor){
            System.out.println("El valor de 'número' es:" + numero);
        }

        int numero2 = 25;

        String nombre = "";

        if (numero2 < 26) {

            nombre = "Juan";

        }else{

            nombre = "María";
        }

        System.out.println(nombre);

    }
}