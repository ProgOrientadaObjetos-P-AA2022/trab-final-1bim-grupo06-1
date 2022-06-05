/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquedeGuardadoCons;

/**
 *
 * @author maisc
 */

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import paquete05.Constructora;

public class EscrituraConst {

    private String noArchivo;
    private ObjectOutputStream salida; 
    private Constructora registroConstructora;
    private ArrayList<Constructora> listaConstructora;

    public EscrituraConst(String c) {
        noArchivo = c;
        establecerListaConstructora(); 
        try{
            salida = new ObjectOutputStream(new FileOutputStream(noArchivo));
            if (obtenerListaConstructora().size() > 0) {
                for (int i = 0; i < obtenerListaConstructora().size(); i++) {
                    establecerRegistroConstructora(obtenerListaConstructora().
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
    public void establecerRegistroConstructora(Constructora c) {
        registroConstructora = c;
    }
    public void establecerSalida() {
        try {
            salida.writeObject(registroConstructora);
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }
    public void establecerListaConstructora() {
        LecturaConst le =  new LecturaConst(obtenerNoArchivo());
        le.establecerConstruct();
        listaConstructora = le.obtenerConstruct();
    }

    
    public String obtenerNoArchivo(){
        return noArchivo;
    }
    public ArrayList<Constructora> obtenerListaConstructora() {
        return listaConstructora;
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
