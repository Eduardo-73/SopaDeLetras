/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author edu
 */
public class Sopa {

    public static void main(String[] args) {
        SopaLetras sopa = new SopaLetras(10);

        sopa.colocarPalabraHorizontal(5, 2, "tomas");
        sopa.colocarPalabraHorizontalInvertida(4, 5, "edu");
        sopa.colocarPalabraVertical(1, 2, "aiman");
        sopa.colocarPalabraVerticalInvertida(9, 2, "antonio");
        System.out.println(sopa);
    }
}
