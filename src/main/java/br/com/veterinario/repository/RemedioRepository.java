package br.com.veterinario.repository;

import br.com.veterinario.entity.RemedioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemedioRepository extends JpaRepository<RemedioEntity, Long> {
}
