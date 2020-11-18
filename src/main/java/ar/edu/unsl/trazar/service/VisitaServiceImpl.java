package ar.edu.unsl.trazar.service;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ar.edu.unsl.trazar.entity.Local;
import ar.edu.unsl.trazar.entity.Visita;
import ar.edu.unsl.trazar.repository.VisitaRepository;

@Service
public class VisitaServiceImpl implements VisitaService {
	
	@Resource
	VisitaRepository visitaRepository;

	@Override
	public Visita createVisita(Visita visita) {
		return visitaRepository.save(visita);
	}

	@Override
	public List<Local> getLocalByPersonaId(Integer personaId) {
		return visitaRepository.findLocalByPersonaId(personaId);
	}

	@Override
	public List<Visita> getVisitaByPersonaIdAndDate(Integer personaId, Date dateFrom, Date dateTo) {
		return visitaRepository.findVisitaByPersonaIdAndDate(personaId, dateFrom, dateTo);
	}

}
