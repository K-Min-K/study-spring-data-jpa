package org.zerock.myapp.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zerock.myapp.domain.Cat;
import org.zerock.myapp.domain.Dog;
import org.zerock.myapp.domain.SampleBean;

import java.util.Objects;

@Slf4j
@NoArgsConstructor

@Configuration
public class SampleConfig {

    @Bean
    SampleBean sampleBean() {
        log.trace(">>>>>>>>>>>>>> sampleBean() invoked.");

        SampleBean bean = new SampleBean();
        bean.setName("K");
        bean.setAge(23);

        return bean;
    } // sampleBean

   @Bean
    Dog dog() {
        log.trace("dog() invoked.");
        Dog dog = new Dog();
        dog.setName("Dog");
        dog.setAge(14);
        dog.setWeight(12L);

        return null;
   } // dog


    @Bean
    Cat cat() {
        log.trace("cat() invoked.");
        Dog dog = new Dog();
        dog.setName("Cat");
        dog.setAge(14);
        dog.setWeight(12L);

        return null;
    } // cat

} // end class
