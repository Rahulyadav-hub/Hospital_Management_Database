package com.mindtree.doctor;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mindtree.doctor.controller.DoctorController;

@SpringBootTest
class DoctorServiceApplicationTests {
	
	@Autowired
	DoctorController doctorcontroller;

	@Test
	void list() {
		assertThat(doctorcontroller.findAllDoctors()).isNotEmpty();
	}

}
