/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteGuardadoDepartamento;

/**
 *
 * @author maisc
 **/

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import paquete06.Departamento;

public class LecturaDepa {

    private ObjectInputStream entrada;
    private ArrayList<Departamento> depar;
    private String noArchivo;
    private String ident;
    private Departamento departamentoBusqueda;

    //Constructor
    public LecturaDepa(String n) {
        noArchivo = n;
        File f = new File(obtenerNoArchivo());
        if (f.exists()) {
            try {
                entrada = new ObjectInputStream(
                        new FileInputStream(n));
            }
            catch (IOException ioException) {
                System.err.println("Error al abrir el archivo." + ioException);
            }
        }
    }

    //Los establecer de los atributos
    public void establecerNoArchivo(String n) {
        noArchivo = n;
    }
    public void establecerDepar() {
        depar = new ArrayList<>();
        File f = new File(obtenerNoArchivo());
        if (f.exists()) {
            while (true) {
                try {
                    Departamento reg = (Departamento) entrada.readObject();
                    depar.add(reg);
                } catch (EOFException endOfFileException) {
                    return;
                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);
                }
            }
        }
    }
    public void establecerIdent(String n) {
        ident = n;
    }
    public void establecerDepartamentoBusqueda() {
        File f = new File(obtenerNoArchivo());
        if (f.exists()) {
            while (true) {
                try {
                    Departamento reg = (Departamento) entrada.readObject();
                    //obtenemos la id del propietario
                    if(reg.obtenerProp2().obtenerIdentificacion().equals(ident)){
                        departamentoBusqueda = reg;
                        break;
                    }
                    //obtenemos la id del propietario
                    if(reg.obtenerBarr2().obtenerNomBarrio().equals(ident)){
                        departamentoBusqueda = reg;
                        break;
                    }
                    //obtenemos la id del propietario
                    if(reg.obtenerCiud2().obtenerNombCiudad().equals(ident)){
                        departamentoBusqueda = reg;
                        break;
                    }
                    //obtenemos la id del propietario
                    if(reg.obtenerConstruc2().obtenerIdEmp().equals(ident)){
                        departamentoBusqueda = reg;
                        break;
                    }
                } catch (EOFException endOfFileException) {
                    return;
                } catch (IOException ex) {
                    System.err.println("Error al leer el archivo: " + ex);
                } catch (ClassNotFoundException ex) {
                    System.err.println("No se pudo crear el objeto: " + ex);
                } catch (Exception ex) {
                    System.err.println("No hay datos en el archivo: " + ex);
                }
            }
        }
    }
    
    //Los obtener de los atributos
    public ArrayList<Departamento> obtenerDepartamento() {
        return depar;
    }
    public String obtenerNoArchivo() {
        return noArchivo;
    }
    public String obtenerIdent() {
        return ident;
    }
    public Departamento obtenerDepartamentoBusqueda() {
        return departamentoBusqueda;
    }

    //Metodo toString
    @Override
    public String toString() {
        String ca = "Lista de Departamento\n";
        for (int i = 0; i < obtenerDepartamento().size(); i++) {
            Departamento c = obtenerDepartamento().get(i);
            ca = String.format("%s(%d) Propietario.. \t[%s-%s-%s]\n"
                    + "Precio por metro cuadrado:  %.2f\n"
                    + "Numero de metros cuadrados: %.2f\n"
                    + "Valor alicuota mensual: %.2f\n"
                    + "Costo final: %.2f\n"
                    + "Barrio.. \t[%s-%s]\n"
                    + "Ciudad.. \t[%s-%s]\n"
                    + "Nombre del edificio: %s\n"
                    + "Ubicacion del departamento en edificio: %s\n"
                    + "Constructora.. \t[%s-%s]\n"
                    ,ca
                    ,i + 1
                    ,c.obtenerProp2().obtenerNombre()//
                    ,c.obtenerProp2().obtenerApellido()//
                    ,c.obtenerProp2().obtenerIdentificacion()//
                    ,c.obtenerPrecioXCuadra2()
                    ,c.obtenerMetrosCua2()
                    ,c.obtenerValorAlicuotaMes()
                    ,c.obtenerCostoTotal2()
                    ,c.obtenerBarr2().obtenerNomBarrio()//
                    ,c.obtenerBarr2().obtenerRefe()///
                    ,c.obtenerCiud2().obtenerNombCiudad()//
                    ,c.obtenerCiud2().obtenerProvincia()//
                    ,c.obtenerNombEdificio()
                    ,c.obtenerUbiEdificio()
                    ,c.obtenerConstruc2().obtenerNomCons()//
                    ,c.obtenerCiud2().obtenerProvincia()
            );
        }
        return ca;
    }

    // cierra el archivo y termina la aplicación
    public void cerrarArchivo() {
        try {
            if (entrada != null) {
                entrada.close();
            }
            System.exit(0);
        }
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            System.exit(1);
        }
    }
}
