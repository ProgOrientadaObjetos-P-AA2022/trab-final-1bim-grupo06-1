/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import java.util.Scanner;

import paqueteGuardadoCons.EjecutorConstructora;
import paqueteGuardadoCons.BusquedaConst;

import paqueteGuardadoBarrio.BusquedaBarrio;
import paqueteGuardadoBarrio.EjecutorBarrio;

import paqueteGuardadoCity.BusquedaCity;
import paqueteGuardadoCity.EjecutorCity;

import paqueteGuardadoDepartamento.EjecutorDepartamento;

import paqueteGuardadoCasa.EjecutorCasa;

import paqueteGuardadoProp.BusquedaProp;
import paqueteGuardadoProp.EjecutorProp;
/**
 *
 * @author reroes
 */
public class EjecutorPrincipal {
    
    //Variables de tipo estaticas para recorrer el menu
    static Scanner sc = new Scanner(System.in);
    static int op = -1;
    static int opc;
    
    public static void main(String[] args) {
 
        //Ejecutores de su propia clase.
        EjecutorProp objProp = new  EjecutorProp();
        EjecutorCity objCity = new EjecutorCity();
        EjecutorBarrio objBarrio = new EjecutorBarrio();
        EjecutorConstructora objCons = new EjecutorConstructora();
        EjecutorDepartamento objDeparta = new EjecutorDepartamento();
        EjecutorCasa objCasa = new EjecutorCasa();
        
        ImprimirDatos objImp = new ImprimirDatos();
        
        //Buscadores de su propia clase
        BusquedaProp objPropBus = new BusquedaProp();
        BusquedaCity objCityBus = new BusquedaCity();
        BusquedaBarrio objBarrioBus = new BusquedaBarrio();
        BusquedaConst objConsBus = new BusquedaConst();
        
        while (op != 0){
            try {
                System.out.println("------------------------------");
                System.out.printf("Elegir la opcion que decea realizar: \n\n"
                        + "Ingresar Propietario              [1]\n"
                        + "Ingresar Ciudad                   [2]\n"
                        + "Ingresar Barrio                   [3]\n"
                        + "Ingresar Constructora             [4]\n"
                        + "---------------------\n"
                        + "Ingresar una Casa                 [5]\n"
                        + "Ingresar un departamento          [6]\n"
                        + "------------------------\n"
                        + "Imprimir Datos                    [7]\n"
                        + "------------------------\n"
                        + "Para salir de la aplicaicon pulse [0]\n");
                op = sc.nextInt();
                sc.nextLine();
                System.out.println("------------------------------");
                switch(op){
                    case 1:      
                        System.out.println("******************");
                        System.out.println("Nuevo propietario     [1]");
                        System.out.println("Buscar propietario    [2]");
                        System.out.println("Atras                 [0]");
                        opc = sc.nextInt();
                        sc.nextLine();
                        switch (opc) {
                            case 1:
                                objProp.main(args);
                                break;
                            case 2:
                                objPropBus.main(args);
                                break;
                            case 0:
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("******MENU CIUDAD******");
                        System.out.println("Nueva Ciudad         [1]");
                        System.out.println("Buscar Ciudad        [2]");
                        System.out.println("Atras                [0]");
                        opc = sc.nextInt();
                        sc.nextLine();
                        switch (opc) {
                            case 1:
                                objCity.main(args);
                                break;
                            case 2:
                                objCityBus.main(args);
                                break;
                            case 0:
                                break;
                        }
                        break;
                    case 3:
                        System.out.println("******MENU BARRIO******");
                        System.out.println("Nueva Barrio         [1]");
                        System.out.println("Buscar Barrio        [2]");
                        System.out.println("Atras                [0]");
                        opc = sc.nextInt();
                        sc.nextLine();
                        switch (opc) {
                            case 1:
                                objBarrio.main(args);
                                break;
                            case 2:
                                objBarrioBus.main(args);
                                break;
                            case 0:
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("******MENU CONSTRUCTORA******");
                        System.out.println("Nueva Constructora         [1]");
                        System.out.println("Buscar Constructora        [2]");
                        System.out.println("Atras                      [0]");
                        opc = sc.nextInt();
                        sc.nextLine();
                        switch (opc) {
                            case 1:
                                objCons.main(args);
                                break;
                            case 2:
                                objConsBus.main(args);
                                break;
                            case 0:
                                break;
                        }
                        break;
                  case 5://No se como arreglarlo
                        System.out.println("******MENU CASA******");
                        objCasa.main(args);
                        break;
                  case 6://No se como arreglarlo 
                        System.out.println("******MENU DEPARTAMENTO******");
                        objDeparta.main(args);  
                        break;
                  case 7:
                        objImp.main(args);
                        break;
                }
                System.out.println("");
            } catch (Exception e) {
                System.out.println("Error al dijitar.");
            }
        }
    }
}
