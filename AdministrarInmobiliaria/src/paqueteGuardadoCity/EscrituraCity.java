/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteGuardadoCity;

/**
 *
 * @author maisc
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete04.Ciudad;

public class EscrituraCity {

    private String noArchivo;
    private ObjectOutputStream salida; 
    private Ciudad registroCity;
    private ArrayList<Ciudad> listaCity;

    public EscrituraCity(String c) {
        noArchivo = c;
        establecerListaCity(); 
        try{
            salida = new ObjectOutputStream(new FileOutputStream(noArchivo));
            if (obtenerListaCity().size() > 0) {
                for (int i = 0; i < obtenerListaCity().size(); i++) {
                    establecerRegistroCity(obtenerListaCity().
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
    public void establecerRegistroCity(Ciudad c) {
        registroCity = c;
    }
    public void establecerSalida() {
        try {
            salida.writeObject(registroCity);
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }
    public void establecerListaCity() {
        LecturaCity le =  new LecturaCity(obtenerNoArchivo());
        le.establecerCity();
        listaCity = le.obtenerCity();
    }

    
    public String obtenerNoArchivo(){
        return noArchivo;
    }
    public ArrayList<Ciudad> obtenerListaCity() {
        return listaCity;
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
