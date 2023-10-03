package com.sthumbh.bloodbankregistrationsystem.service.impl;

import com.sthumbh.bloodbankregistrationsystem.dto.RegistrationFormDto;
import com.sthumbh.bloodbankregistrationsystem.entity.RegistrationForm;
import com.sthumbh.bloodbankregistrationsystem.repository.RegistrationFormRepository;
import com.sthumbh.bloodbankregistrationsystem.service.RegistrationFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationFormServiceImpl implements RegistrationFormService {
    @Autowired
    private RegistrationFormRepository registrationFormRepository;

    @Override
    public RegistrationForm createRegistration(RegistrationFormDto registrationFormDto) {
        return registrationFormRepository.save(getRegistrationFormDetails(registrationFormDto));
    }

    private RegistrationForm getRegistrationFormDetails(RegistrationFormDto registrationFormDto) {
        RegistrationForm registrationForm = new RegistrationForm();
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
        registrationForm.setLicenceToDate(registrationForm.getLicenceToDate());
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
        registrationForm.setAreaNameDetails(registrationForm.getAreaNameDetails());
        registrationForm.setAreaUsability(registrationForm.getAreaUsability());
        registrationForm.setRoomNo(registrationForm.getRoomNo());
        registrationForm.setStorageName(registrationForm.getStorageName());
        registrationForm.setStorageType(registrationFormDto.getStorageType());
        registrationForm.setAreaName(registrationFormDto.getAreaName());
        registrationForm.setRefreshmentItem(registrationFormDto.getRefreshmentItem());
        registrationForm.setRefreshmentQuantity(registrationFormDto.getRefreshmentQuantity());
        registrationForm.setHMode(registrationFormDto.getHMode());
        registrationForm.setState(registrationFormDto.getState());
        registrationForm.setDistrict(registrationFormDto.getDistrict());
        return registrationForm;
    }

}
