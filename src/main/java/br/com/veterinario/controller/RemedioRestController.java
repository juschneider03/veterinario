package br.com.veterinario.controller;

import br.com.veterinario.DTO.RemedioDTO;
import br.com.veterinario.entity.RemedioEntity;
import br.com.veterinario.service.RemedioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RemedioRestController {
    @Autowired
    private RemedioService remedioService;

    @PostMapping(value = "/remedio")
    public void salvarRemedio(RemedioEntity remedioEntity){
        remedioService.salvarRemedio(remedioEntity);
    }

    @GetMapping(value = "/remedios")
    public List<RemedioDTO> buscarTodosRemedios(){
        return remedioService.buscartTodosRemedios();
    }
}
