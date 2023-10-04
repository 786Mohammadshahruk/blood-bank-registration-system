package com.sthumbh.bloodbankregistrationsystem.service;

import com.sthumbh.bloodbankregistrationsystem.dto.BloodBankDetailsResponseDto;
import com.sthumbh.bloodbankregistrationsystem.dto.RegistrationFormDto;
import com.sthumbh.bloodbankregistrationsystem.entity.RegistrationForm;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RegistrationFormService {
    RegistrationForm createRegistration(RegistrationFormDto registrationFormDto);

    List<BloodBankDetailsResponseDto> getBloodBankDetails(String stateCode, String districtCode);
}
