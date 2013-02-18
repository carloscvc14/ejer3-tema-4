/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejer3;

/**
 *
 * @author Alumno
 */
public class Alumno {
      String nombre;
    int edad;
    float altura;
    
    Alumno(){
        nombre=Pantalla.pideCadena("\t\tIntroduce tu nombre: ");
        edad=Pantalla.pideInt("\t\tIntroduce tu edad: ");
        altura=Pantalla.pideFloat("\t\tIntroduce tu altura: ");
    }
    
    void muestraAlumno (){
        System.out.println("\t\tNombre: " + nombre);
        System.out.println("\t\tEdad: " + edad);
        System.out.println("\t\tAltura: " + altura);
    }
}
