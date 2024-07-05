package br.com.keya.Concessionaria.dto;

import br.com.keya.Concessionaria.listas.Configuracao;

public record CarroDto(String nome, Configuracao configuracao, double valor, int anoLancamento, int portas) {}
