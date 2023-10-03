package com.sthumbh.bloodbankregistrationsystem.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegistrationFormDto {


    private Long stateCode;

    private Long districtList;

    private String hospCity;

    @NotEmpty(message = "bldBankName can not be null or empty")
    private String bldBankName;

    private String parentHospName;

    private String hospShortName;

    private String hospType;

    private String contactPerson;

    private String hospEmail;

    private String hospContact;

    private String hospFax;

    private String licenceNo;


    private String licenceFromDate;

    private String licenceToDate;

    private String componentFacility;

    private String apheresisFacility;

    private String helplineNo;

    private String hospAdd1;

    private String hospAdd2;

    private String pinCode;

    private String hospLatitude;

    private String hospLongitude;

    private String hospWebsite;

    private String noOfBed;

    private String donorType;

    private String donationType;

    private String componentType;

    private String bagType;

    private String ttiType;

    private String chargeName;

    private String chargeRs;

    private String areaNameDetails;

    private String areaUsability;

    private String roomNo;

    private String storageName;

    private String storageType;

    private String areaName;

    private String refreshmentItem;

    private String refreshmentQuantity;

    private String hMode;

    private String state;

    private String district;
}
