/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;

import paquedeGuardadoCons.EjecutorConstructora;
import paqueteGuardadoBarrio.EjecutorBarrio;
import paqueteGuardadoCity.EjecutorCity;
import paqueteGuardadoProp.EjecutorProp;
/**
 *
 * @author reroes
 */
public class EjecutorPrincipal {
    
    static Scanner sc = new Scanner(System.in);
    static int op = -1;
    
    public static void main(String[] args) {
 
        EjecutorProp objProp = new  EjecutorProp();
        EjecutorCity objCity = new EjecutorCity();
        EjecutorBarrio objBarrio = new EjecutorBarrio();
        EjecutorConstructora objCons = new EjecutorConstructora();
        
        while (op != 0){
            try {
                System.out.println("------------------------------");
                System.out.printf("Elegir la opcion que decea realizar: \n\n"
                        + "Ingresar Propietario   [1]\n"
                        + "Ingresar Ciudad        [2]\n"
                        + "Ingresar Barrio        [3]\n"
                        + "Ingresar Constructora  [4]\n\n"
                        + "Ingresar una Casa         [5]\n"
                        + "Ingresar un departamento  [6]\n\n"
                        + "Para salir de la aplicaicon pulse [0]\n");
                op = sc.nextInt();
                sc.nextLine();
                System.out.println("------------------------------");
                switch(op){
                    case 1:
                        objProp.main(args);
                        break;
                    case 2:
                        objCity.main(args);
                        break;
                    case 3:
                        objBarrio.main(args);
                        break;
                    case 4:
                        objCons.main(args);
                        break;
//                    case 5:
//                        
//                        break;
//                    case 6: 
//                        
//                        break;
                }
                System.out.println("");
            } catch (Exception e) {
                System.out.println("Error al dijitar.");
            }
        }
    }
    
    
    
}
