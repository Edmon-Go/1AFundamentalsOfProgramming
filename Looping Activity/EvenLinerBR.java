public class EvenLinerBR {
    public static void main(String[] args) {

        for ( int i = 1; i <= 100; i++) {
            if ( i % 2 == 0 ) {
                System.out.print(i);

                if ( i < 100 ) {
                    System.out.print(", ");
                }

                if ( i % 20 == 0) {
                    System.out.println();
                }
            }
        }
    }
}