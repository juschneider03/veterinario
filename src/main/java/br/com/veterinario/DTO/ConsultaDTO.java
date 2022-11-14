package br.com.veterinario.DTO;

import br.com.veterinario.entity.ConsultaEntity;
import br.com.veterinario.entity.RemedioEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsultaDTO {
    private String observacoes;
    private BigDecimal valor;
    private Long idAnimal;
    private Long idClinicaMedico;
    private Long idTipoConsulta;
    private List<RemedioEntity> remedioConsulta;

    public ConsultaDTO(ConsultaEntity consulta){
        this.observacoes = consulta.getObservacoes();
        this.valor = consulta.getValor();
        this.idAnimal = consulta.getAnimal().getId();
        this.idClinicaMedico = consulta.getClinicaMedico().getId();
        this.idTipoConsulta = consulta.getTipoConsulta().getId();
        this.remedioConsulta = consulta.getRemedioConsulta();
    }
}
