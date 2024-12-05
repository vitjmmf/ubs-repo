package br.sp.gov.fatec.ubs.model;

import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
 
@Repository
public interface PacienteRepository  extends JpaRepository<Paciente, Long>  {
   
    public List<Paciente> findByNomeContainsIgnoreCase(String nomeCompleto);
     
        @Query("select p from paciente p where p.nomeCompleto = :nome")
        public List<Paciente> buscaPorNome(@Param("nome") String nomeCompleto);
     
             
        @Query("select p from paciente p where p.nomeCompleto = :nome or p.cpf = :cpf")
        public List<Paciente> buscaPorNomeOuCpf(@Param("nome") String nomeCompleto, @Param("cpf") String cpf);
     

}
