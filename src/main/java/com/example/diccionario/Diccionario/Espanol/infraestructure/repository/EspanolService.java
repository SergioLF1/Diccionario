package com.example.diccionario.Diccionario.Espanol.infraestructure.repository;

import com.example.diccionario.Diccionario.Espanol.infraestructure.controller.DTO.EspanolOutputDto;
import com.example.diccionario.Diccionario.Espanol.infraestructure.controller.DTO.EspanolInputDto;
import com.example.diccionario.Diccionario.Espanol.domain.Espanol;

import java.io.IOException;
import java.util.List;

public interface EspanolService {
    public Espanol saveEspanol(EspanolInputDto espanolInputDto);
    public Object updateEspanol(String palabra,EspanolInputDto espanolInputDto) throws IOException;
    public EspanolOutputDto buscarEspanol(String palabra);
    public List<EspanolOutputDto>buscarEspanol();
    public void deleteEspanol(String palabra);
}
