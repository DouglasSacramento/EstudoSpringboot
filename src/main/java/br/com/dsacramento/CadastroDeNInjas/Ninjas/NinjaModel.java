package br.com.dsacramento.CadastroDeNInjas.Ninjas;

import br.com.dsacramento.CadastroDeNInjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_cadastro_ninjas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private int idade;

    @Column(unique = true)
    private String email;

    // @ManyToOne Um ninja tem uma única missão.
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing key ou chave estrangeira.
    private MissoesModel missoes;

}
