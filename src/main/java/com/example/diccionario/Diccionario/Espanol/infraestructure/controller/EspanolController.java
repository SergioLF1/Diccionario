package com.example.diccionario.Diccionario.Espanol.infraestructure.controller;

import com.example.diccionario.Diccionario.Espanol.infraestructure.controller.DTO.EspanolOutputDto;
import com.example.diccionario.Diccionario.Espanol.infraestructure.controller.DTO.EspanolInputDto;
import com.example.diccionario.Diccionario.Espanol.domain.Espanol;
import com.example.diccionario.Diccionario.Espanol.infraestructure.controller.DTO.EspanolSimpleOutputDto;
import com.example.diccionario.Diccionario.Espanol.infraestructure.repository.EspanolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;
@CrossOrigin(origins = "http://localhost:5432")
@RestController()
@RequestMapping("/espanol")
public class EspanolController {

    @Autowired
    private EspanolService espanolService;

    //GetOne
    @GetMapping("/{palabra}")
    public EspanolOutputDto getOne(@PathVariable("palabra") String palabra)
    {
        return espanolService.buscarEspanol(palabra);
    }

    //GetAll
    @GetMapping()
    public List<EspanolOutputDto> getAll()
    {
        return espanolService.buscarEspanol();
    }

    //Post
    @PostMapping()
    public EspanolSimpleOutputDto anadir(@RequestBody EspanolInputDto espanolInputDto)
    {
        EspanolSimpleOutputDto simpleOutputDto= new EspanolSimpleOutputDto (espanolService.saveEspanol(espanolInputDto));
        return simpleOutputDto;
    }

    //Put
    @PutMapping("/{palabra}")
    public Object updateEspanol(@PathVariable("palabra") String palabra,@RequestBody EspanolInputDto espanolInputDto) throws IOException
    {
        EspanolSimpleOutputDto simpleOutputDto= new EspanolSimpleOutputDto((Espanol) espanolService.updateEspanol(palabra,espanolInputDto));
        return simpleOutputDto;
    }

    //Delete
    @DeleteMapping("/{palabra}")
    public void borrar(@PathVariable("palabra")String palabra)
    {
        espanolService.deleteEspanol(palabra);
    }
}
