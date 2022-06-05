/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteGuardadoCity;

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
import paquete04.Ciudad;

public class LecturaCity {

    private ObjectInputStream entrada;
    private ArrayList<Ciudad> city;
    private String noArchivo;
    private String ident;
    private Ciudad cityBusqueda;

    //Constructor
    public LecturaCity(String n) {
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
    public void establecerCity() {
        city = new ArrayList<>();
        File f = new File(obtenerNoArchivo());
        if (f.exists()) {
            while (true) {
                try {
                    Ciudad reg = (Ciudad) entrada.readObject();
                    city.add(reg);
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
    public void establecerCityBusqueda() {
        File f = new File(obtenerNoArchivo());
        if (f.exists()) {
            while (true) {
                try {
                    Ciudad reg = (Ciudad) entrada.readObject();
                    if(reg.obtenerNombCiudad().equals(ident)){
                        cityBusqueda = reg;
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
    public ArrayList<Ciudad> obtenerCity() {
        return city;
    }
    public String obtenerNoArchivo() {
        return noArchivo;
    }
    public String obtenerIdent() {
        return ident;
    }
    public Ciudad obtenerCityBusqueda() {
        return cityBusqueda;
    }

    //Metodo toString
    @Override
    public String toString() {
        String ca = "Lista de Ciudades\n";
        for (int i = 0; i < obtenerCity().size(); i++) {
            Ciudad c = obtenerCity().get(i);
            ca = String.format("%s(%d) %s - %s\n"
                    ,ca
                    ,i + 1
                    ,c.obtenerNombCiudad()
                    ,c.obtenerProvincia()
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
