package com.example.estructurascontrol.repeticion;

public class ForEach {

    public static void main(String[] args) {

        String [] nombres = {"Pepe", "Juan", "Roberta", "Claudia"};

        for (String nombre : nombres){
            System.out.println(nombre);
        }

        int suma = 0;
        int [] numeros = {5, 10, 15};
        for (int numero : numeros){
            suma += numero;
        }
        System.out.println(suma);
    }
}
