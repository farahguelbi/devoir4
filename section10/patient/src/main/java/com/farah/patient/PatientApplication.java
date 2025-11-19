package com.farah.patient;

import com.farah.patient.entities.Patient;
import com.farah.patient.repos.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;


@SpringBootApplication
@EnableFeignClients
public class PatientApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientApplication.class, args);
	}

    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository) {
        return args -> {
            patientRepository.save(Patient.builder()
                    .firstName("farah")
                    .lastName("guelbi")
                            .GenCode("1")
                    .build());

        };
    }
   @Bean
    public WebClient webClient(){
        return WebClient.builder().build();
    }

}
