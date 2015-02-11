/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package compiladorconjuntos;

import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yeferson
 */
public class Ejecutar {
    public static void main(String[] args) {
      Ejecutar e = new Ejecutar();
      e.probar();
      
    }
    public void crearArchivo(){
         String archSintactico = "E:\\DOC\\CompiladorConjuntos\\src\\compiladorconjuntos\\cup.cup";
        String[] asintactico = {"-parser", "AnalizadorSintaco", archSintactico};
        try {
            java_cup.Main.main(asintactico);
        } catch (Exception ex) {
            Logger.getLogger(Ejecutar.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Generado!");
    } 
    public void probar() {
        // TODO code application logic here
        Lexico l=new Lexico(System.in);
        try {
            while(true){
               AnalizadorSintactico asin = new AnalizadorSintactico(l);
                        asin.parse();
            }
        }
        catch(Exception e) { System.out.println(e.getMessage());}
    }
}
