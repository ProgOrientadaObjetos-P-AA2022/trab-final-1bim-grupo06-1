/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteGuardadoCons;

import java.util.Scanner;
import paquete05.Constructora;

/**
 *
 * @author reroes
 */
public class EjecutorConstructora {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nombreArchivoCo = "data/constructora.data";
        
        EscrituraConst e = new EscrituraConst(nombreArchivoCo);

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
        
        LecturaConst lectura = new LecturaConst(nombreArchivoCo);
        lectura.establecerConstruct();
        
        System.out.println(lectura);
    }
}
