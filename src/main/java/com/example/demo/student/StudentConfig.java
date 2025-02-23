package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.OCTOBER;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository)
    {
        return  args -> {

                  Student mariam =  new Student(
                                    "Jamal",
                                    "jamal@gmail.com",
                                    LocalDate.of(2005, Month.OCTOBER,24)
                            );


            Student alice =  new Student(
                    "Alice",
                    "alice@gmail.com",
                    LocalDate.of(2003, Month.OCTOBER,24));


            repository.saveAll(
                    List.of(mariam,alice)
            );
        };
    }
}
