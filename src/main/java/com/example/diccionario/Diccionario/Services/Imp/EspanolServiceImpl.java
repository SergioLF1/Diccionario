package com.example.diccionario.Diccionario.Services.Imp;

import com.example.diccionario.Diccionario.DTO.EspanolOutputDto;
import com.example.diccionario.Diccionario.DTO.EspanolSimpleOutputDto;
import com.example.diccionario.Diccionario.DTO.EspanolInputDto;
import com.example.diccionario.Diccionario.Model.Espanol;
import com.example.diccionario.Diccionario.Repository.EspanolRepository;
import com.example.diccionario.Diccionario.Services.EspanolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class EspanolServiceImpl implements EspanolService {

    @Autowired
    private EspanolRepository espanolRepository;

    @Override
    public Espanol saveEspanol(@RequestBody EspanolInputDto espanolInputDto) {
        Espanol espanol = new Espanol(espanolInputDto);
        return espanolRepository.save(espanol);
    }

    @Override
    public Object updateEspanol(@PathVariable("palabra") String palabra,@RequestBody EspanolInputDto espanolInputDto) throws IOException {
        Optional<Espanol> espanol= Optional.ofNullable(espanolRepository.findByPalabra(palabra));
        if (espanol.isPresent()){
            Espanol espanol1=espanol.get();
            espanol1.setDescripcion(espanolInputDto.getDescripcion());
            espanol1.setPalabra(espanolInputDto.getPalabra());
            espanol1.setFecha_modif(new Date());
            espanolRepository.save(espanol1);
            return espanol1;
        }else{
            return ResponseEntity.status(401).build();
        }
    }

    @Override
    public EspanolOutputDto buscarEspanol(@PathVariable String palabra) {
        Espanol espanol=espanolRepository.findByPalabra(palabra);
        return new EspanolOutputDto(espanolRepository.findByPalabra(palabra));
    }

    @Override
    public List<EspanolOutputDto> buscarEspanol() {
        List<Espanol> list = espanolRepository.findAll();
        List<EspanolOutputDto> list1 =new ArrayList<>();
        EspanolOutputDto outputDto;
        for (Espanol espanol: list) {
            outputDto=new EspanolOutputDto(espanol);
            list1.add(outputDto);
        }
        return list1;
    }

    @Override
    public void deleteEspanol(String palabra) {
        espanolRepository.delete(espanolRepository.findByPalabra(palabra));
    }
}
