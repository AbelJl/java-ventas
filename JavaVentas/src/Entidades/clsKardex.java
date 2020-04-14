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
public class clsKardex {
    
    private int codigo;
    private int idProveedor;
    private int idProducto;
    private String fechaVencimiento;
    private int cantidad;
    private double costo;
    private String fechaEntrada;
    private int idUsuario;  

    public clsKardex() {
    }

    public clsKardex(int codigo, int idProveedor, int idProducto, String fechaVencimiento, int cantidad, double costo, String fechaEntrada, int idUsuario) {
        this.codigo = codigo;
        this.idProveedor = idProveedor;
        this.idProducto = idProducto;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidad = cantidad;
        this.costo = costo;
        this.fechaEntrada = fechaEntrada;
        this.idUsuario = idUsuario;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getCosto() {
        return costo;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public int getIdUsuario() {
        return idUsuario;
    }
           
}
