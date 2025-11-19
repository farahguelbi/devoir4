package com.farah.genre_med.repos;

import com.farah.genre_med.entities.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
public interface GenreRepository extends JpaRepository<Genre, Long> {
    Genre findByGenCode(String code);

}
