package com.example.diccionario.Diccionario.Controller;

import com.example.diccionario.Diccionario.DTO.EspanolOutputDto;
import com.example.diccionario.Diccionario.DTO.EspanolSimpleOutputDto;
import com.example.diccionario.Diccionario.DTO.EspanolInputDto;
import com.example.diccionario.Diccionario.Model.Espanol;
import com.example.diccionario.Diccionario.Services.EspanolService;
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

    @GetMapping("/{palabra}")
    public EspanolOutputDto getOne(@RequestParam String palabra)
    {
        return espanolService.buscarEspanol(palabra);
    }

    @GetMapping()
    public List<EspanolOutputDto> getAll()
    {
        return espanolService.buscarEspanol();
    }

    @PostMapping()
    public Espanol anadir(@RequestBody EspanolInputDto espanolInputDto)
    {
        return espanolService.saveEspanol(espanolInputDto);
    }

    @PutMapping("/{palabra}")
    public Object updateEspanol(@PathVariable("palabra") String palabra,@RequestBody EspanolInputDto espanolInputDto) throws IOException
    {
        return espanolService.updateEspanol(palabra,espanolInputDto);
    }

    @DeleteMapping("/{palabra}")
    public void borrar(@RequestParam String palabra)
    {
        espanolService.deleteEspanol(palabra);
    }
}
