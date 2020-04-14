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
public class clsVenta {
    
    private int codigo;
    private int idCliente;
    private String fecha;    
    private double total;    
    private int estado;
    private int idUsuario;

    public clsVenta() {
    }

    public clsVenta(int codigo, int idCliente, String fecha, double total, int estado, int idUsuario) {
        this.codigo = codigo;
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.total = total;
        this.estado = estado;
        this.idUsuario = idUsuario;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public double getTotal() {
        return total;
    }

    public int getEstado() {
        return estado;
    }

    public int getIdUsuario() {
        return idUsuario;
    }
    
       
}
