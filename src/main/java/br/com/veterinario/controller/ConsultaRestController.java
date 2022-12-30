package br.com.veterinario.controller;

import br.com.veterinario.DTO.ConsultaDTO;
import br.com.veterinario.entity.ConsultaEntity;
import br.com.veterinario.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsultaRestController {
    @Autowired
    private ConsultaService consultaService;

    @PostMapping(value = "/consulta")
    public void salvarConsulta(ConsultaEntity consultaEntity){
        consultaService.salvarConsulta(consultaEntity);
    }

    @GetMapping(value = "/consultas")
    public List<ConsultaDTO> buscarTodasConsultas(){
        return consultaService.buscarTodasConsultas();
    }
}
