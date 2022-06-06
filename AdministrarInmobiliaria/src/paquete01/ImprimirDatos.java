/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete01;

import java.util.Scanner;
import paqueteGuardadoBarrio.LecturaBarrio;
import paqueteGuardadoCasa.LecturaCasa;
import paqueteGuardadoCity.LecturaCity;
import paqueteGuardadoCons.LecturaConst;
import paqueteGuardadoDepartamento.LecturaDepa;
import paqueteGuardadoProp.LecturaProp;

/**
 *
 * @author maisc
 */
public class ImprimirDatos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int c;
        
        System.out.println("******Imprimir los datos******");
                     
        String depart = "data/departamento.data";
        String casa = "data/casa.data";
        
        String prop= "data/propietario.data";
        String city = "data/ciudad.data";
        String barrio = "data/barrio.data";
        String cons = "data/constructora.data";

        LecturaDepa leD = new LecturaDepa(depart);   
        LecturaCasa leC = new LecturaCasa(casa);   
        
        LecturaProp leP = new LecturaProp(prop);
        LecturaCity leCi = new LecturaCity(city);
        LecturaBarrio leB = new LecturaBarrio(barrio);
        LecturaConst leCo = new LecturaConst(cons);

        try {
            System.out.println("Que tipo de datos decea imprimir:");
            System.out.println("Datos de Propietario                   [1]");
            System.out.println("Datos del Barrio                       [2]");
            System.out.println("Datos de la Ciudad                     [3]");
            System.out.println("Datos del/la Constructor/ra            [4]");
            System.out.println("Datos del la Casa                      [5]");
            System.out.println("Datos del Departamento                 [6]");
            System.out.println("Atras                                  [0]");
            
            c = sc.nextInt();
            sc.nextLine();
            
            switch (c) {
                case 1:
                    leP.establecerProp();
                    System.out.println(leP);
                    break;
                case 2:
                    leB.establecerBarrio();
                    System.out.println(leB);
                    break;
                case 3:
                    leCi.establecerCity();
                    System.out.println(leCi);
                    break;
                case 4:
                    leCo.establecerConstruct();
                    System.out.println(leCo);
                    break;
                case 5:
                    leC.establecerCasa();
                    System.out.println(leC);
                    break;
                case 6:
                    leD.establecerDepar();
                    System.out.println(leD);
                    break;
                case 0:
                    break;
            }
        } catch (Exception e) {
        }

        
                      
        
    }
}
