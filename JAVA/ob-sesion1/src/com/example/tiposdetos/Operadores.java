package com.example.tiposdetos;

public class Operadores {

    public static void main(String[] args) {

        // aritmeticos:

        int numero1 = 10;
        int numero2 = 20;

        int resultado = numero1 + numero2;

        System.out.println(resultado + 4.8);

        /*
        comparación;
        > mayor que
        < menor que
        >= mayor igual que
        <= menor igual que
        == igual que
        === IMPORTANTE: EM JAVA NO EXISTE!!
         */

        boolean resultado1 = numero1 > numero2; // false
        System.out.println(resultado1);

        boolean resultado2 = numero1 < numero2; // true
        System.out.println(resultado2);

        /*

        Lógicos
        and &&
        or ||
         */

        boolean resultado3 = numero1 > 5 && numero2 < 30;

        int edad = 17;
        boolean carnetJoven = edad >= 15 && edad <= 26;

        /*
        incremento ++
        decremento --
         */



    }
}
