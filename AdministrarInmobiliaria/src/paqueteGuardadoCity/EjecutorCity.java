/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
// * and open the template in the editor.
 */
package paqueteGuardadoCity;

import java.util.Scanner;
import paquete04.Ciudad;
/**
 *
 * @author reroes
 */
public class EjecutorCity {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nombreArchivoCi = "data/ciudad.data";
        
        EscrituraCity e = new EscrituraCity(nombreArchivoCi);
        
        String nomC;
        String nomP;
        
        System.out.println("*****Ingrese los datos de la Ciudad*****");
        System.out.println("Nombre ciudad: ");
        nomC = sc.nextLine();
        System.out.println("Nombre provincia: ");
        nomP = sc.nextLine();

        Ciudad c = new Ciudad(nomC, nomP);
        
        e.establecerRegistroCity(c);
        e.establecerSalida();
        
        e.cerrarArchivo();
        
        LecturaCity lectura = new LecturaCity(nombreArchivoCi);
        lectura.establecerCity();
        
        System.out.println(lectura);
    }
}
