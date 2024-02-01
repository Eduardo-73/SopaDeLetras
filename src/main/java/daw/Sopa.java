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
        SopaLetras sopa1 = new SopaLetras(10);
        SopaLetras sopa2 = new SopaLetras(10);
        SopaLetras sopa3 = new SopaLetras(10);
        SopaLetras sopa4 = new SopaLetras(10);

        sopa1.colocarPalabraHorizontal(5, 8, "tomas");
        System.out.println(sopa1);
        sopa2.colocarPalabraHorizontalInvertida(4, 5, "edu");
        System.out.println(sopa2);
        sopa3.colocarPalabraVertical(1, 2, "aiman");
        System.out.println(sopa3);
        sopa4.colocarPalabraVerticalInvertida(9, 2, "antonio");
        System.out.println(sopa4);
    }
}
