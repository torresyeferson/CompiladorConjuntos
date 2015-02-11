/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorconjuntos;

import java.io.File;

/**
 *
 * @author user
 */
public class Main {
    public static void main(String[] args) {
       
          System.out.println("\n*** Generando Archivo Sintactico***\n");
                    String opciones[] = new String[5];
                    opciones[0] = "-destdir";
                    opciones[1] = "src\\compiladorconjuntos";
                    opciones[2] = "-parser";
                    opciones[3] = "AnalizadorSintactico";
                    opciones[4] = "E:\\DOC\\CompiladorConjuntos\\src\\compiladorconjuntos\\cup.cup";
                    try {
                        java_cup.Main.main(opciones);
                    } catch (Exception e) {
                        System.out.print(e);
                    }
                    System.out.println(" ");
                    String path = "E:\\DOC\\CompiladorConjuntos\\src\\compiladorconjuntos\\lexico.flex";
                    File file = new File(path);
                    System.out.println("\n*** Generando Archivo Lexico***\n");
                    JFlex.Main.generate(file);
                    System.out.println("Archivos Generados!");
}
}