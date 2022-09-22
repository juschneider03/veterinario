package br.com.veterinario.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="remedio")
public class RemedioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="descricao")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "id_consulta", referencedColumnName = "id")
    private ConsultaEntity consulta;

}
