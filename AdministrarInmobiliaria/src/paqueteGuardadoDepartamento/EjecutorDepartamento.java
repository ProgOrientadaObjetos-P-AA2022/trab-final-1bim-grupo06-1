/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteGuardadoDepartamento;

import java.util.Scanner;

import paqueteGuardadoCons.BusquedaConst;
import paqueteGuardadoCons.EjecutorConstructora;

import paquete06.Departamento;

import paqueteGuardadoBarrio.BusquedaBarrio;
import paqueteGuardadoBarrio.EjecutorBarrio;

import paqueteGuardadoCity.BusquedaCity;
import paqueteGuardadoCity.EjecutorCity;

import paqueteGuardadoProp.BusquedaProp;
import paqueteGuardadoProp.EjecutorProp;

/**
 *
 * @author reroes
 */
public class EjecutorDepartamento {
    public static void main(String[] args) {

        String nombreArchivoD = "data/departamento.data";
        
        Scanner sc = new Scanner(System.in);
        
         //Ejecutores de su propia clase.
        EjecutorProp objProp = new  EjecutorProp();
        EjecutorCity objCity = new EjecutorCity();
        EjecutorBarrio objBarrio = new EjecutorBarrio();
        EjecutorConstructora objCons = new EjecutorConstructora();
        
        //Buscadores de su propia clase
        BusquedaProp objPropBus = new BusquedaProp();
        BusquedaCity objCityBus = new BusquedaCity();
        BusquedaBarrio objBarrioBus = new BusquedaBarrio();
        BusquedaConst objConsBus = new BusquedaConst();
        
        EscrituraDepa es = new EscrituraDepa(nombreArchivoD);
        LecturaDepa le = new LecturaDepa(nombreArchivoD);       
        
        double mXc;
        double num;
        double ali;
        String nomE;
        String ubi;
        
        int op;
        
        System.out.println("*****Ingrese los datos del departamento*****");
        System.out.println("PROPIETARIO");
        
        System.out.println("Nuevo Propietario            [1]");
        System.out.println("Busqueda de Propietario      [2]");
        op = sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 1:
                objProp.main(args);
                break;
            case 2:
                objPropBus.main(args);
                break;
        }
        
        
        System.out.println("Valores");
        //datos a dijitar
        System.out.println("Ingrese el precio por metro cuadrado: ");
        mXc = sc.nextDouble();
        System.out.println("Ingrese el numero de metros cuadrados: ");
        num = sc.nextDouble();
        System.out.println("Ingrese el valor alicuota mensual: ");
        ali = sc.nextDouble();
       
        
        System.out.println("BARRIO");
        System.out.println("Nuevo Barrio            [1]");
        System.out.println("Busqueda del Barrio     [2]");
        op = sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 1:
                objBarrio.main(args);
                break;
            case 2:
                objBarrioBus.main(args);
                break;
        }
        
            
        System.out.println("CIUDAD");
        System.out.println("Nueva Ciudad            [1]");
        System.out.println("Busqueda del Ciudad     [2]");
        op = sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 1:
                objCity.main(args);
                break;
            case 2:
                objCityBus.main(args);
                break;
        }
       
        
        System.out.println("Ingrese el nombre del edificio: ");
        nomE = sc.nextLine();
        System.out.println("Ingrese la ubicacion del edificio: ");
        ubi = sc.nextLine();
       
        
        System.out.println("CONSTRUCTORA");
        System.out.println("Nuevo/a constructor/ra           [1]");
        System.out.println("Busqueda del/la constructor/ra   [2]");
        op = sc.nextInt();
        sc.nextLine();
        switch (op) {
            case 1:
                objCons.main(args);
                break;
            case 2:
                objConsBus.main(args);
                break;
        }
//      }
        
        Departamento depatament = new Departamento( mXc, num, ali, nomE, ubi);
        
        depatament.obtenerCostoTotal2();
        
        es.establecerRegistroDepartamento(depatament);
        es.establecerSalida();
        
        le.establecerDepar();
        //falta especificar
        System.out.println(le);
        
    }
}