package com.farah.patient.service;

import com.farah.patient.dto.APIResponseDto;
import com.farah.patient.dto.GenreDto;
import com.farah.patient.dto.PatientDto;
import com.farah.patient.entities.Patient;
import com.farah.patient.repos.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@AllArgsConstructor
@Service

public class PatientServiceImpl implements PatientService {
    private WebClient webClient;
    private PatientRepository patientRepository;
    private APIClient apiClient;

    @Override
    public APIResponseDto getPatientById(Long id) {
        Patient patient = patientRepository.findById(id).get();
        GenreDto genreDto = apiClient.getGenByCode(patient.getGenCode());

     /*   GenreDto genreDto = webClient.get()
                .uri("http://localhost:8080/api/genres/" +
                        patient.getGenCode())
                .retrieve()
                .bodyToMono(GenreDto.class)
                .block();*/
        PatientDto patientDto = new PatientDto(
                patient.getId(),
                patient.getFirstName(),
                patient.getLastName(),
                patient.getGenCode(),
                genreDto.getGenName()
        );
        APIResponseDto apiResponseDto = new APIResponseDto();
        apiResponseDto.setPatientDto(patientDto);
        apiResponseDto.setGenreDto(genreDto);
        return apiResponseDto;
    }



}

