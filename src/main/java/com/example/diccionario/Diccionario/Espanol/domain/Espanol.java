package com.example.diccionario.Diccionario.Espanol.domain;

import com.example.diccionario.Diccionario.Espanol.infraestructure.controller.DTO.EspanolInputDto;
import com.sun.istack.NotNull;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Component
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Espanol")
public class Espanol {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id ;

    @NotNull
    @Column(name = "palabra", unique = true)
    private String palabra;
    private String descripcion;

    @NotNull
    private Date fecha_alta ;
    private Date fecha_modif ;
    private boolean activo ;


    public Espanol(EspanolInputDto espanolInputDto) {
        this.palabra = espanolInputDto.getPalabra();
        this.descripcion = espanolInputDto.getDescripcion();
        this.fecha_alta = new Date();
        this.fecha_modif = null;
        this.activo = true;
    }




}
