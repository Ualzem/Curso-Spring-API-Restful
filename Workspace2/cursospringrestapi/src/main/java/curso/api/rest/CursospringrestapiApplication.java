package curso.api.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EntityScan(basePackages = {"curso.api.rest.model"})  // vai ler e criar as tabelas automaticamente
@ComponentScan(basePackages = {"curso.*"})  // injeção de dependências
@EnableJpaRepositories(basePackages = {"curso.api.rest.repository"})  // habilita o jpa
@EnableTransactionManagement     // habilita a gerência de transações no banco
@EnableWebMvc         // habilita o padrÃ£o model view controller
@RestController       // habilita o rest
@EnableAutoConfiguration    // vai fazer tudo funcionar



public class CursospringrestapiApplication extends SpringBootServletInitializer  {

	public static void main(String[] args) {
		SpringApplication.run(CursospringrestapiApplication.class, args);  // ATENÇÃO: USAR EXTENSÃO DO CHROME PARA JSON
	}

}
