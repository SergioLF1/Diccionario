package com.example.diccionario.Diccionario.Model;

import com.example.diccionario.Diccionario.DTO.EspanolInputDto;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Component
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Espanol")
public class Espanol {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id ;

    @NotNull
    private String palabra;
    private String descripcion;

    @NotNull
    private Date fecha_alta ;
    private Date fecha_modif ;
    private boolean activo ;


    public Espanol(EspanolInputDto espanolInputDto) {
        this.palabra = palabra;
        this.descripcion = descripcion;
        this.fecha_alta = new Date();
        this.fecha_modif = null;
        this.activo = true;
    }

    public Number getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public Date getFecha_modif() {
        return fecha_modif;
    }

    public void setFecha_modif(Date fecha_modif) {
        this.fecha_modif = fecha_modif;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }


}
