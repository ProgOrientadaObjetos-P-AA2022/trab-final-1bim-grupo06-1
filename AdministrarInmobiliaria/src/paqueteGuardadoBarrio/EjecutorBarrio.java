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
        
        Scanner sc = new Scanner(System.in);
        
        String nombreArchivoB = "data/barrio.data";
        
        EscrituraBarrio e = new EscrituraBarrio(nombreArchivoB);
        
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
        
        LecturaBarrio lectura = new LecturaBarrio(nombreArchivoB);
        lectura.establecerBarrio();
        
        System.out.println(lectura);
    }
}
