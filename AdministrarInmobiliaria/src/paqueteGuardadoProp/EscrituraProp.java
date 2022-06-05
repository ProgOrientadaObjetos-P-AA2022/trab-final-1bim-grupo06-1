/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteGuardadoProp;

/**
 *
 * @author maisc
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete02.Propietario;

public class EscrituraProp {

    private String noArchivo;
    private ObjectOutputStream salida; 
    private Propietario registroProp;
    private ArrayList<Propietario> listaProp;

    public EscrituraProp(String c) {
        noArchivo = c;
        establecerListaProp(); 
        try{
            salida = new ObjectOutputStream(new FileOutputStream(noArchivo));
            if (obtenerListaProp().size() > 0) {
                for (int i = 0; i < obtenerListaProp().size(); i++) {
                    establecerRegistroProp(obtenerListaProp().
                            get(i));
                    establecerSalida();
                }
            }
        } 
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        }
    }
    public void establecerNoArchivo(String c){
        noArchivo = c;
    }
    public void establecerRegistroProp(Propietario c) {
        registroProp = c;
    }
    public void establecerSalida() {
        try {
            salida.writeObject(registroProp);
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }
    public void establecerListaProp() {
        LecturaProp le =  new LecturaProp(obtenerNoArchivo());
        le.establecerProp();
        listaProp = le.obtenerProp();
    }

    
    public String obtenerNoArchivo(){
        return noArchivo;
    }
    public ArrayList<Propietario> obtenerListaProp() {
        return listaProp;
    }
    public ObjectOutputStream obtenerSalida(){
        return salida;
    }
    public void cerrarArchivo() {
        try{
            if (salida != null) {
                salida.close();
            }
        }
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo."); 
        }
    } 

}
