/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteGuardadoProp;

import java.util.Scanner;
import paquete02.Propietario;

/**
 *
 * @author reroes
 */
public class EjecutorProp {
    public static void main(String[] args) {

        String nombreArchivoP = "data/propietario.data";
        String nom;
        String ape;
        String ced;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("*****Ingrese los datos de propietario*****");
        System.out.println("nombre: ");
        nom = sc.nextLine();
        System.out.println("apellido: ");
        ape = sc.nextLine();
        System.out.println("cedula: ");
        ced = sc.nextLine();
        
        Propietario p0 = new Propietario(nom,ape,ced);
        EscrituraProp e = new EscrituraProp(nombreArchivoP);
        
        e.establecerRegistroProp(p0);
        e.establecerSalida();
        
        e.cerrarArchivo();
        
        LecturaProp lectura = new LecturaProp(nombreArchivoP);
        lectura.establecerProp();
        
        System.out.println(lectura);
        
    }
}
