package br.com.veterinario.service;

import br.com.veterinario.DTO.AnimalDTO;
import br.com.veterinario.entity.AnimalEntity;
import br.com.veterinario.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    public void salvarAnimal(AnimalEntity animalEntity) {animalRepository.save(animalEntity);}

    public List<AnimalDTO> buscarTodosAnimais(){
        List<AnimalEntity> animais = animalRepository.findAll();

        List<AnimalDTO> animaisDTO = animais.stream().map(animal ->
                new AnimalDTO(animal)
        ).collect(Collectors.toList());
        return animaisDTO;
    }
}
