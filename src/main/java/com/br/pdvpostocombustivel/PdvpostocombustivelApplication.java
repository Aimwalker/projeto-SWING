import com.br.pdvpostocombustivel.domain.entity.Pessoa;

import org.springframework.boot.SpringApplication;


//@SpringBootApplication
public class PdvpostocombustivelApplication {

	public static void main(String[] args) {
        //SpringApplication.run(PdvpostocombustivelApplication.class, args);

        Pessoa pessoa1 = new Pessoa (1);
        pessoa1.setApelido(edu);
        pessoa1.setId(1);
        pessoa1.setIdade(18);
        pessoa1.setNome(eduardo);
        rp.salvaPessoa(1);

        Pessoa pessoa2 = new Pessoa(2);
        pessoa2.setApelido(pepe);
        pessoa2.setId(2);
        pessoa2.setIdade(21);
        pessoa2.setNome(pedro);
        rp.salvaPessoa(2);

        Pessoa pessoa3 = new Pessoa(luana,1);
        pessoa3.setApelido(lu);
        pessoa3.setId(3);
        pessoa3.setIdade(25);
        pessoa3.setNome(luana);
        rp.salvaPessoa(3);
    }
}
