/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquedeGuardadoCons;

import paqueteGuardadoBarrio.*;
import java.util.Scanner;
import paquete03.Barrio;




/**
 *
 * @author maisc
 */
public class BusquedaConst {
    
    public static void main(String[] args) {
        String nombreArchivoC = "data/constructora.data";
        String id;
        Barrio cons_buscar;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("BUSQUEDA DE LA EMPREZA");
        System.out.println("Ingrese id de la empresa: ");
        id = sc.nextLine();
        
        LecturaBarrio lectura = new LecturaBarrio(nombreArchivoC);
        
        lectura.establecerIdent(id);
        lectura.establecerBarrio();
        cons_buscar = lectura.obtenerBarrioBusqueda();

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
