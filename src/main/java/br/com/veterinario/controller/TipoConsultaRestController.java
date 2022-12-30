package br.com.veterinario.controller;

import br.com.veterinario.DTO.TipoConsultaDTO;
import br.com.veterinario.entity.TipoConsultaEntity;
import br.com.veterinario.service.TipoConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TipoConsultaRestController {
    @Autowired
    private TipoConsultaService tipoConsultaService;

    @PostMapping(value = "/tipoConsulta")
    public void salvarTipoConsulta(TipoConsultaEntity  tipoConsultaEntity){
        tipoConsultaService.salvarTipoConsulta(tipoConsultaEntity);
    }

    @GetMapping(value = "/tiposConsulta")
    public List<TipoConsultaDTO> buscarTodosTipoConsulta(){
        return tipoConsultaService.buscarTodosTiposConstulta();
    }
}
