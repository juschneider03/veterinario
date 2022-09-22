package br.com.veterinario.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Data
@Entity
@Table(name="tipo_consulta")
public class TipoConsultaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="nome", nullable = false)
    private String nome;

    @Column(name="categoria")
    private String categoria;

    @Column(name="valor_sugerido")
    private BigDecimal valorSugerido;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_tipo_consulta", referencedColumnName = "id")
    private List<ConsultaEntity> tipoConsulta;
}