package Open;

public class WhileLoop {

    public static void main(String[] args) {

        int count = 0;

        while(count < 10){
            count++; // condicion
            if(count == 6)
                break; // rompe el flujo de ejecucion
                // continue continua con los procesos

            System.out.println("Hola Mundo " + count);


        }
        System.out.println("fin");
    }
}
