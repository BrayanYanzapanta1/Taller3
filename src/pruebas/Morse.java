/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.Scanner;

/**
 *
 * @author bymoxb
 */
public class Morse {

    public static String morse(char c) {
        switch (c) {
            case 'A':
                return "· —";
            case 'B':
                return "— · · ·";
            case 'C':
                return "— · — ·";
            case 'D':
                return "— · ·";
            case 'E':
                return "·";
            case 'F':
                return "· · — ·";
            case 'G':
                return "— — ·";
            case 'H':
                return "· · · ·";
            case 'I':
                return "· ·";
            case 'J':
                return "· — — —";
            case 'K':
                return "— · —";
            case 'L':
                return "· — · ·";
            case 'M':
                return "— —";
            case 'N':
                return "— ·";
            case 'O':
                return "— — —";
            case 'P':
                return "· — — ·";
            case 'Q':
                return "— — · —";
            case 'R':
                return "· — ·";
            case 'S':
                return "· · ·";
            case 'T':
                return "—";
            case 'U':
                return "· · —";
            case 'V':
                return "· · · —";
            case 'W':
                return "· — —";
            case 'X':
                return "— · · —";
            case 'Y':
                return "— · — —";
            case 'Z':
                return "— — · ·";
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;
        boolean error = false;

        do {
            System.out.print("Cadena: ");
            palabra = sc.nextLine();
        } while (palabra.length() == 0);

        String acum = "";

        for (int i = 0; i < palabra.length(); i++) {
            if (morse(palabra.toUpperCase().charAt(i)) != null) {
                acum += morse(palabra.toUpperCase().charAt(i)) + "   ";
            } else {
                error = true;
                break;
            }
        }

        if (!error) {
            System.out.println("\nMORSE\n");
            System.out.println(acum);
        } else {
            System.out.println("CARACTERES INVALIDOS");
        }

    }
}
