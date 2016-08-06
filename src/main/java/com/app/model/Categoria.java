

/// driverClass    com.mysql.jdbc.Driver


package com.app.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// JPA nos permite tener un reflejo de nuestras tablas en entidades o clases
@Entity // le indicamos que esto es una entidad
@Table(name ="categoria")

public class Categoria implements  Serializable{ // no olvidar la interface Serializable
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //
    private int codigo;
    
    @Column(name = "nombre") // se le indica el nombre que tiene en la base de datos pude ser diferente de el nombre del entity
    private String nombre;
    
    @Column(name = "estado")
    private boolean estado = true;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.codigo;
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
        final Categoria other = (Categoria) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Categoria{" + "codigo=" + codigo + '}';
    }
    
    
            
    
}
