package com.sthumbh.bloodbankregistrationsystem.service;

import com.sthumbh.bloodbankregistrationsystem.dto.RegistrationFormDto;
import com.sthumbh.bloodbankregistrationsystem.entity.RegistrationForm;
import org.springframework.stereotype.Service;

@Service
public interface RegistrationFormService {
    RegistrationForm createRegistration(RegistrationFormDto registrationFormDto);
}
