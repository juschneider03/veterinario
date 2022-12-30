package br.com.veterinario.controller;

import br.com.veterinario.DTO.PessoaDTO;
import br.com.veterinario.entity.PessoaEntity;
import br.com.veterinario.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PessoaRestController {

    @Autowired
    private PessoaService pessoaService;

    @GetMapping(value = "/pessoas")
    public List<PessoaDTO> buscarTodasPessoas() {
        return pessoaService.buscarTodasPessoas();
    }

    @PostMapping(value = "/pessoa")
    public void salvarPessoa(@RequestBody PessoaEntity pessoaEntity) {
        pessoaService.salvarPessoa(pessoaEntity);
    }

    @DeleteMapping(value = "/{idPessoa}")
    public void deletarPessoa(Long idPessoa){ pessoaService.deletarPessoa(idPessoa);}
}
