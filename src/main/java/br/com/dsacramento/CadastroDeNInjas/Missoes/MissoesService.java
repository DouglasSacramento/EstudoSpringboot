package br.com.dsacramento.CadastroDeNInjas.Missoes;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MissoesService {

    private MissoesRepository missoesRepository;

    public MissoesService(MissoesRepository missoesRepository) {
        this.missoesRepository = missoesRepository;
    }

    // Listar missoes
    public List<MissoesModel> listarMissoes() {
        return missoesRepository.findAll();
    }

    // Listar missoes por Id
    public MissoesModel listarMissaoPorId(Long id){
        Optional<MissoesModel> missao = missoesRepository.findById(id);
        return missao.orElseThrow(() -> new RuntimeException("Missão not found"));
    }

}
