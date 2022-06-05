/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquedeGuardadoCons;

import java.util.Scanner;
import paquete05.Constructora;

/**
 *
 * @author reroes
 */
public class EjecutorConstructora {
    public static void main(String[] args) {

        String nombreArchivoCo = "data/constructora.data";
        
        Scanner sc = new Scanner(System.in);

//        Constructora co1 = new Constructora("Palillos fuertes", "PF-035");
//        Constructora co2 = new Constructora("Palillos fuertes", "PF-035");
//        Constructora co3 = new Constructora("Palillos fuertes", "PF-035");

        Escritura e = new Escritura(nombreArchivoCo);
        
//        e.establecerRegistroConstructora(co1);
//        e.establecerSalida();
//        
//        e.establecerRegistroConstructora(co2);
//        e.establecerSalida();
//        
//        e.establecerRegistroConstructora(co3);
//        e.establecerSalida();

        String nomC;
        String idE;
        
        System.out.println("*****Ingrese los datos del/la Constructor*****");
        System.out.println("Ingrese el nombre: ");
        nomC = sc.nextLine();
        System.out.println("Ingrese el id de la empresa: ");
        idE = sc.nextLine();
        
        Constructora c = new Constructora(nomC, idE);
        
        e.establecerRegistroConstructora(c);
        e.establecerSalida();
        
        e.cerrarArchivo();
        
        Lectura lectura = new Lectura(nombreArchivoCo);
        lectura.establecerConstruct();
        
        System.out.println(lectura);
    }
}
