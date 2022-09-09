package com.mindtree.patient;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mindtree.patient.controller.PatientController;

@SpringBootTest
class PatientServiceApplicationTests {
	
	@Autowired
	PatientController patientcontroller;

	@Test
	void list() {
		assertThat(patientcontroller.findAllPatients()).isNotEmpty();

	
	}

}
