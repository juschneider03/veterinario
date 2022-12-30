package br.com.veterinario.controller;

import br.com.veterinario.DTO.AnimalDTO;
import br.com.veterinario.entity.AnimalEntity;
import br.com.veterinario.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnimalRestController {

    @Autowired
    private AnimalService animalService;

    @PostMapping(value = "/animal")
    public void salvarAnimal(  AnimalEntity animalEntity) {
        animalService.salvarAnimal(animalEntity);
    }

    @GetMapping(value = "/clinicas")
    public List<AnimalDTO> buscarTodosAnimais() {
        return animalService.buscarTodosAnimais();
    }

    @DeleteMapping(value = "/{idAnimal}")
    public void deletarAnimal (@PathVariable Long idAnimal){
        animalService.deletarAnimal(idAnimal);
    }
}
