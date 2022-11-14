package br.com.veterinario.service;

import br.com.veterinario.entity.AnimalEntity;
import br.com.veterinario.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    public void salvarAnimal(AnimalEntity animalEntity) {animalRepository.save(animalEntity);}

}
