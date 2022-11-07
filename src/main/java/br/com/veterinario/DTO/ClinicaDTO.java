package br.com.veterinario.DTO;

import br.com.veterinario.entity.ClinicaEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClinicaDTO {
    private String endereco;
    private String nome;

    public ClinicaDTO(ClinicaEntity clinica){
       this.endereco = clinica.getEndereco();
       this.nome = clinica.getNome();
    }
}
