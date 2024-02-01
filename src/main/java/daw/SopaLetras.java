/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Random;

/**
 *
 * @author edu
 */
public class SopaLetras {

    public static Random rd = new Random();

    private char[][] sopaLetras;
    private char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
        'L', 'M', 'N', 'Ñ', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    private int aleatorio;

    public SopaLetras(int n) {
        this.sopaLetras = new char[n][n];
        for (int i = 0; i < sopaLetras.length; i++) {
            for (int j = 0; j < sopaLetras[i].length; j++) {
                aleatorio = rd.nextInt(letras.length);
                sopaLetras[i][j] = letras[aleatorio];
            }
        }
    }

    public void colocarPalabraHorizontal(int x, int y, String palabra) {

        char letras[] = new char[palabra.length()];
        int contador = 0;
        System.out.println("Palabra a colocar: " + palabra);
        // Inicializó el char
        for (int i = 0; i < letras.length; i++) {
            letras[i] = palabra.charAt(i);
        }
        // Cambio la posicion
        for (int i = 0; i < letras.length && (y + i) < sopaLetras[x].length; i++) {
            sopaLetras[x][y + i] = letras[contador++];
        }
    }

    public void colocarPalabraHorizontalInvertida(int x, int y, String palabra) {

        char letras[] = new char[palabra.length()];

        System.out.println("Palabra a colocar: " + palabra);
        // Inicializó el char
        for (int i = 0; i < letras.length; i++) {
            letras[i] = palabra.charAt(i);
        }
        // Cambio la posicion
        for (int i = 0; i < letras.length && (y - i) >= 0; i++) {
            sopaLetras[x][y - i] = letras[i];
        }
    }

    public void colocarPalabraVertical(int x, int y, String palabra) {

        char letras[] = new char[palabra.length()];

        System.out.println("Palabra a colocar: " + palabra);
        // Inicializó el char
        for (int i = 0; i < letras.length; i++) {
            letras[i] = palabra.charAt(i);
        }
        // Cambio la posicion
        for (int i = 0; i < letras.length && (x + i) < sopaLetras.length; i++) {
            sopaLetras[x + i][y] = letras[i];
        }
    }

    public void colocarPalabraVerticalInvertida(int x, int y, String palabra) {

        char letras[] = new char[palabra.length()];

        System.out.println("Palabra a colocar: " + palabra);
        // Inicializó el char
        for (int i = 0; i < letras.length; i++) {
            letras[i] = palabra.charAt(i);
        }
        // Cambio la posicion
        for (int i = 0; i < letras.length && (x - i) >= 0; i++) {
            sopaLetras[x - i][y] = letras[i];
        }
    }

    public char[][] getSopaLetras() {
        return sopaLetras;
    }

    public void setSopaLetras(char[][] sopaLetras) {
        this.sopaLetras = sopaLetras;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sopaLetras.length; i++) {
            System.out.println("");
            for (int j = 0; j < sopaLetras[i].length; j++) {
                System.out.print(" | " + sopaLetras[i][j]);
            }
        }
        return sb.toString();
    }

}
