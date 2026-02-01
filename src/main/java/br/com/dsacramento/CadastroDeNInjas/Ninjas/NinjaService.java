package br.com.dsacramento.CadastroDeNInjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Criar ninja
    public NinjaModel criarNinja (NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }

    // Listar todos
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    // Listar por id
    public NinjaModel listarNinjaPorId(UUID id){
        Optional<NinjaModel> ninja = ninjaRepository.findById(id);
        return ninja.orElse(null);
    }

    // Editar ninja
    public NinjaModel editarNinja(UUID id, NinjaModel ninjaEditado){
        NinjaModel ninja = ninjaRepository.findById(id)
                .orElse(null);

        if (ninjaEditado.getEmail() != null){
            ninja.setEmail(ninjaEditado.getEmail());
        }

        if (ninjaEditado.getNome() != null){
            ninja.setNome(ninjaEditado.getNome());
        }

        if (ninjaEditado.getIdade() != 0){
            ninja.setIdade(ninjaEditado.getIdade());
        }

        if (ninjaEditado.getMissoes() != null){
            ninja.setMissoes(ninjaEditado.getMissoes());
        }

        return ninjaRepository.save(ninja);
    }

    // Deletar ninja
    public void deletarNinjaPorId(UUID id){
        ninjaRepository.deleteById(id);
    }
}
