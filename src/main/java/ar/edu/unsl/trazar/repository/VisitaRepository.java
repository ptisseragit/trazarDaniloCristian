package ar.edu.unsl.trazar.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ar.edu.unsl.trazar.entity.Local;
import ar.edu.unsl.trazar.entity.Visita;

@Repository
public interface VisitaRepository extends JpaRepository<Visita, Integer> {
	
	@Query("SELECT v.local FROM Visita v WHERE v.persona.id = :personaId")
	List<Local> findLocalByPersonaId(@Param("personaId") Integer personaId);
	
	@Query("SELECT v FROM Visita v WHERE v.persona.id = :personaId AND v.fecha BETWEEN :dateFrom AND :dateTo")
	List<Visita> findVisitaByPersonaIdAndDate(@Param("personaId") Integer personaId, @Param("dateFrom") Date dateFrom, @Param("dateTo") Date dateTo);

}
