package com.sthumbh.bloodbankregistrationsystem.service;

import com.sthumbh.bloodbankregistrationsystem.dto.RegistrationFormDto;
import org.springframework.stereotype.Service;

@Service
public interface RegistrationFormService {
    RegistrationFormDto createRegistration(RegistrationFormDto registrationFormDto);
}
