package hello
/*

  Created by smpark on 2016-01-19.

*/

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration
import org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.ImportResource

@Configuration
@EnableAutoConfiguration(exclude=[
        DataSourceAutoConfiguration, // datasource-config.xml
        DataSourceTransactionManagerAutoConfiguration // datasource-config.xml
])
@ComponentScan
@ImportResource([
        "classpath:spring/datasource-config.xml"
])
@SpringBootApplication
public class Application {
    public static void main(String[] args){
        SpringApplication.run(Application.class, args)
        System.out.println("Spring Boot Started.")
    }


}

