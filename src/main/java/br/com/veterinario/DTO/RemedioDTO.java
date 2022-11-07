package br.com.veterinario.DTO;

import br.com.veterinario.entity.RemedioEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RemedioDTO {
    private String descricao;
    private long idConsulta;

    public RemedioDTO(RemedioEntity remedio){
        this.descricao = remedio.getDescricao();
        this.idConsulta = remedio.getConsulta().getId();
    }
}
