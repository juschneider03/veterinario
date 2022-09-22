package br.com.veterinario.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "animal")
public class AnimalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="nome", nullable = false)
    private String nome;

    @Column(name="idade")
    private Long idade;

    @Column(name="tipo")
    private String tipo;

    @Column(name="raca")
    private String raca;

    @ManyToOne
    @JoinColumn(name = "id_pessoa", referencedColumnName = "id")
    private PessoaEntity responsavel;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "id_animal", referencedColumnName = "id")
    private List<ConsultaEntity> consulta;
}
