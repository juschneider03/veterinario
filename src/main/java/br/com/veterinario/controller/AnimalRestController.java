package br.com.veterinario.controller;

import br.com.veterinario.entity.AnimalEntity;
import br.com.veterinario.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnimalRestController {

    @Autowired
    private AnimalService animalService;

    @PostMapping(value = "/animal")
    public void salvarAnimal(@RequestBody AnimalEntity animalEntity) {
        animalService.salvarAnimal(animalEntity);
    }
}
