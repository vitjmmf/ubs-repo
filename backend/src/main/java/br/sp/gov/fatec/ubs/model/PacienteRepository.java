package br.sp.gov.fatec.ubs.model;

import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
 
@Repository
public interface PacienteRepository  extends JpaRepository<Paciente, Long>  {
   
    @Query(value = "select * from produto where descritivo like ?1 ",  nativeQuery = true)
    List<Paciente> fazerBusca(String busca);
}
