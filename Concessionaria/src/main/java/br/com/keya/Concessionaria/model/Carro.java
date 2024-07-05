package br.com.keya.Concessionaria.model;

import br.com.keya.Concessionaria.listas.Configuracao;

public class Carro {
    private long id;
    private String nome;
    private Configuracao configuracao;
    private double valor;
    private int anoLancamento;
    private int portas;

    public Carro(long id, String nome, Configuracao configuracao, double valor, int anoLancamento, int portas) {
        this.id = id;
        this.nome = nome;
        this.configuracao = configuracao;
        this.valor = valor;
        this.anoLancamento = anoLancamento;
        this.portas = portas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Configuracao getConfiguracao() {
        return configuracao;
    }

    public void setConfiguracao(Configuracao configuracao) {
        this.configuracao = configuracao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }
}
