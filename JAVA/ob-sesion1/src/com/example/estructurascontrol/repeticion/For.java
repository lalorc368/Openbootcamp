package com.example.estructurascontrol.repeticion;

public class For {

    public static void main(String[] args) {

        // Nos permite repetir un codigo cuantas veces queramos

        for (int i = 0; i < 11; i++){
            System.out.println("El valor de i es: " + i);

        }

        String [] nombres = {"Pepe", "Juan", "Roberta", "Claudia"}; // length 4
        for (int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }
        int suma = 0; // suma que empieza en 0
        int[] numeros = {5, 7, 8}; // array de numeros
        for (int i = 0; i < numeros.length; i++){
            //suma = suma + numeros[i]; //operacion de suma que sume el primer numero, lo guarde y sume el segundo
            suma += numeros[i]; // simplificacion del codigo suma = suma + numeros[i].
        }



    }
}
