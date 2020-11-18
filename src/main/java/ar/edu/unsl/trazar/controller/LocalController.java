package ar.edu.unsl.trazar.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unsl.trazar.entity.Local;
import ar.edu.unsl.trazar.service.LocalService;

@RestController
@RequestMapping("/local")
public class LocalController {
	
	@Resource
	LocalService localService;
	
	@RequestMapping(method = RequestMethod.POST)
	public Local createLocal(@RequestBody Local local) {
		return localService.createLocal(local);
	}
	
	@RequestMapping(value = "/{localId}", method = RequestMethod.GET)
	public Local getLocalById(@PathVariable("localId") Integer localId) {
		return localService.getLocalById(localId);
	}

}
