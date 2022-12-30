package br.com.veterinario.service;

import br.com.veterinario.DTO.ClinicaDTO;
import br.com.veterinario.entity.ClinicaEntity;
import br.com.veterinario.repository.ClinicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClinicaService {

    @Autowired
    private ClinicaRepository clinicaRepository;

    public void salvarClinica(ClinicaEntity clinicaEntity) {clinicaRepository.save(clinicaEntity);}

    public List<ClinicaDTO> buscarTodasClinicas(){
        List<ClinicaEntity> clinicas = clinicaRepository.findAll();

        List<ClinicaDTO> clinicasDTO = clinicas.stream().map(clinica ->
                new ClinicaDTO(clinica)
        ).collect(Collectors.toList());
        return clinicasDTO;
    }

    public void deletarClinica(Long idClinica){
        ClinicaEntity clinica = new ClinicaEntity();
        clinica.setId(idClinica);
        clinicaRepository.delete(clinica);
    }
}
