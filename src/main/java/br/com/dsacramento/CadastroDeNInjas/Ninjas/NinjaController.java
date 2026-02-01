package br.com.dsacramento.CadastroDeNInjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    // Adicionar
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){
        return ninjaService.criarNinja(ninja);
    }

    // Mostrar todos
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    // Mostrar por Id
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjaPorId(@PathVariable UUID id){
        return ninjaService.listarNinjaPorId(id);
    }

    // Alterar
    @PutMapping("/alterarID")
    public String alterarNinjaPorId(){
        return "Alterar ninja por id";
    }

    // Deletar
    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable UUID id){
        ninjaService.deletarNinjaPorId(id);
    }
}
