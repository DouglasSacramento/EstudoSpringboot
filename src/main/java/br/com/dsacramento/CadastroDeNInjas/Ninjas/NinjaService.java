package br.com.dsacramento.CadastroDeNInjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Listar todos
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

}
