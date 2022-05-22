/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class Constructora {
    private String nomCons;
    private String idEmp;
    
    //Constructores...
    public Constructora(String nom, String id){
        nomCons = nom;
        idEmp = id;
    }
    
    //Los establecer de los atributos
    public void establecerNomCons(String c){
        nomCons = c;
    }
    public void establecerIdEmp(String c){
        idEmp = c;
    }
    
    //Los obtener de los atributos
    public String obtenerNomCons(){
        return nomCons;
    }
    public String obtenerIdEmp(){
        return idEmp;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        String c = "CONSTRUCTORA...";
        return c;
    }
    
}
