package org.zerock.myapp.runner;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;


//@Log4j2
@Slf4j

@NoArgsConstructor

@Component("customCmdLineRunner")
public class CustomCmdLineRunner implements CommandLineRunner {

//    @Value("${server.address}")
    private String serverAddress;

//    @Value("${server.port}")
    private Integer serverPort;

    @Override
    public void run(String... args) {
        log.trace("run({}) invoked.", Arrays.toString(args));
    } // run

} // end class


