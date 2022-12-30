package br.com.veterinario.service;

import br.com.veterinario.DTO.RemedioDTO;
import br.com.veterinario.entity.RemedioEntity;
import br.com.veterinario.repository.RemedioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RemedioService {
    @Autowired
    private RemedioRepository remedioRepository;

    public void salvarRemedio(RemedioEntity remedioEntity) {
        remedioRepository.save(remedioEntity);
    }

    public List<RemedioDTO> buscartTodosRemedios() {
        List<RemedioEntity> remedios = remedioRepository.findAll();

        List<RemedioDTO> remediosDTO = remedios.stream().map(remedio ->
                new RemedioDTO(remedio)).collect(Collectors.toList());
        return remediosDTO;
    }

    public void deletarRemedio(Long idRemedio) {
        RemedioEntity remedio = new RemedioEntity();
        remedio.setId(idRemedio);
        remedioRepository.delete(remedio);
    }
}