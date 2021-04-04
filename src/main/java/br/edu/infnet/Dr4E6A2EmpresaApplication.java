package br.edu.infnet;

import br.edu.infnet.domain.vagas.Criterio;
import br.edu.infnet.domain.vagas.Vaga;
import br.edu.infnet.infra.vagas.VagaRepository;
import java.util.ArrayList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Dr4E6A2EmpresaApplication implements CommandLineRunner{

    
    private Logger log = LoggerFactory.getLogger(Dr4E6A2EmpresaApplication.class);
    @Autowired
    private VagaRepository vagaRepository;
    
	public static void main(String[] args) {
		SpringApplication.run(Dr4E6A2EmpresaApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        
//        Vaga vaga = new Vaga();
//        vaga.setCargo("Analista de Sistemas");
//        vaga.setCidade("Rio de Janeiro");
//        vaga.setFormaContratacao("CLT");
//        vaga.setIdUsuario(3);
//        
//        Criterio c1 = new Criterio();
//        c1.setDescricao("Programação");
//        c1.setIdVaga(vaga);
//        c1.setPerfil(3);
//        c1.setPeso(5);
//        
//        Criterio c2 = new Criterio();
//        c2.setDescricao("Domínio do Inglês");
//        c2.setIdVaga(vaga);
//        c2.setPerfil(3);
//        c2.setPeso(4);
//        
//        ArrayList<Criterio> criterios = new ArrayList<>();
//        criterios.add(c1);
//        criterios.add(c2);
//        vaga.setCriterioList(criterios);
//        
//        Vaga gravado = vagaRepository.save(vaga);
//        log.info(gravado.toString());
        
    }

}
