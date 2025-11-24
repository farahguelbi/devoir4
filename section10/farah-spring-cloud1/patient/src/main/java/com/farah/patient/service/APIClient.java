package com.farah.patient.service;

import com.farah.patient.dto.GenreDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(url = "http://localhost:8080", value = "GENRE")
@FeignClient(name = "genre-ms")

public interface APIClient {
    @GetMapping("api/genres/{genre-code}")
    GenreDto getGenByCode(@PathVariable("genre-code")
                               String genreCode
    );

}
