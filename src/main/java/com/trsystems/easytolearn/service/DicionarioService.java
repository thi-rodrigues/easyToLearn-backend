package com.trsystems.easytolearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trsystems.easytolearn.domain.Dicionario;
import com.trsystems.easytolearn.repository.DicionarioRepository;

@Service
public class DicionarioService {
	
	@Autowired
	private DicionarioRepository palavraRepository;

	public Dicionario cadastrar(Dicionario dicionario) {
		return palavraRepository.save(dicionario);
	}

}
