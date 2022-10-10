package br.com.veterinario.repository;

import br.com.veterinario.entity.ClinicaMedicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicaMedicoRepository extends JpaRepository<ClinicaMedicoEntity, Long> {
}
