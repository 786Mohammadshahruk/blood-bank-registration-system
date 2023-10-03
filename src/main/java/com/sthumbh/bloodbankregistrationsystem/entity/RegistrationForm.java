package com.sthumbh.bloodbankregistrationsystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "registration_form")
@AllArgsConstructor
@NoArgsConstructor
public class RegistrationForm {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "state_code")
    private Long stateCode;
    @Column(name = "district_list")
    private Long districtList;
    @Column(name = "hosp_city")
    private String hospCity;
    @Column(name = "bld_bank_name")
    private String bldBankName;
    @Column(name = "parent_hosp_name")
    private String parentHospName;
    @Column(name = "hosp_short_name")
    private String hospShortName;

    @Column(name = "hosp_type")
    private String hospType;
    @Column(name = "contact_person")
    private String contactPerson;
    @Column(name = "hosp_email")
    private String hospEmail;
    @Column(name = "hosp_contact")
    private String hospContact;
    @Column(name = "hosp_fax")
    private String hospFax;
    @Column(name = "licence_no")
    private String licenceNo;
    @Column(name = "licence_from_date")
    private String licenceFromDate;
    @Column(name = "licence_to_Date")
    private String licenceToDate;
    @Column(name = "component_facility")
    private String componentFacility;
    @Column(name = "apheresis_facility")
    private String apheresisFacility;
    @Column(name = "helpline_no")
    private String helplineNo;
    @Column(name = "hosp_add1")
    private String hospAdd1;
    @Column(name = "hosp_add2")
    private String hospAdd2;
    @Column(name = "pin_code")
    private String pinCode;
    @Column(name = "hosp_latitude")
    private String hospLatitude;
    @Column(name = "hosp_longitude")
    private String hospLongitude;
    @Column(name = "hosp_website")
    private String hospWebsite;
    @Column(name = "no_of_bed")
    private String noOfBed;
    @Column(name = "donor_type")
    private String donorType;
    @Column(name = "donation_type")
    private String donationType;
    @Column(name = "component_type")
    private String componentType;
    @Column(name = "bag_type")
    private String bagType;
    @Column(name = "tti_type")
    private String ttiType;
    @Column(name = "charge_name")
    private String chargeName;
    @Column(name = "charge_rs")
    private String chargeRs;
    @Column(name = "area_name_details")
    private String areaNameDetails;
    @Column(name = "area_usability")
    private String areaUsability;
    @Column(name = "room_no")
    private String roomNo;
    @Column(name = "storage_name")
    private String storageName;
    @Column(name = "storage_type")
    private String storageType;
    @Column(name = "area_name")
    private String areaName;
    @Column(name = "refreshment_item")
    private String refreshmentItem;
    @Column(name = "refreshment_quantity")
    private String refreshmentQuantity;
    @Column(name = "h_mode")
    private String hMode;
    @Column(name = "state")
    private String state;
    @Column(name = "district")
    private String district;

}
