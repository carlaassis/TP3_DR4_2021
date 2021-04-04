
package br.edu.infnet.app.vagas;

import br.edu.infnet.domain.vagas.Vaga;
import br.edu.infnet.infra.vagas.VagaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"/vagas"})
public class VagaController {
    
    @Autowired
    private VagaRepository vagaRepository;
    
    @GetMapping
    public Iterable<Vaga> listarVagas() {
        
        return vagaRepository.findAll();
    }
    
//    @GetMapping(path = {"/{id}"})
//    public ResponseEntity obterPorId(@PathVariable int id) {
//
//        ResponseEntity retorno = ResponseEntity.notFound().build();
//        Vaga vaga = this.findById(id);
//        if (vaga != null) {
//            
//            retorno = ResponseEntity.ok().body(vaga);
//        }
//        return retorno;
       //} 
    
    //       private Vaga findById(int id) {
//           return vagaRepository.findByIdUsuario(id);
//       }

        
    @GetMapping(path = {"/{id}"})
//    public Vaga obterPorId(@PathVariable int id) { //professor fez
//        
//        return vagaRepository.findById(id).get();
//    }
    //===================fiz com notfound=======================//
    public ResponseEntity obterPorId(@PathVariable int id) {
        
        ResponseEntity retorno = ResponseEntity.notFound().build();
        try {
          
            Vaga vaga = (Vaga) vagaRepository.findByIdUsuario(id);  
            if (vaga != null) {
        
                retorno = ResponseEntity.ok().body(vaga);    
    }
        } catch (Exception e)   {
            
        } 
        return retorno;
    }

    @GetMapping({"/usuario/{idUsuario}"}) //buscar pelo id de empresa
    public List<Vaga> listarPorIdUsuario(@PathVariable int idUsuario) {
        
        return vagaRepository.findByIdUsuario(idUsuario);
    }

    @PostMapping 
    public ResponseEntity publicarVaga(@RequestBody Vaga vaga) {
        
        ResponseEntity retorno = ResponseEntity.badRequest().build();
        if (vaga != null && vaga.getId() == null ) {
        
            Vaga vagaPublicada = vagaRepository.save(vaga);
            retorno = ResponseEntity.ok().body(vagaPublicada);
        }
        return retorno;
    }

}
        
    

