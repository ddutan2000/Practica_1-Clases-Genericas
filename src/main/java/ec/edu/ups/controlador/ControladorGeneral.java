/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.modelo.Telefono;
import java.util.List;


/**
 *
 * @author Dutan2000
 */
public class ControladorGeneral extends ControladorGenerico<Telefono>{
    private Telefono telefono;
    private List<Telefono> listaTelefonos;
    private int codigo;
    

    public ControladorGeneral() {
        this.listaTelefonos = super.findAll();
        this.codigo = 0;
        
    }

    public Telefono buscarTelefono(int cod){
    for (Telefono telefono : listaTelefonos) {
            if(telefono.getCodigo()==cod){
                return telefono;
                
            }
            
        }
        return null;
    }

    @Override
    public void update(Telefono objeto) {
        for (int i = 0; i < listaTelefonos.size(); i++) {
            Telefono t = listaTelefonos.get(i);
            if (t.getCodigo()==objeto.getCodigo()) {
                listaTelefonos.set(i, objeto);
                this.telefono=objeto;
                break;
                
            }
        }   
    }
    
    public int obtenerCodigo(){
        int ultimoCodigo=++codigo;
        return ultimoCodigo;
    }
}
