package com.sthumbh.bloodbankregistrationsystem.repository;

import com.sthumbh.bloodbankregistrationsystem.dto.BloodBankDetailsResponseDto;
import com.sthumbh.bloodbankregistrationsystem.entity.RegistrationForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationFormRepository extends JpaRepository<RegistrationForm, Long> {
    @Query(value = "select new com.sthumbh.bloodbankregistrationsystem.dto.BloodBankDetailsResponseDto(s.bldBankName,s.hospType) from RegistrationForm s where stateCode =:stateCode and districtList =:districtCode")
    public List<BloodBankDetailsResponseDto> getBloodBankDetails(@Param("stateCode") String stateCode, @Param("districtCode") Long districtCode);
}
