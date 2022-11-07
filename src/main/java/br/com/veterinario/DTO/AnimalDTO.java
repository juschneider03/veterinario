package br.com.veterinario.DTO;

import br.com.veterinario.entity.AnimalEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimalDTO {
    private String nome;
    private String tipo;
    private Long idPessoa;

    public AnimalDTO(AnimalEntity animal){
        this.nome = animal.getNome();
        this.tipo = animal.getTipo();
        this.idPessoa = animal.getResponsavel().getId();
    }
}
