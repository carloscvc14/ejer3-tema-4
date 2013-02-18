/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Alumno
 */
public class Pantalla {
     public static int pideInt(String texto) {
        InputStreamReader flujo=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujo);
        String cadnum;
        int numero=0;
        boolean correcto;
        do {
                try {
                    correcto=true;
                    System.out.print(texto);
                    cadnum=teclado.readLine();
                    numero=Integer.parseInt(cadnum);
                }
                catch (NumberFormatException e) {
                    System.out.println("\t\tTienes que introducir un nº: " + e);
                    correcto=false;
                }
                catch (IOException e) {
                    System.out.println("\t\tSe ha producido un error: " + e);
                    correcto=false;
                }
        }while (!correcto);
        return numero;
    }
    
    public static float pideFloat(String texto) {
        InputStreamReader flujo=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujo);
        String cadnum;
        float numero=0;
        boolean correcto;
        do {
                try {
                    correcto=true;
                    System.out.print(texto);
                    cadnum=teclado.readLine();
                    numero=Float.parseFloat(cadnum);
                }
                catch (NumberFormatException e) {
                    System.out.println("\t\tTienes que introducir un nº: " + e);
                    correcto=false;
                }
                catch (IOException e) {
                    System.out.println("\t\tSe ha producido un error: " + e);
                    correcto=false;
                }
        }while (!correcto);
        return numero;
    }
    public static String pideCadena(String texto) {
        InputStreamReader flujo=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(flujo);
        String cadnum = null;
        System.out.print(texto);
        try {
            cadnum=teclado.readLine();
        } catch (IOException ex) {
            System.out.println("\tHay errores: "+ex);
        }
        return cadnum;
    }
}
