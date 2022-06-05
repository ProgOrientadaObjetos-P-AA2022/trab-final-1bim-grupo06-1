/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteGuardadoBarrio;

import java.util.Scanner;
import paquete03.Barrio;

/**
 *
 * @author reroes
 */
public class EjecutorBarrio {
    public static void main(String[] args) {

        String nombreArchivoB = "data/barrio.data";
        
        Scanner sc = new Scanner(System.in);
        
//        Barrio b1 = new Barrio("San Luis","Pueblillo");
//        Barrio b2 = new Barrio("Tevaida","Ferrisariato");
//        Barrio b3 = new Barrio("Electrisista","Matriculacion vehicular");
        
        Escritura e = new Escritura(nombreArchivoB);
        
//        e.establecerRegistroBarrio(b1);
//        e.establecerSalida();
//        
//        e.establecerRegistroBarrio(b2);
//        e.establecerSalida();
//        
//        e.establecerRegistroBarrio(b3);
//        e.establecerSalida();
        
        String nom;
        String ref;

        System.out.println("*****Ingrese los datos de la Ciudad*****");
        System.out.println("Nombre barrio: ");
        nom = sc.nextLine();
        System.out.println("Ingrese la referencia: ");
        ref = sc.nextLine();

        Barrio b = new Barrio(nom,ref);
        
        e.establecerRegistroBarrio(b);
        e.establecerSalida();
        
        e.cerrarArchivo();
        
        Lectura lectura = new Lectura(nombreArchivoB);
        lectura.establecerBarrio();
        
        System.out.println(lectura);
       
        
    }
}
