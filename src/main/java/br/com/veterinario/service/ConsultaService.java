package br.com.veterinario.service;

import br.com.veterinario.DTO.ConsultaDTO;
import br.com.veterinario.entity.ConsultaEntity;
import br.com.veterinario.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConsultaService {
    @Autowired
    private ConsultaRepository consultaRepository;

    public void  salvarConsulta(ConsultaEntity consultaEntity){consultaRepository.save(consultaEntity);}

    public List<ConsultaDTO> buscarTodasConsultas(){
        List<ConsultaEntity> consultas = consultaRepository.findAll();

        List<ConsultaDTO> consultaDTOS = consultas.stream().map(consulta ->
                new ConsultaDTO(consulta)).collect(Collectors.toList());
        return consultaDTOS;
    }
}
