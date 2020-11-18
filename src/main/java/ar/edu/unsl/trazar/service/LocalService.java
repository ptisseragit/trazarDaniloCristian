package ar.edu.unsl.trazar.service;

import ar.edu.unsl.trazar.entity.Local;

public interface LocalService {
	
	Local createLocal(Local local);
	
	Local getLocalById(Integer localId);

}
