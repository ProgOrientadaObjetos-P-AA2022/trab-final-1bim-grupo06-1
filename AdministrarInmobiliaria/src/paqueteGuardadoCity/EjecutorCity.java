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

        String nombreArchivoCi = "data/ciudad.data";
        
        Scanner sc = new Scanner(System.in);
        
//        Ciudad ci1 = new Ciudad("Ciudad Loja","Provincia Loja");
//        Ciudad ci2 = new Ciudad("Ciudad Cuenca","Provincia nose");
//        Ciudad ci3 = new Ciudad("Ciudad QUITO","Provincia NOSE SEEEE");
        
        Escritura e = new Escritura(nombreArchivoCi);
        
//        e.establecerRegistroCity(ci1);
//        e.establecerSalida();
//        
//        e.establecerRegistroCity(ci2);
//        e.establecerSalida();
//        
//        e.establecerRegistroCity(ci3);
//        e.establecerSalida();
        
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
        
        Lectura lectura = new Lectura(nombreArchivoCi);
        lectura.establecerCity();
        
        System.out.println(lectura);
        
       
        
    }
}
