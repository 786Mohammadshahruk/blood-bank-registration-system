package com.sthumbh.bloodbankregistrationsystem.repository;

import com.sthumbh.bloodbankregistrationsystem.entity.RegistrationForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrationFormRepository extends JpaRepository<RegistrationForm, Long> {
}
