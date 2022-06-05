/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteGuardadoCity;

import java.util.Scanner;
import paquete04.Ciudad;


/**
 *
 * @author maisc
 */
public class BusquedaCity {
    
    public static void main(String[] args) {
        String nombreArchivoC = "data/ciudad.data";
        String nomb;
        Ciudad city_buscar;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("BUSQUEDA DE LA CIUDAD");
        System.out.println("Ingrese el nombre de la ciudad: ");
        nomb = sc.nextLine();
        
        LecturaCity lectura = new LecturaCity(nombreArchivoC);
        
        lectura.establecerIdent(nomb);
        lectura.establecerCityBusqueda();
        city_buscar = lectura.obtenerCityBusqueda();

        if (city_buscar != null) {
            System.out.println("------ENCONTRADO------");
            System.out.println(city_buscar);
        } else {
            System.out.println("**********");
            System.out.println("NOMBRE DE CIUDAD no encontrado");
            System.out.println("**********");
        }
    }
    
}
