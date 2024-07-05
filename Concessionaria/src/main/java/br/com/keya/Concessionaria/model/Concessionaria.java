package br.com.keya.Concessionaria.model;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private long idProduto;
    private String nome;
    private String endereco;
    private List<Carro> carros;

    public Concessionaria() {
        idProduto = 0;
        carros = new ArrayList<>();
    }

    public Carro adicionarCarro(Carro carro){
        carros.add(carro);
        idProduto++;
        return carro;
    }

    public void removerCarro(Carro carro){
        carros.remove(carro);
    }

    public long getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(long idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }
}
