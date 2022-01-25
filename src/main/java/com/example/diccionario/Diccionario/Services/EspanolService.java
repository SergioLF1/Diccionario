package com.example.diccionario.Diccionario.Services;

import com.example.diccionario.Diccionario.DTO.EspanolOutputDto;
import com.example.diccionario.Diccionario.DTO.EspanolSimpleOutputDto;
import com.example.diccionario.Diccionario.DTO.EspanolInputDto;
import com.example.diccionario.Diccionario.Model.Espanol;

import java.io.IOException;
import java.util.List;

public interface EspanolService {
    public Espanol saveEspanol(EspanolInputDto espanolInputDto);
    public Object updateEspanol(String palabra,EspanolInputDto espanolInputDto) throws IOException;
    public EspanolOutputDto buscarEspanol(String palabra);
    public List<EspanolOutputDto>buscarEspanol();
    public void deleteEspanol(String palabra);
}
