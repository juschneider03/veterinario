package br.com.veterinario.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "animal")
public class AnimalEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_pessoa", referencedColumnName = "id")
    private PessoaEntity responsavel;
}
