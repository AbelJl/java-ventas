/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

public class clsUsuario {
    
    private int codigo;
    private String Nombre;
    private String apellidos;
    private String usuario;
    private String dni;
    private String clave;
    private int estado;

    public clsUsuario() {
    }

    public clsUsuario(int codigo, String Nombre, String apellidos, String usuario, String dni, String clave, int estado) {
        this.codigo = codigo;
        this.Nombre = Nombre;
        this.apellidos = apellidos;
        this.usuario = usuario;
        this.dni = dni;
        this.clave = clave;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getDni() {
        return dni;
    }

    public String getClave() {
        return clave;
    }

    public int getEstado() {
        return estado;
    }
    
    @Override
    public String toString(){
        return this.Nombre + "-" + this.apellidos + "-" + this.usuario + "-" + this.clave;
    }    
}
