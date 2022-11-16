package com.LIMA.psicologia.model.reposity;

import org.iftm.veterinario.model.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
 
public interface PacienteRepository extends JpaRepository<Paciente, Integer> {
 
}
