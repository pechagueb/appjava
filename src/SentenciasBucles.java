public class SentenciasBucles {

    public static void main(String[] args) {

        int i;

        bucle:
        for(i = 1; i <= 7; i++){

            int j = 1;

            while ( j <= 8 ) {

                if( i == 6 || i == 7) {

                    System.out.println("Descanso fin de semana");
                    continue bucle;

                }

            }

        }

    }

}
