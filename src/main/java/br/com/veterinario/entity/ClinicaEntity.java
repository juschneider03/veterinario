package br.com.veterinario.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "clinica")
public class ClinicaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="cnpj")
    private String cnpj;

    @Column(name="endereco")
    private String endereco;

    @Column(name="nome")
    private String nome;
}
