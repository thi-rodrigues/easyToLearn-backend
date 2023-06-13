package com.trsystems.easytolearn.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "TB_DICIONARIO")
public class Dicionario implements Serializable {
	
	private static final long serialVersionUID = -1968218324031431974L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String palavra;
	
	private String significado;

}
