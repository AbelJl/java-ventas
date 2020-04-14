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
public class clsCliente {
    
    private int codigo;
    private String Nombre;
    private String apellidos;
    private String dni;
    private int sexo;
    private String telefono;    
    private String direccion;
    private int estado;

    public clsCliente() {
    }

    public clsCliente(int codigo, String Nombre, String apellidos, String dni, int sexo, String telefono, String direccion, int estado) {
        this.codigo = codigo;
        this.Nombre = Nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.sexo = sexo;
        this.telefono = telefono;
        this.direccion = direccion;
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

    public String getDni() {
        return dni;
    }

    public int getSexo() {
        return sexo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getEstado() {
        return estado;
    }    
     
}
