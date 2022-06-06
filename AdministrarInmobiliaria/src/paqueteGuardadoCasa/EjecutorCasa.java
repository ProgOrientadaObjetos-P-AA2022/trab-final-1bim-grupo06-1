/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteGuardadoCasa;

import java.util.Scanner;
import paqueteGuardadoCons.BusquedaConst;
import paqueteGuardadoCons.EjecutorConstructora;
import paquete06.Casa;
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
public class EjecutorCasa {
    public static void main(String[] args) {

        String nombreArchivoC = "data/casa.data";
        
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
        
        EscrituraCasa es = new EscrituraCasa(nombreArchivoC);
        LecturaCasa le = new LecturaCasa(nombreArchivoC);       
        
        double mXc;
        double num;
        int numC;
        
        int op;
        
        System.out.println("*****Ingrese los datos de la casa*****");
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
       
        
        System.out.println("Ingrese el numero de cuartos: ");
        numC = sc.nextInt();
       
        
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
        
        Casa casa = new Casa( mXc, num, numC);
        
        casa.obtenerCostoTotal();
        
        es.establecerRegistroCasa(casa);
        es.establecerSalida();
        
        le.establecerCasa();
        //falta especificar
        System.out.println(le);
    }
}
