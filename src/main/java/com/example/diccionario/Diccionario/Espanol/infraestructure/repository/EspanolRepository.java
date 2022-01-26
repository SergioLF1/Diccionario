package com.example.diccionario.Diccionario.Espanol.infraestructure.repository;

import com.example.diccionario.Diccionario.Espanol.domain.Espanol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EspanolRepository extends JpaRepository<Espanol, Number> {
     Espanol findByPalabra (String palabra);//ToDo arreglar
     List<Espanol> findAll ();
    //Espanol save (Espanol espanol);
    //Espanol update (EspanolInputDto espanolInputDto);
     //void delete (Espanol espanolOutputDto);
}
