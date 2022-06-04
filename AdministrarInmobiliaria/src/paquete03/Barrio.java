/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

/**
 *
 * @author maisc
 */

import java.io.Serializable;

public class Barrio implements Serializable{
    private String nomBarrio;
    private String refe;
    
    //Constructor...
    public Barrio(String nomB, String ref){
        nomBarrio = nomB;
        refe = ref;
    }
    
    //Los establecer de los atributos
    public void establecerNomBarrio(String nom){
        nomBarrio = nom;
    }
    public void establecerRefe(String rf){
        refe = rf;
    }
    
    //Los obtener de los atributos
    public String obtenerNomBarrio(){
        return nomBarrio;
    }
    public String obtenerRefe(){
        return refe;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        String c = String.format("BARRIO\nNombre del barrio: %s\n"
                + "Referencia: %s\n"
                ,obtenerNomBarrio()
                ,obtenerRefe()
        );
        return c;
    }
}
