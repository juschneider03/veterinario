package br.com.veterinario.service;

import br.com.veterinario.DTO.PessoaDTO;
import br.com.veterinario.entity.PessoaEntity;
import br.com.veterinario.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<PessoaDTO> buscarTodasPessoas() {
        List<PessoaEntity> pessoas = pessoaRepository.findAll();

        //Convertendo uma lista de pessoa
        List<PessoaDTO> pessoasDTO = pessoas.stream().map(pessoa ->
                new PessoaDTO(pessoa)
        ).collect(Collectors.toList());
        return pessoasDTO;
    }

    public void salvarPessoa(PessoaEntity pessoaEntity){
        pessoaRepository.save(pessoaEntity);
    }


}
