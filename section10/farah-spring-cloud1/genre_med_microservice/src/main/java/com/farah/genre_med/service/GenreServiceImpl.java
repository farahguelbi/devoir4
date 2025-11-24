package com.farah.genre_med.service;

import com.farah.genre_med.dto.GenreDto;
import com.farah.genre_med.entities.Genre;
import com.farah.genre_med.repos.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreServiceImpl implements GenreService {
    @Autowired
    GenreRepository genreRepository;

    @Override
    public GenreDto getGenreByCode(String code) {
        Genre gen = genreRepository.findByGenCode(code);
        GenreDto genreDto = new GenreDto(
                gen.getId(),
                gen.getGenName(),
                gen.getGenCode()
        );
        return genreDto;

    }
}