package br.com.veterinario.DTO;

import br.com.veterinario.entity.PessoaEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PessoaDTO {
    private Long id;
    private String nome;
    private String email;

    public PessoaDTO(PessoaEntity pessoa){
        this.id = pessoa.getId();
        this.nome = pessoa.getNome();
        this.email = pessoa.getEmail();
    }
}
