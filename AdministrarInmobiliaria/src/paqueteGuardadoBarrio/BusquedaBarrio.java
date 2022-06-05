/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteGuardadoBarrio;

import java.util.Scanner;
import paquete03.Barrio;




/**
 *
 * @author maisc
 */
public class BusquedaBarrio {
    
    public static void main(String[] args) {
        String nombreArchivoB = "data/barrio.data";
        String nomb;
        Barrio barrio_buscar;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("BUSQUEDA DE LA BARRIO");
        System.out.println("Ingrese el nombre del barrio: ");
        nomb = sc.nextLine();
        
        LecturaBarrio lectura = new LecturaBarrio(nombreArchivoB);
        
        lectura.establecerIdent(nomb);
        lectura.establecerBarrio();
        barrio_buscar = lectura.obtenerBarrioBusqueda();

        if (barrio_buscar != null) {
            System.out.println("------ENCONTRADO------");
            System.out.println(barrio_buscar);
        } else {
            System.out.println("**********");
            System.out.println("NOMBRE BARRIO no encontrado");
            System.out.println("**********");
        }
    }
    
}
