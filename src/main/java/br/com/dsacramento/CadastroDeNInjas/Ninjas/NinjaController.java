package br.com.dsacramento.CadastroDeNInjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {
    // Adicionar
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }

    // Mostrar todos
    @GetMapping("/todos")
    public String mostrarNinjas(){
        return "Mostrar ninjas";
    }

    // Mostrar por Id
    @GetMapping("/todos/{id}")
    public String mostrarNinjaPorId(){
        return "Mostrar ninja por id";
    }

    // Alterar
    @PutMapping("/alterar/{id}")
    public String alterarNinjaPorId(){
        return "Alterar ninja por id";
    }
    // Deletar
    @DeleteMapping("/deletar/{id}")
    public String deletarNinjaPorId(){
        return "Deletar ninja por id";
    }
}
