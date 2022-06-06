/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteGuardadoProp;

import java.util.Scanner;
import paquete02.Propietario;

/**
 *
 * @author maisc
 */
public class BusquedaProp {
    
    public static void main(String[] args) {
        String nombreArchivoP = "data/propietario.data";
        String ce;
        Propietario pro_buscar;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("BUSQUEDA DE PROPIETARIO");
        System.out.println("Ingrese la cedula del propietario: ");
        ce = sc.nextLine();

        LecturaProp lectura = new LecturaProp(nombreArchivoP);
        
        lectura.establecerIdent(ce);
        lectura.establecerPropBusqueda();
        pro_buscar = lectura.obtenerPropBusqueda();

        if (pro_buscar != null) {
            System.out.println("------ENCONTRADO------");
            System.out.println(pro_buscar);
        } else {
            System.out.println("**********");
            System.out.println("PROPIETARIO no encontrado");
            System.out.println("**********");
        }
    }
    
}
