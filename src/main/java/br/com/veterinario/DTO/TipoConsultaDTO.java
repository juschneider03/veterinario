package br.com.veterinario.DTO;

import br.com.veterinario.entity.TipoConsultaEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TipoConsultaDTO {
    private String nome;
    private String categoria;
    private BigDecimal valorSugerido;

    public TipoConsultaDTO(TipoConsultaEntity tipoConsulta){
        this.nome = tipoConsulta.getNome();
        this.categoria = tipoConsulta.getCategoria();
        this.valorSugerido = tipoConsulta.getValorSugerido();
    }
}
