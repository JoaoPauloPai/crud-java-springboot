package br.com.crud.jumbo.crud_java_sprinboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author João Paulo
 *
 *         21 de dez. de 2021 22:42:57
 */

@SpringBootApplication
@EntityScan(basePackages = "br.com.crud.jumbo.crud_java_sprinboot.model")
@ComponentScan(basePackages = {"br.*"})
@EnableJpaRepositories(basePackages = {"br.com.crud.jumbo.crud_java_sprinboot.repository"})
@EnableTransactionManagement
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
