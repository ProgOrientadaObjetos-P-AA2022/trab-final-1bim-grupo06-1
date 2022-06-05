/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author maisc
 */

import java.io.Serializable;
import paquete02.Propietario;
import paquete03.Barrio;
import paquete04.Ciudad;
import paquete05.Constructora;

public class Departamento implements Serializable{
    private Propietario prop2;//Instanciamos una variable de tipo propietario
    private double precioXCuadra2;
    private double metrosCua2;
    private double valorAlicuotaMes;
    private double costoTotal2;
    private Barrio barr2;//Instanciamos una variable de tipo barrio
    private Ciudad ciud2;//Instanciamos una variable de tipo ciudad
    private String nomEdificio;
    private String ubiEdificio;
    private Constructora construc2;//Instanciamos una variable de tipo constructora
    
    //Constructores..

    public Departamento(Propietario p, double pre, double me, double v,
            Barrio bar, Ciudad ci, String n, String u, 
            Constructora con) {
        prop2 = p;
        precioXCuadra2 = pre;
        metrosCua2 = me;
        valorAlicuotaMes = v;
        barr2 = bar;
        ciud2 = ci;
        nomEdificio = n;
        ubiEdificio = u;
        construc2 = con;
    }
    
    
    //Los establecer de los atributos
    public void establecerPropietario(Propietario p){
        prop2 = p;
    }
    public void establecerPrecioXCuadra2(double c){
        precioXCuadra2 = c;
    }
    public void establecerMetrosCua2(int c){
        metrosCua2 = c;
    }
    public void establecerValorAlicuotaMes(double c){
        valorAlicuotaMes = c;
    }
    public void calcularCostoTotal2(){
        costoTotal2 = (metrosCua2 * precioXCuadra2)
                + (valorAlicuotaMes * 12);   
    }
    public void establecerBarr2(Barrio c){
        barr2 = c;
    }
    public void establecerCiud2(Ciudad c){
        ciud2 = c;
    }
    public void establecerNomEdificio(String c){
        nomEdificio = c;
    }
    public void establecerUbiEdificio(String c){
        ubiEdificio = c;
    }
    public void establecerConstruc2(Constructora c){
        construc2 = c;
    }
    
    //Los obtener de los atributos
    public Propietario obtenerProp2(){
       return prop2; 
    }
    public double obtenerPrecioXCuadra2(){
        return precioXCuadra2;
    }
    public double obtenerMetrosCua2(){
        return metrosCua2;
    }
    public double obtenerValorAlicuotaMes(){
        return valorAlicuotaMes;
    }
    public double obtenerCostoTotal2(){
        return costoTotal2;
    }
    public Barrio obtenerBarr2(){
        return barr2;
    }
    public Ciudad obtenerCiud2(){
        return ciud2;
    }
    public String obtenerNombEdificio(){
        return nomEdificio;
    }
    public String obtenerUbiEdificio(){
        return ubiEdificio;
    }
    public Constructora obtenerConstruc2(){
        return construc2;
    }
    //Metodo toString

    @Override
    public String toString() {
        String ca = "DEPARTAMENTOS\n";
//        for (int i = 0; i < obtenerDepartamento().size(); i++) {
//            Departamento c = obtenerDepartamento().get(i);
//            ca = String.format("%s(%d) Propietario: \t\t[%s]\n"
//                    + "Precio por metro cuadrado:  %s\n"
//                    + "Numero de metros cuadrados: %s\n"
//                    ,ca//tengo que especificar que se mostrara!!!
//                    ,i + 1
//                    ,c.obtenerProp2().toString()
//                    ,c.obtenerPrecioXCuadra2()
//                    ,
//            );
//        }

        

        return ca;
    }
    
}
