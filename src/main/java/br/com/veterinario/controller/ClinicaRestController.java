package br.com.veterinario.controller;

import br.com.veterinario.DTO.ClinicaDTO;
import br.com.veterinario.entity.ClinicaEntity;
import br.com.veterinario.service.ClinicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClinicaRestController {

    @Autowired
    private ClinicaService clinicaService;

    @GetMapping(value = "/clinicas")
    public List<ClinicaDTO> buscarTodasClinicas() {
        return clinicaService.buscarTodasClinicas();
    }

    @PostMapping(value = "/clinica")
    public void salvarClinica(@RequestBody ClinicaEntity clinicaEntity) {
        clinicaService.salvarClinica(clinicaEntity);
    }

    @DeleteMapping(value = "/{idClinica}")
    public void deletarClinica(Long idClinica){
        clinicaService.deletarClinica(idClinica);
    }
}
