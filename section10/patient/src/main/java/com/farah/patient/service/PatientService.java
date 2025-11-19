package com.farah.patient.service;

import com.farah.patient.dto.APIResponseDto;
import com.farah.patient.dto.PatientDto;

public interface PatientService {
    APIResponseDto getPatientById(Long id);


}
