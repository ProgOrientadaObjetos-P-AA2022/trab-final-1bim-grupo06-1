/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

/**
 *
 * @author reroes
 */
public class Casa {
    private Propietario prop;//Instanciamos una variable de tipo propietario
    private double precioXCuadra;
    private double metrosCua;
    private double costoTotal;
    private Barrio barr;//Instanciamos una variable de tipo barrio
    private Ciudad ciud;//Instanciamos una variable de tipo ciudad
    private int numCuartos;
    private Constructora construc;//Instanciamos una variable de tipo constructora
    
    //Constructores...
    
    
    //Los establecer de los atributos
    public void establecerProp(Propietario c){
        prop = c;
    }
    public void establecerPrecioXCuadra(double c){
        precioXCuadra = c;
    }
    public void establecerMetrosCua(double c){
        metrosCua = c;
    }
    public void calcularCostoTotal(){
        //Falta mas...
        costoTotal = precioXCuadra * metrosCua;
    }
    public void establecerBarr(Barrio c){
        barr = c;
    }
    public void establecerCiud(Ciudad c){
        ciud = c;
    }
    public void establecerNumCuartos(int c){
        numCuartos = c;
    }
    public void establecerConstruc(Constructora c){
        construc = c;
    }
    
    //Los obtener de los atributos
    public Propietario obtenerProp(){
        return prop;
    }
    public double obtenerprecioXCuadra(){
        return precioXCuadra;
    }
    public double obtenerMetrosCua(){
        return metrosCua;
    }
    public double obtenerCostoTotal(){
        return costoTotal;
    }
    public Barrio obtenerBarr(){
        return barr;
    }
    public Ciudad obtenerCiud(){
        return ciud;
    }
    public int obtenerNumCuartos(){
        return numCuartos;
    }
    public Constructora obtenerConstruc(){
        return construc;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        String c = "CASA......";
        return c;
    }
}
