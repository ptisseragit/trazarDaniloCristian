package ar.edu.unsl.trazar.controller;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unsl.trazar.entity.Local;
import ar.edu.unsl.trazar.entity.Visita;
import ar.edu.unsl.trazar.service.VisitaService;

@RestController
@RequestMapping("/visita")
public class VisitaController {
	
	@Resource
	VisitaService visitaService;
	
	@RequestMapping(method = RequestMethod.POST)
	public Visita createVisita(@RequestBody Visita visita) {
		return visitaService.createVisita(visita);
	}
	
	@RequestMapping(value = "/persona/{personaId}", method = RequestMethod.GET)
	public List<Local> getLocalByPersonId(@PathVariable("personaId") Integer personaId) {
		return visitaService.getLocalByPersonaId(personaId);
	}
	
	
	// el formato de la URL es <url base>/visita/persona/{personId}/date?dateFrom=<fecha1>&dateTo=<fecha2>
	@RequestMapping(value = "/persona/{personaId}/date", method = RequestMethod.GET)
	public List<Visita> getVisitaByPersonaIdAndDate(
			@PathVariable("personaId") Integer personaId,
			@RequestParam(name = "dateFrom", required = true) @DateTimeFormat(pattern = "dd-MM-yyyy") Date dateFrom,
			@RequestParam(name = "dateTo", required = true) @DateTimeFormat(pattern = "dd-MM-yyyy") Date dateTo
			) {
		return visitaService.getVisitaByPersonaIdAndDate(personaId, dateFrom, dateTo);
	}
}
