package com.sthumbh.bloodbankregistrationsystem.controller;

import com.sthumbh.bloodbankregistrationsystem.dto.RegistrationFormDto;
import com.sthumbh.bloodbankregistrationsystem.entity.RegistrationForm;
import com.sthumbh.bloodbankregistrationsystem.service.RegistrationFormService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@Slf4j
@RequestMapping(path = "/api/registration")
public class RegistrationFormController {
   @Autowired
    private RegistrationFormService registrationFormService;

   @PostMapping(path = "/create")
    public ResponseEntity<RegistrationForm> createRegistrationForm(@RequestBody RegistrationFormDto registrationFormDto){
       log.info("Creating New Registration Form.");
       return new ResponseEntity<>(registrationFormService.createRegistration(registrationFormDto), HttpStatus.OK);
   }
}
