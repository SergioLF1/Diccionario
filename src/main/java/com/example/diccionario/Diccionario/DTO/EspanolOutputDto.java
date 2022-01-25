package com.example.diccionario.Diccionario.DTO;

import com.example.diccionario.Diccionario.Model.Espanol;

import java.util.Date;
import java.util.List;

public class EspanolOutputDto {
    private Number id;
    private String palabra;
    private String descripcion;
    private Date fecha_alta ;
    private Date fecha_modif ;
    //List<InglesSimpleOutputDto> palabrasIngles;

    public EspanolOutputDto(Number id, String palabra, String descripcion, Date fecha_alta, Date fecha_modif/* ,List<InglesSimpleOutputDto> palabrasIngles*/) {
        this.id = id;
        this.palabra = palabra;
        this.descripcion = descripcion;
        this.fecha_alta = fecha_alta;
        this.fecha_modif = fecha_modif;
        //this.palabrasIngles = palabrasIngles;
    }

    public EspanolOutputDto(Espanol espanol) {
        this.id = espanol.getId();
        this.palabra = espanol.getPalabra();
        this.descripcion = espanol.getDescripcion();
        this.fecha_alta = espanol.getFecha_alta();
        this.fecha_modif = espanol.getFecha_modif();
    }
}
