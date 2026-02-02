package br.com.dsacramento.CadastroDeNInjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;
    private NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.ninjaMapper = ninjaMapper;
    }

    // Criar ninja
    public NinjaDTO criarNinja (NinjaDTO ninjaDTO){
        NinjaModel ninja = ninjaMapper.map(ninjaDTO);
        ninja = ninjaRepository.save(ninja);
        return ninjaMapper.map(ninja);
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

        if (ninjaEditado.getRank() != null){
            ninja.setRank(ninjaEditado.getRank());
        }

        return ninjaRepository.save(ninja);
    }

    // Deletar ninja
    public void deletarNinjaPorId(UUID id){
        ninjaRepository.deleteById(id);
    }
}
