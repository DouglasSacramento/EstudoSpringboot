package br.com.dsacramento.CadastroDeNInjas.Ninjas;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface NinjaRepository extends JpaRepository<NinjaModel, UUID> {

}
