/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.*;
import java.util.Collection;
import java.util.List;


/**
 *
 * @author Dutan2000
 */
public class ControladorUsuario1 extends ControladorGenerico<Usuario>{
    private Telefono telefono;
    private Usuario usuario;
    private ControladorGeneral controladorT;
    private List<Usuario> listaDeUsuarios;


    public ControladorUsuario1(ControladorGeneral controladorG) {
        controladorT=controladorG;
        this.listaDeUsuarios = super.findAll();
    }



    @Override
    public void update(Usuario objeto) {
        for (int i = 0; i < listaDeUsuarios.size(); i++) {
            Usuario u = listaDeUsuarios.get(i);
            if (u.getCedula().equals(objeto.getCedula())) {
                listaDeUsuarios.set(i, objeto);
                this.usuario=objeto;
                break;
                
            }
        } 
    }
 
    public Usuario verUsuario(){
        return usuario;
    }
    public Usuario autenticar(String correo, String contrasenia){
        for (Usuario usuario : listaDeUsuarios) {
            if(usuario.getCorreo().equals(correo)&&usuario.getContrasenia().equals(contrasenia)){
                this.usuario=usuario;
                return usuario;
            }
        }
        return null;
    }
    
    public void crearTelefono(Telefono telefono){
        usuario.crearTelefono(telefono);
        listaDeUsuarios.add(usuario);
        
    }
    public void modificarTelefono(Telefono telefono){
        usuario.modificarTelefono(telefono);
        update(usuario);
        
    }
    
    public void eliminarTelefono(int codigo){
        telefono= controladorT.buscarTelefono(codigo);
        usuario.eliminarTelefono(telefono);
        update(usuario);
    }
    
    public Telefono buscarTelefono(int codigo){
        telefono=usuario.buscarTelefono(codigo);
        return telefono;
    }
    
    public Collection<Telefono>listarTelefonos(){
        return usuario.listarTelefono();
    }
    
}
