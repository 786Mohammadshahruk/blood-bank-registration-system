package com.sthumbh.bloodbankregistrationsystem.service.impl;

import com.sthumbh.bloodbankregistrationsystem.dto.RegistrationFormDto;
import com.sthumbh.bloodbankregistrationsystem.entity.RegistrationForm;
import com.sthumbh.bloodbankregistrationsystem.repository.RegistrationFormRepository;
import com.sthumbh.bloodbankregistrationsystem.service.RegistrationFormService;
import com.sthumbh.bloodbankregistrationsystem.transformer.RegistrationFormTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationFormServiceImpl implements RegistrationFormService {
    @Autowired
    private RegistrationFormRepository registrationFormRepository;
    @Autowired
    private RegistrationFormTransformer registrationFormTransformer;

    private void mapRegistration(RegistrationFormDto registrationFormDto, RegistrationForm registrationForm){
        registrationForm.setStateCode(registrationFormDto.getStateCode());
        registrationForm.setDistrictList(registrationFormDto.getDistrictList());
        registrationForm.setHospCity(registrationFormDto.getHospCity());
        registrationForm.setBldBankName(registrationFormDto.getBldBankName());
        registrationForm.setParentHospName(registrationFormDto.getParentHospName());
        registrationForm.setHospShortName(registrationFormDto.getHospShortName());
        registrationForm.setHospType(registrationFormDto.getHospType());
        registrationForm.setContactPerson(registrationFormDto.getContactPerson());
        registrationForm.setHospEmail(registrationFormDto.getHospEmail());
        registrationForm.setHospContact(registrationFormDto.getHospContact());
        registrationForm.setHospFax(registrationFormDto.getHospFax());
        registrationForm.setLicenceNo(registrationFormDto.getLicenceNo());
        registrationForm.setLicenceFromDate(registrationFormDto.getLicenceFromDate());
        registrationForm.setLicenceToDate(registrationFormDto.getLicenceToDate());
        registrationForm.setComponentFacility(registrationFormDto.getComponentFacility());
        registrationForm.setApheresisFacility(registrationFormDto.getApheresisFacility());
        registrationForm.setHelplineNo(registrationFormDto.getHelplineNo());
        registrationForm.setHospAdd1(registrationFormDto.getHospAdd1());
        registrationForm.setHospAdd2(registrationFormDto.getHospAdd2());
        registrationForm.setPinCode(registrationFormDto.getPinCode());
        registrationForm.setHospLatitude(registrationFormDto.getHospLatitude());
        registrationForm.setHospLongitude(registrationFormDto.getHospLongitude());
        registrationForm.setHospWebsite(registrationFormDto.getHospWebsite());
        registrationForm.setNoOfBed(registrationFormDto.getNoOfBed());
        registrationForm.setDonorType(registrationFormDto.getDonorType());
        registrationForm.setDonationType(registrationFormDto.getDonationType());
        registrationForm.setComponentType(registrationFormDto.getComponentType());
        registrationForm.setBagType(registrationFormDto.getBagType());
        registrationForm.setTtiType(registrationFormDto.getTtiType());
        registrationForm.setChargeName(registrationFormDto.getChargeName());
        registrationForm.setChargeRs(registrationFormDto.getChargeRs());
        registrationForm.setAreaNameDetails(registrationFormDto.getAreaNameDetails());
        registrationForm.setAreaUsability(registrationFormDto.getAreaUsability());
        registrationForm.setRoomNo(registrationFormDto.getRoomNo());
        registrationForm.setStorageName(registrationFormDto.getStorageName());
        registrationForm.setStorageType(registrationFormDto.getStorageType());
        registrationForm.setAreaName(registrationFormDto.getAreaName());
        registrationForm.setRefreshmentItem(registrationFormDto.getRefreshmentItem());
        registrationForm.setRefreshmentQuantity(registrationFormDto.getRefreshmentQuantity());
        registrationForm.setHMode(registrationFormDto.getHMode());
        registrationForm.setState(registrationFormDto.getState());
        registrationForm.setDistrict(registrationFormDto.getDistrict());
    }
    @Override
    public RegistrationFormDto createRegistration(RegistrationFormDto registrationFormDto) {
     RegistrationForm registrationForm = new RegistrationForm();
     mapRegistration(registrationFormDto,registrationForm);
     return  registrationFormTransformer.MAP_TO_DTO.apply(registrationFormRepository.save(registrationForm));
    }
}
