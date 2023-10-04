package com.sthumbh.bloodbankregistrationsystem.controller;

import com.sthumbh.bloodbankregistrationsystem.dto.BloodBankDetailsResponseDto;
import com.sthumbh.bloodbankregistrationsystem.dto.RegistrationFormDto;
import com.sthumbh.bloodbankregistrationsystem.entity.RegistrationForm;
import com.sthumbh.bloodbankregistrationsystem.response.MetaData;
import com.sthumbh.bloodbankregistrationsystem.response.ResourceData;
import com.sthumbh.bloodbankregistrationsystem.response.StatusCodes;
import com.sthumbh.bloodbankregistrationsystem.response.UserResponseModel;
import com.sthumbh.bloodbankregistrationsystem.service.RegistrationFormService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(path = "/api/registration")
public class RegistrationFormController {
    @Autowired
    private RegistrationFormService registrationFormService;

    @PostMapping(path = "/create")
    public ResponseEntity<UserResponseModel> createRegistrationForm(@RequestBody @Valid RegistrationFormDto registrationFormDto) {
        log.info("Creating New Registration Form.");
        ResourceData<RegistrationForm> resourceData = new ResourceData();
        resourceData.setData(registrationFormService.createRegistration(registrationFormDto));
        UserResponseModel userResponseModel = UserResponseModel.builder()
                .metaData(new MetaData(StatusCodes.SUCCESS_STATUS, StatusCodes.SUCCESS_CODE, "Success", null, "v1"))
                .resourceData(resourceData)
                .build();
        return new ResponseEntity<>(userResponseModel, HttpStatus.OK);
    }

    @GetMapping(path = "/getBloodBankDetails")
    public ResponseEntity<UserResponseModel> getBloodBankDetails(@RequestParam(name = "districtCode") String districtCode,
                                                                 @RequestParam(name = "stateCode") String stateCode) {
        ResourceData<List<BloodBankDetailsResponseDto>> resourceData = new ResourceData();
        resourceData.setData(registrationFormService.getBloodBankDetails(stateCode, districtCode));
        UserResponseModel userResponseModel = UserResponseModel.builder()
                .metaData(new MetaData(StatusCodes.SUCCESS_STATUS, StatusCodes.SUCCESS_CODE, "Success", null, "v1"))
                .resourceData(resourceData)
                .build();
        return new ResponseEntity<>(userResponseModel, HttpStatus.OK);
    }
}
