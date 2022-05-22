/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

/**
 *
 * @author reroes
 */
public class Ciudad {
    private String nombCiudad;
    private String nombProvincia;
    
    //Constructores...
    public Ciudad(String c, String p){
        nombCiudad = c;
        nombProvincia = p;
    }
    
    //Los establecer de los atributos
    public void establecerNombCiudad(String ciu){
        nombCiudad = ciu;
    }
    public void establecerNombProvincia(String pro){
        nombProvincia = pro;
    }
    
    //Los obtener de los atributos
    public String obtenerNombCiudad(){
        return nombCiudad;
    }
    public String obtenerProvincia(){
        return nombProvincia;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        String c = "CIUDAD...";
        return c;
    }
}
