package br.com.keya.Concessionaria.controller;

import br.com.keya.Concessionaria.dto.CarroDto;
import br.com.keya.Concessionaria.dto.ConcessionariaDto;
import br.com.keya.Concessionaria.model.Carro;
import br.com.keya.Concessionaria.model.Concessionaria;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/concessionaria")

public class ConcessionariaController {
    Concessionaria concessionaria = new Concessionaria();

    @GetMapping("/procurar")
    public ResponseEntity<Object> procurarCarro(@RequestParam long id){
        for (Carro carro : concessionaria.getCarros()){
            if (carro.getId() == id){
                return ResponseEntity.ok(carro);
            }
        }
        Map<String, String> resposta = new HashMap<>();
        resposta.put("mensagem", "O ID está incorreto.");

        return ResponseEntity.status(404).body(resposta);
    }

    @GetMapping("/listar")
    public List<Carro> listarCarros(){
        return concessionaria.getCarros();
    }


    @PostMapping("/editar")
    public Concessionaria editarConcessionaria(@RequestBody ConcessionariaDto dadoConcessionaria){
        this.concessionaria.setNome(dadoConcessionaria.nome());
        this.concessionaria.setEndereco(dadoConcessionaria.endereco());

        return concessionaria;
    }

    @PutMapping("/adicionar")
    public Carro adicionarCarro(@RequestBody CarroDto dadoCarro){
        return concessionaria.adicionarCarro(
                new Carro(
                        concessionaria.getIdProduto(),
                        dadoCarro.nome(),
                        dadoCarro.configuracao(),
                        dadoCarro.valor(),
                        dadoCarro.anoLancamento(),
                        dadoCarro.portas()
                ));
    }

}
