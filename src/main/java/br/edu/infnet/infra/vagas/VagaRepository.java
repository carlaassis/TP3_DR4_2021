
package br.edu.infnet.infra.vagas;

import br.edu.infnet.domain.vagas.Vaga;
import java.util.List;
import org.springframework.data.repository.CrudRepository;


public interface VagaRepository extends CrudRepository<Vaga, Integer>{
    
    //Vaga findByIdUsuario(int id);

        
    List<Vaga> findByIdUsuario(int id);

}
