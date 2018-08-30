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
public class Producto {
    private String Nombre;
    private int unidadesDisponibles;
    private double precio;
    private  ArrayList<Adicional> adicionalesProducto;
    private ArrayList<Producto> obsequios;
    

    public Producto(String Nombre, int unidadesDisponibles, double precio, ArrayList<Adicional> adicionalesProducto, ArrayList<Producto> obsequios) {
        this.Nombre = Nombre;
        this.unidadesDisponibles = unidadesDisponibles;
        this.precio = precio;
        this.adicionalesProducto = adicionalesProducto;
        this.obsequios = obsequios;
        
    }
//este constructor es para los obsequios
    public Producto(String Nombre, int unidadesDisponibles, double precio, ArrayList<Adicional> adicionalesProducto) {
        this.Nombre = Nombre;
        this.unidadesDisponibles = unidadesDisponibles;
        this.precio = precio;
        this.adicionalesProducto = adicionalesProducto;
        this.obsequios=new ArrayList<Producto>(0); 
    }
    //este constructor es para los productos antes de los adicionales

    public Producto(String Nombre, double precio, int unidadesDisponibles) {
        this.Nombre = Nombre;
        this.precio = precio;
        this.unidadesDisponibles= unidadesDisponibles;
    }
    //este constructor es para los obsequios
    public Producto(String Nombre){
        this.Nombre=Nombre;
        this.precio=0.0;
        this.obsequios= new ArrayList<>(0);
    }
    
   

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Producto> getObsequios() {
        return obsequios;
    }

    public void setObsequios(ArrayList<Producto> obsequios) {
        this.obsequios = obsequios;
    }

    public ArrayList<Adicional> getAdicionalesProducto() {
        return adicionalesProducto;
    }

    public void setAdicionalesProducto(ArrayList<Adicional> adicionalesProducto) {
        this.adicionalesProducto = adicionalesProducto;
    }

    

     
}
