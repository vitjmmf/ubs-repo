package br.sp.gov.fatec.ubs.model;
 
import java.util.List;
import java.util.Optional;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class PacienteController {
    @Autowired
    PacienteRepository bd;
 
    @PostMapping("/api/paciente")
    public String gravar(@RequestBody Paciente obj){
        bd.save(obj);
        return "Paciente gravado com sucesso!";
    }
 
    @GetMapping("/api/paciente/{codigo}")
    public Paciente ler(@PathVariable Long codigo){
        Optional<Paciente> obj = bd.findById(codigo);
        if(obj.isPresent()){
            return obj.get();
        } else {
            return null;
        }
    }
 
    @DeleteMapping("/api/paciente/{codigo}")
    public String remover(@PathVariable Long codigo){
        bd.deleteById(codigo);
        return "paciente "+ codigo +" removido com sucesso !!";
    }
   
    @PutMapping("/api/paciente")
    public String alterar(@RequestBody Paciente obj){
        bd.save(obj);
        return "Paciente alterada com sucesso !";
    }    
 
    @GetMapping("/api/paciente")
    public List<Paciente> listar(){
        return bd.findAll();
    }
 
    @GetMapping("/api/paciente/busca/{palavra}")
    public List<Paciente> fazerBusca(@PathVariable String palavra){
        return bd.fazerBusca('%'+ palavra +'%');
    }
 
 
 
}