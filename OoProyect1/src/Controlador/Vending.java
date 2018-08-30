/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Moneda;
import Modelo.Producto;
import Modelo.Venta;
import Vista.PantallaVending;
import java.util.ArrayList;
import java.time.*;
import java.util.Date;

/**
 *
 * @author rodri
 */
public class Vending 
{
    /**
     * Lista del dinero ingresado por el comprador
     */
    private ArrayList<Moneda> dineroAcumulado;
    /**
     * Lista que contiene el catalogo de los productos
     */
    private ArrayList<Producto> catalogo;
    /**
     * Relación con el entity de venta
     */
    private Venta ventaActual;
    private ArrayList<Venta> ventasRealizadas;
    private int numeroDeVentasDeHoy =0;
    /**
     * Relación con controlador Gestion de producto
     */
    private GestionProducto gestion;
    
    
    /**
     * Relación con la pantallaVending
     */
    private PantallaVending Pantalla;
    

    public Vending() 
    {
        this.dineroAcumulado = gestion.darListaDeMonedas() ;
        this.catalogo = gestion.darNuevaListaDeProductos();
        this.ventasRealizadas = new ArrayList<>();
        this.ventaActual = new Venta(null, null, null, null);
        
        ventaActual = new Venta();
        Pantalla = new PantallaVending();

        int opcionProductos = Pantalla.mostrarMenu();

        while (opcionProductos != 0) 
        {
            seleccionarOpcion(opcionProductos);
            opcionProductos = Pantalla.mostrarMenu();
        }
    }
    
    
    /**
     * Crea una nueva venta y la agrega al numero de ventas de hoy
     * @return False si no hay ningun producto disponible para vender, True si si existe producto para vender y crea una nueva venta con la fecha de hoy
     * 
     */
    boolean crearNuevaVenta(){
        int numeroDeProductosDisponibles = 0;
        for(int i=0; i<catalogo.size(); i++){
            numeroDeProductosDisponibles = numeroDeProductosDisponibles + this.catalogo.get(i).getUnidadesDisponibles();
        }
        if(numeroDeProductosDisponibles==0){
            return false;
        }
        else{
            LocalDate fechaDeVenta = LocalDate.now();
        Date fecha =  Date.from(fechaDeVenta.atStartOfDay(ZoneId.systemDefault()).toInstant());
        this.ventaActual.setFechaHora(fecha);
        int denominacion=-1;
        recibirMonedas(denominacion);
      
        
        ventasRealizadas.add(ventaActual);
        numeroDeVentasDeHoy++;
            return true; 
        }
        
    }
    /**
     * 
     * @param denominacion Denominacion de la moneda ingresada por el usuario
     * @return El nuevo numero de la cantidad de monedas de esa denominacion o -1 si esa denominacion no existe
     */
    int recibirMonedas(int denominacion){
        int denominacionDeMonedaExistente =-1;
        for(int i=0; i<this.ventaActual.getPagoMoneda().size(); i++){
           denominacionDeMonedaExistente= this.ventaActual.getPagoMoneda().get(i).getDenominacion();
           if(denominacion==denominacionDeMonedaExistente){
               this.ventaActual.getPagoMoneda().get(i).agregarUnoALaCantidad();
               
               return this.ventaActual.getPagoMoneda().get(i).getCantidad();
           }
        }
        return -1;
    }
    
}
