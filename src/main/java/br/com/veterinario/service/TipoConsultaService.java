package br.com.veterinario.service;

import br.com.veterinario.DTO.TipoConsultaDTO;
import br.com.veterinario.entity.TipoConsultaEntity;
import br.com.veterinario.repository.TipoConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TipoConsultaService {
    @Autowired
    private TipoConsultaRepository tipoConsultaRepository;

    public void salvarTipoConsulta(TipoConsultaEntity tipoConsulta){
        tipoConsultaRepository.save(tipoConsulta);
    }

    public List<TipoConsultaDTO> buscarTodosTiposConstulta(){
        List<TipoConsultaEntity> tiposConsulta = tipoConsultaRepository.findAll();

        List<TipoConsultaDTO> tipoConsultaDTO = tiposConsulta.stream().map(tipoConsulta ->
                new TipoConsultaDTO(tipoConsulta)).collect(Collectors.toList());
        return tipoConsultaDTO;
    }
}
