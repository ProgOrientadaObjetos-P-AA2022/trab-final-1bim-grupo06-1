/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteGuardadoDepartamento;

import java.util.Scanner;
import paquedeGuardadoCons.EscrituraConst;
import paquedeGuardadoCons.LecturaConst;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;
import paquete06.Departamento;
import paqueteGuardadoBarrio.EscrituraBarrio;
import paqueteGuardadoBarrio.LecturaBarrio;
import paqueteGuardadoCity.EscrituraCity;
import paqueteGuardadoCity.LecturaCity;
import paqueteGuardadoProp.EscrituraProp;
import paqueteGuardadoProp.LecturaProp;

/**
 *
 * @author reroes
 */
public class EjecutorDepartamento {
    public static void main(String[] args) {

        String nombreArchivoD = "data/departamento.data";
        String nombreArchivoP = "data/propietario.data";
        String nombreArchivoCi = "data/ciudad.data";
        String nombreArchivoBa = "data/barrio.data";
        String nombreArchivoCo = "data/constructora.data";
        
        Scanner sc = new Scanner(System.in);
        
        EscrituraDepa e = new EscrituraDepa(nombreArchivoD);
        EscrituraProp pro = new EscrituraProp(nombreArchivoP);
        EscrituraBarrio ba = new EscrituraBarrio(nombreArchivoBa);
        EscrituraCity city = new EscrituraCity(nombreArchivoCi);
        EscrituraConst cons = new EscrituraConst(nombreArchivoCo);
        
        LecturaProp lpro = new LecturaProp(nombreArchivoP);
        
        double mXc;
        double num;
        double ali;
        String nomE;
        String ubi;
        
        System.out.println("*****Ingrese los daltos del departamento*****");
        
        //******************************************
        //se podria poner un if...
        
        
        
        System.out.println("PROPIETARIO");
        //if (0 = 0){
            String nom;
            String ape;
            String ced;
            System.out.println("nombre: ");
            nom = sc.nextLine();
            System.out.println("apellido: ");
            ape = sc.nextLine();
            System.out.println("cedula: ");
            ced = sc.nextLine();
            Propietario p0 = new Propietario(nom,ape,ced);
            pro.establecerRegistroProp(p0);
            pro.establecerSalida();
            pro.cerrarArchivo();    
            lpro.establecerProp();
        //}
        //******************************************
        
        //datos a dijitar
        System.out.println("Ingrese el precio por metro cuadrado: ");
        mXc = sc.nextDouble();
        System.out.println("Ingrese el numero de metros cuadrados: ");
        num = sc.nextDouble();
        System.out.println("Ingrese el valor alicuota mensual: ");
        ali = sc.nextDouble();
       
        //******************************************
        //se podria poner un if...
            System.out.println("BARRIO");
            //if (0 = 0){
            String nomBarrio;
            String ref;
            System.out.println("*****Ingrese los datos de la barrio*****");
            System.out.println("Nombre barrio: ");
            nomBarrio = sc.nextLine();
            System.out.println("Ingrese la referencia: ");
            ref = sc.nextLine();
            Barrio b = new Barrio(nom,ref);
            ba.establecerRegistroBarrio(b);
            ba.establecerSalida();
            ba.cerrarArchivo();
            LecturaBarrio lBar = new LecturaBarrio(nombreArchivoBa);
            lBar.establecerBarrio();
        //}
        //******************************************
        
        //******************************************
        //se podria poner un if...
        System.out.println("CIUDAD");
        //if (0 = 0){
            String nomC;
            String nomP;
            System.out.println("*****Ingrese los datos de la Ciudad*****");
            System.out.println("Nombre ciudad: ");
            nomC = sc.nextLine();
            System.out.println("Nombre provincia: ");
            nomP = sc.nextLine();
            Ciudad c = new Ciudad(nomC, nomP);
            city.establecerRegistroCity(c);
            city.establecerSalida();
            city.cerrarArchivo();
            LecturaCity lectura = new LecturaCity(nombreArchivoCi);
            lectura.establecerCity();
        //}
        //******************************************
        
        System.out.println("Ingrese el nombre del edificio: ");
        nomE = sc.nextLine();
        System.out.println("Ingrese la ubicacion del edificio: ");
        ubi = sc.nextLine();
        
        //se podria poner un if...
        System.out.println("CONSTRUCTORA");
//      if( 0 = 0) {
            String nomCons;
            String idE;
            System.out.println("*****Ingrese los datos del/la Constructor*****");
            System.out.println("Ingrese el nombre: ");
            nomCons = sc.nextLine();
            System.out.println("Ingrese el id de la empresa: ");
            idE = sc.nextLine();
            Constructora construc = new Constructora(nomC, idE);
            cons.establecerRegistroConstructora(construc);
            cons.establecerSalida();
            e.cerrarArchivo();
            LecturaConst lcons = new LecturaConst(nombreArchivoCo);
            lcons.establecerConstruct();
//      }
        
        Departamento depatament = new Departamento(p0, mXc, num, ali, b, c, 
                nomE, ubi,construc);
        
        e.establecerRegistroDepartamento(depatament);
        e.establecerSalida();
        
        LecturaDepa ld = new LecturaDepa(nombreArchivoD);
        ld.establecerDepar();
        
        System.out.println(ld);
        
    }
}
