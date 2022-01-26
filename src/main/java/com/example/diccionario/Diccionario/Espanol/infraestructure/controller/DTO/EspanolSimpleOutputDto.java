package com.example.diccionario.Diccionario.Espanol.infraestructure.controller.DTO;

import com.example.diccionario.Diccionario.Espanol.domain.Espanol;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class EspanolSimpleOutputDto {
    private  int id;
    private  String palabra;
    private  String descripcion;
    private Date fecha_alta ;
    private Date fecha_modif ;

    public EspanolSimpleOutputDto(int id, String palabra, String descripcion, Date fecha_alta, Date fecha_modif) {
        this.id = id;
        this.palabra = palabra;
        this.descripcion = descripcion;
        this.fecha_alta = fecha_alta;
        this.fecha_modif = fecha_modif;
    }
    public EspanolSimpleOutputDto(EspanolInputDto espanolInputDto) {

        this.palabra = espanolInputDto.getPalabra();
        this.descripcion = espanolInputDto.getDescripcion();
        this.fecha_alta = new Date();
        this.fecha_modif = null;
    }

    public EspanolSimpleOutputDto(Espanol espanolo) {
        this.id = espanolo.getId();
        this.palabra = espanolo.getPalabra();
        this.descripcion = espanolo.getDescripcion();
        this.fecha_alta = espanolo.getFecha_alta();
        this.fecha_modif = espanolo.getFecha_modif();
    }

    public int getId() {
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
}
