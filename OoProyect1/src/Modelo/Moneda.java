/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author rodri
 */
public class Moneda {
    private int denominacion;
    private int cantidad;
    
    
    public Moneda(int denominacion, int cantidad){
        this.denominacion = denominacion;
        this.cantidad = cantidad;
        

    }

    public int getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(int denominacion) {
        this.denominacion = denominacion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void agregarUnoALaCantidad() {
        this.cantidad++;
    }
    
}
