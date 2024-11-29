package br.sp.gov.fatec.ubs.model;
 
import java.util.List;
 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
 
 
@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
 
    // Filtrar por código
    @Query(value = "SELECT * FROM paciente WHERE codigo = :codigo", nativeQuery = true)
    List<Paciente> findByCodigo(@Param("codigo") Long codigo);
 
    // Filtrar por nome (usando LIKE para buscas parciais)
    @Query(value = "SELECT * FROM paciente WHERE nome LIKE %:nome%", nativeQuery = true)
    List<Paciente> findByNome(@Param("nome") String nome);
 
    // Filtrar por documento
    @Query(value = "SELECT * FROM paciente WHERE documento = :documento", nativeQuery = true)
    List<Paciente> findByDocumento(@Param("documento") String documento);
}
 


