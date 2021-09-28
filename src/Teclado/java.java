/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teclado;

/**
 *
 * @author USUARIO
 */
public class java {
    public String getString(String titulo) {
        String s1 = "";
        while (s1.equals("")) {
            System.out.println(titulo);
            s1 = sc.nextLine(); // "Hola"
            if (!s1.matches("^[A-Za-z ]*$")) {
                s1 = "";
            }
        }
        return s1;
    }

    private static class sc {

        private static String nextLine() {
            throw new UnsupportedOperationException("Not supported yet."); 
        }

        public sc() {
        }
    }
}
