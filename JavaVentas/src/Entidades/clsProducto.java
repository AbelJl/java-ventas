/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Abel
 */
public class clsProducto { 
    
    private int codigo;
    private String descripcion;
    private int categoria;
    private int unidad;
    private double precio;
    private int stock;
    private int estado;

    public clsProducto() {
    }

    public clsProducto(int codigo, String descripcion, int categoria, int unidad, double precio, int stock, int estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.unidad = unidad;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCategoria() {
        return categoria;
    }

    public int getUnidad() {
        return unidad;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public int getEstado() {
        return estado;
    }
    
}
