package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student sofia = new Student(
                    "Sofia",
                    "sofia@gmail.com",
                    LocalDate.of(2000, Month.AUGUST, 6)
            );
            Student liana = new Student(
                    "Liana",
                    "liana@gmail.com",
                    LocalDate.of(2001, Month.JULY, 7)
            );
            repository.saveAll(
                    List.of(sofia, liana)

            );

        };
    }
}
