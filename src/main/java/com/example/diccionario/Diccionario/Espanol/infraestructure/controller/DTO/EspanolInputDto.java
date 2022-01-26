package com.example.diccionario.Diccionario.Espanol.infraestructure.controller.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class EspanolInputDto {


    private  String palabra;
    private  String descripcion;
}
