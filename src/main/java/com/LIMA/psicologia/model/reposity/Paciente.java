package com.LIMA.psicologia.model.reposity;

import java.math.BigDecimal;
import java.sql.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor

public class Paciente {
	private int cpf;
	private String nome;
	private Date dataNascimento;
	private String nomeMae;
	private String nomePai;
	private int rg;
	private int foneCelular;
	private int foneFixo;
	private String email;
	private String enderecoRuaNumero;
	private String cidade;
	private String estado;
	private int cep;
	private String tipoContratoSessao;
	private int numeroSessoesMes;
	private BigDecimal valor;
	private LocalDateTime dataContrato = LocalDateTime.now();
}
