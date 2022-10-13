package com.example.estructurascontrol.condicionales;

public class Switch {

    public static void main(String[] args) {

        String dia = "Lunes";

        switch (dia){
            case"Lunes":
                System.out.println("Hoy es Lunes!! Animo");
                break; // Se ocupan en los bucles y switch, para romper el flujo de ejecucion
            case"Martes":
                System.out.println("Hoy es Lunes!! Animo");
                break;
            case "Miercoles":
                System.out.println("Hoy es Miercoles!! Animo");
                break;
            case"Jueves":
                System.out.println("Hoy es Lunes!! Animo");
                break;
            case"Viernes":
                System.out.println("Hoy es Lunes!! Animo");
                break;
            case"Sabado":
                System.out.println("Hoy es Lunes!! Animo");
                break;
            case"Domingo":
                System.out.println("Hoy es Lunes!! Animo");
                break;
            default: // una sentencia para indicar o imprimir algo por defecto sin ser un case
                System.out.println("No es un día valido");
        }

    }
}
