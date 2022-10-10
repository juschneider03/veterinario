package br.com.veterinario.repository;

import br.com.veterinario.entity.TipoConsultaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoConsultaRepository extends JpaRepository<TipoConsultaEntity, Long> {
}
