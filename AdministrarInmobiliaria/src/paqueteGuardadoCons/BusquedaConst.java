/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteGuardadoCons;

import java.util.Scanner;
import paquete05.Constructora;
/**
 *
 * @author maisc
 */
public class BusquedaConst {
    
    public static void main(String[] args) {
        String nombreArchivoC = "data/constructora.data";
        String id;
        Constructora cons_buscar;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("BUSQUEDA DE LA EMPREZA");
        System.out.println("Ingrese id de la empresa: ");
        id = sc.nextLine();
        
        LecturaConst lectura = new LecturaConst(nombreArchivoC);
        
        lectura.establecerIdent(id);
        lectura.establecerConstructoraBu();
        cons_buscar = lectura.obtenerConstructoraBu();

        if (cons_buscar != null) {
            System.out.println("------ENCONTRADO------");
            System.out.println(cons_buscar);
        } else {
            System.out.println("**********");
            System.out.println("ID DE EMPREZA NO ENCONTRADA");
            System.out.println("**********");
        }
    }
}
