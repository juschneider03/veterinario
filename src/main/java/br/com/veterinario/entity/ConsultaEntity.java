package br.com.veterinario.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name="consulta")
public class ConsultaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="valor")
    private BigDecimal valor;

    @Column(name="observacoes")
    private String observacoes;

    @ManyToOne
    @JoinColumn(name = "id_animal", referencedColumnName = "id")
    private AnimalEntity animal;

    @ManyToOne
    @JoinColumn(name = "id_clinica_medico", referencedColumnName = "id")
    private ClinicaMedicoEntity clinicaMedico;

    @ManyToOne
    @JoinColumn(name = "id_tipo_consulta", referencedColumnName = "id")
    private TipoConsultaEntity tipoConsulta;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_consulta", referencedColumnName = "id")
    private List<RemedioEntity> remedioConsulta;
}
