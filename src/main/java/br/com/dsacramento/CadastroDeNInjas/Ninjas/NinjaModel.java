package br.com.dsacramento.CadastroDeNInjas.Ninjas;

import br.com.dsacramento.CadastroDeNInjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "idade")
        private int idade;

    @Column(name = "rank")
    private String rank;

    @Column(unique = true, name = "email")
    private String email;

    @Column(name = "img_url")
    private String imgUrl;

    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

}
