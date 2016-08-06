
package com.app.controller;

import com.app.ejb.CategoriaFacadeLocal;
import com.app.model.Categoria;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;


@Named // para la inyeccion de dependencia
@ViewScoped // el ambito de la clase
public class CategoriaController implements Serializable{
    
    // inyectamos el ejb
    @EJB
    private CategoriaFacadeLocal categoriaEJB;
    private Categoria categoria; // los pojos se puedne inyectar apoyado en spring

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
    
    @PostConstruct
    public void init(){
        
        categoria = new Categoria();
    }
    
    public void registrar(){
        try {
            categoriaEJB.create(categoria);
        } catch (Exception e) {
            
        }
    }
}
