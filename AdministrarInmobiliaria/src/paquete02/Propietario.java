/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author reroes
 */
public class Propietario {
    private String nombre;
    private String apellido;
    private String identificacion;
    
    //Los contructores..
    public Propietario(String nom, String ape, String dni){
        nombre = nom;
        apellido = ape;
        identificacion = dni;
    }
    
    //Los establecer de los atributos
    public void establecerNombre(String c){
        nombre = c;
    }
    public void establecerApellido(String c){
        apellido = c;
    }
    public void establecerIdentificacion(String c){
        identificacion = c;
    }
    
    //Los obtener de los atributos
    public String obtenerNombre(){
        return nombre;
    }
    public String obtenerApellido(){
        return apellido;
    }
    public String obtenerIdentificacion(){
        return identificacion;
    }
    
    //Metodo toString
    @Override
    public String toString(){
        String c = "PROPIETARIO....";
        return c;
    }
}
