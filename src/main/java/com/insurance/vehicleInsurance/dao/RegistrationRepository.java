package com.insurance.vehicleInsurance.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.insurance.vehicleInsurance.entity.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer>{

}
