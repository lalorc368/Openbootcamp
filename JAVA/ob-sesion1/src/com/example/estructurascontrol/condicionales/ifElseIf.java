package com.example.estructurascontrol.condicionales;

public class ifElseIf {

    public static void main(String[] args) {


        String dia = "Domingos";

        //Ejemplos de comparacion
        boolean resultadoCompararNum = 5 == 5;
        boolean resultado = dia.equals("Martes"); // Se ocupa equals para comparar Strings

        // if else if

        if (dia.equals("Lunes")) {
            System.out.println("Animo con la semana champions");

        } else if (dia.equals("Martes")) {
            System.out.println("Martes con M de Me besas");

        } else if (dia.equals("Miercoles")) {
            System.out.println("Miercoles ombligo de semana");

        } else if (dia.equals("Jueves")) {
            System.out.println("El viernes chiquito");

        } else if (dia.equals("Viernes")) {
            System.out.println("Por fin Viernes");

        } else if (dia.equals("Sabado")) {
            System.out.println("Descanso");

        } else if (dia.equals("Domingo")) {
            System.out.println("Mañana es Lunes :-(");

        } else {
            System.out.println("EL día introducido no es un día valido");
        }
    }
}
