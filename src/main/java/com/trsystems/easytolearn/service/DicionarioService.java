package com.trsystems.easytolearn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.trsystems.easytolearn.domain.Dicionario;
import com.trsystems.easytolearn.repository.DicionarioRepository;

@Service
public class DicionarioService {
	
	@Autowired
	private DicionarioRepository palavraRepository;

	public Dicionario cadastrar(Dicionario dicionario) {
		String[] split = dicionario.getPalavra().split(" ");
		String palavra = "";
		for (String s : split) {
			palavra = palavra.concat(StringUtils.capitalize(s.toLowerCase())) + " ";
		}
		dicionario.setPalavra(palavra);
		return palavraRepository.save(dicionario);
	}
	
	public Page<Dicionario> buscarTodos(Pageable pageable) {
		return palavraRepository.findAll(pageable);
	}

}
