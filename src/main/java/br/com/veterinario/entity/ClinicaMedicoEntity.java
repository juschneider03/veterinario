package br.com.veterinario.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name="clinica_medico")
public class ClinicaMedicoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_pessoa", referencedColumnName = "id")
    private PessoaEntity medico;

    @ManyToOne
    @JoinColumn(name = "id_clinica", referencedColumnName = "id")
    private ClinicaEntity clinica;
}

