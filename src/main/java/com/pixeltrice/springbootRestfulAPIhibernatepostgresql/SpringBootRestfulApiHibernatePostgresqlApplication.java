package com.pixeltrice.springbootRestfulAPIhibernatepostgresql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, DataSourceTransactionManagerAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@SpringBootApplication(scanBasePackages= {"com.vz.spring.items"})

//@ApplicationPath("/something")

//@ComponentScan(basePackages={"com.pixeltrice"})

//@ComponentScan("com.pixeltrice.springbootRestfulAPIhibernatepostgresql")
//@RestController
//@ComponentScan(basePackages = "com.pixeltrice.springbootRestfulAPIhibernatepostgresql")
//@EnableJpaRepositories(basePackages = "com.pixeltrice.springbootRestfulAPIhibernatepostgresql.dao")
//@EntityScan(basePackages = "com.pixeltrice.springbootRestfulAPIhibernatepostgresql.entity")

//@EnableWebMvc
public class SpringBootRestfulApiHibernatePostgresqlApplication extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootRestfulApiHibernatePostgresqlApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestfulApiHibernatePostgresqlApplication.class, args);
	}

}
