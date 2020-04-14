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
public class clsProveedor {
    
    private int codigo;
    private String descripcion;
    private int estado;

    public clsProveedor() {
    }

    public clsProveedor(int codigo, String descripcion, int estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getEstado() {
        return estado;
    }    
        
}
