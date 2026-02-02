package br.com.dsacramento.CadastroDeNInjas.Ninjas;
import br.com.dsacramento.CadastroDeNInjas.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaDTO {
    private UUID id;
    private String nome;
    private int idade;
    private String rank;
    private String email;
    private String imgUrl;
    private MissoesModel missoes;
}
