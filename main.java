/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3_1;

/**
 *
 * @author SPPDF
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cd = "Cadena escrita correctamente";
        String cdInvertida = "";
        System.err.println(cd);
        for (int i = cd.length()-1; i >= 0; i--) {
            cdInvertida+= cd.charAt(i);
        }
        System.err.println(cdInvertida);
    }
    
}
