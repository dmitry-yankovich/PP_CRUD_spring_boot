package kata_preproject.pp_crud_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("kata_preproject.pp_crud_spring_boot.dao")
@EntityScan("kata_preproject.pp_crud_spring_boot.models")
@ComponentScan(basePackages = { "kata_preproject.pp_crud_spring_boot.*" })
public class PpCrudSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(PpCrudSpringBootApplication.class, args);
    }

}
