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
public class clsDetalleVenta {
    
    private int codigo;
    private int idVenta;
    private int idCliente;
    private int idProducto;
    private double precio;
    private int cantidad;
    private double subtotal;    

    public clsDetalleVenta() {
    }

    public clsDetalleVenta(int codigo, int idVenta, int idCliente, int idProducto, double precio, int cantidad, double subtotal) {
        this.codigo = codigo;
        this.idVenta = idVenta;
        this.idCliente = idCliente;
        this.idProducto = idProducto;
        this.precio = precio;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }       
    
}
