package ar.edu.unsl.trazar.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import ar.edu.unsl.trazar.entity.Local;
import ar.edu.unsl.trazar.repository.LocalRepository;

@Service
public class LocalServiceImpl implements LocalService {
	
	@Resource
	LocalRepository localRepository;

	@Override
	public Local createLocal(Local local) {
		return localRepository.save(local);
	}

	@Override
	public Local getLocalById(Integer localId) {
		return localRepository.findById(localId).orElse(null);
	}

}
