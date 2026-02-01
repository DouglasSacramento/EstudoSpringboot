package br.com.dsacramento.CadastroDeNInjas.Missoes;

import lombok.Data;
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
        return missao.orElse(null);
    }

    // Criar missão
    public MissoesModel criarMissao(MissoesModel novaMissao){
            return missoesRepository.save(novaMissao);
    }

    // Deletar missão
    public void deletarMissao(Long id){
        missoesRepository.deleteById(id);
    }

    // Editar missao
    public MissoesModel editarMissao(Long id, MissoesModel missaoEditada) {
        MissoesModel missao = missoesRepository.findById(id)
                .orElse(null);

        if (missaoEditada.getNome() != null) {
            missao.setNome(missaoEditada.getNome());
        }

        if (missaoEditada.getDificuldade() != null) {
            missao.setDificuldade(missaoEditada.getDificuldade());
        }

        return missoesRepository.save(missao);
    }

}
