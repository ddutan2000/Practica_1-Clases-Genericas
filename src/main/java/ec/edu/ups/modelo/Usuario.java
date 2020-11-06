/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Dutan2000
 */
public class Usuario {
    private String cedula;
    private String nombre;
    private String apellido;
    private String correo;
    private String contrasenia;
    private List<Telefono> listaDeTelefonos;

    public Usuario() {
        listaDeTelefonos=new ArrayList<>();
        
    }

    public Usuario(String cedula, String nombre, String apellido, String correo, String contrasenia) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.contrasenia = contrasenia;
        listaDeTelefonos=new ArrayList<>();
        
    }

    public Usuario(String cedula) {
        this.cedula=cedula;

    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
    public void crearTelefono(Telefono telefono){
        listaDeTelefonos.add(telefono);
    }
    
    public void modificarTelefono(Telefono telefono){
        int index=listaDeTelefonos.indexOf(telefono);
        listaDeTelefonos.set(index, telefono);
    }
    
    public Telefono buscarTelefono(int codigo){
        return listaDeTelefonos.get(codigo);
    }
    
    public void eliminarTelefono(Telefono telefono){
        int index=listaDeTelefonos.indexOf(telefono);
        listaDeTelefonos.remove(index);
    }
    
    public List<Telefono> listarTelefono(){
        return listaDeTelefonos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.cedula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.cedula, other.cedula)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Usuario{" + "cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", contrasenia=" + contrasenia + ", listaDeTelefonos=" + listaDeTelefonos + '}';
    }
    
    
    
    
}
