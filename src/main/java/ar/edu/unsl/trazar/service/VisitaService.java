package ar.edu.unsl.trazar.service;

import java.util.Date;
import java.util.List;

import ar.edu.unsl.trazar.entity.Local;
import ar.edu.unsl.trazar.entity.Visita;

public interface VisitaService {
	
	Visita createVisita(Visita visita);
	
	List<Local> getLocalByPersonaId(Integer personaId);
	
	List<Visita> getVisitaByPersonaIdAndDate(Integer personaId, Date dateFrom, Date dateTo);

}
