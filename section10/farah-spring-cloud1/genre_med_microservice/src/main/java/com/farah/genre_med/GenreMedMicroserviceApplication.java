package com.farah.genre_med;

import com.farah.genre_med.entities.Genre;
import com.farah.genre_med.repos.GenreRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GenreMedMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenreMedMicroserviceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(GenreRepository genreRepository) {
        return args -> {
            genreRepository.save(Genre.builder()
                    .genName("psychiatrie")
                    .genCode("1")
                    .build());
            genreRepository.save(Genre.builder()
                    .genName("gériatre")
                    .genCode("2")
                    .build());
        };
    }

}
