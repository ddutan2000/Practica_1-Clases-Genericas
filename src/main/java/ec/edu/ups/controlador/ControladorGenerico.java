/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Dutan2000
 */
public abstract class ControladorGenerico<T> {
    private List<T> lista;
    private T t;
    

    public ControladorGenerico() {   
        lista=new ArrayList<>();
        
        
    }
    
    public void crear(T objeto){
        lista.add(objeto);
    }
    
    public T read(Object obj){
        return lista.stream().filter(tipo-> tipo.equals(obj)).findFirst().get();
    }
    public void update(T objeto){
        for (int i = 0; i < lista.size(); i++) {
            T nuevo=lista.get(i);
            if (nuevo.equals(objeto)){
                lista.add(i, objeto);
            }
        }

    }
    
    public void delete(T objeto){
        Iterator<T> it =lista.iterator();
        while (it.hasNext()) {
             T u = it.next();
            if(u.equals(objeto)){
                it.remove();
                break;
            }
            
        }
    }
    
    public List<T> findAll(){
        return lista;
    }
    
    public T encontrarObjeto(){
        return t;
    }
}
