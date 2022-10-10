package br.com.veterinario.repository;

import br.com.veterinario.entity.ClinicaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicaRepository extends JpaRepository<ClinicaEntity, Long> {
}
