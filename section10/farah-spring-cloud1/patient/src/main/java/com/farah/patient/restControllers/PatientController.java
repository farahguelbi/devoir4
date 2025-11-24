package com.farah.patient.restControllers;

import com.farah.patient.config.Configuration;
import com.farah.patient.dto.APIResponseDto;
import com.farah.patient.dto.PatientDto;
import com.farah.patient.service.PatientService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/patients")
@AllArgsConstructor

public class PatientController {
    private PatientService patientsService;
    @Autowired
    Configuration configuration;


    @GetMapping("{id}")
    public ResponseEntity<APIResponseDto> getPatientById(@PathVariable("id")
                                                     Long id )
    {
        return new ResponseEntity<APIResponseDto>(
                patientsService.getPatientById(id), HttpStatus.OK);
    }
    @GetMapping("/author")
    public ResponseEntity<String> retrieveAuthorInfo() {
        return ResponseEntity.status(HttpStatus.OK)
                .body(configuration.getName()+" "+configuration.getEmail() );
    }
}
