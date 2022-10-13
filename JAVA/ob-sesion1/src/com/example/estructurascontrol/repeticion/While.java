package com.example.estructurascontrol.repeticion;

/**
 * Crear un bucle que permita concatenar textos y imprima el resultado final por consola.
 * concatenar nombres
 * los textos pueden venir de un array String
 *
 */

public class While {

    public static void main(String[] args) {

        int contador = 0;

        while(contador < 10){// bucle infinito
            contador++;
            if (contador == 5){ // Condicion de Ruptura o continuar el bucle
                //break;
                continue;
            }

            System.out.println("Valor de contador " + contador);

        }
        // Variable nombre está fuera del ámbito del que se creo
        //System.out.println(nombre);
    }
}
