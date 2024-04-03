package com.project.CloudVendorAPI.repository;

import com.project.CloudVendorAPI.CloudVendorRepository;
import com.project.CloudVendorAPI.model.CloudVendor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class CloudVendorRepositoryTest {
    // we just did the repository because this is new to jpa the other function well handled by jpa because it is not new and its already built in
//test cases for repository :
    @Autowired
    private CloudVendorRepository cloudVendorRepository;
    CloudVendor cloudVendor;

    // generate Setup method
    @BeforeEach
    void setUp() {
        cloudVendor = new CloudVendor("1", "Amazon"
                , "usa", "xxx");
        cloudVendorRepository.save(cloudVendor);

    }

    // generateteardown method(for  a class after execution it should clear off this do it
    @AfterEach
    void tearDown() {
        cloudVendor = null;
        cloudVendorRepository.deleteAll();
    }

    // we will do :1-test cases success
    @Test
    void testFindByVendorName_Found() {
        List<CloudVendor> cloudVendorList = cloudVendorRepository.findByVendorName("Amazon");
        assertThat(cloudVendorList.get(0).getVendorId()).isEqualTo(cloudVendor.getVendorId());
        assertThat(cloudVendorList.get(0).getVendorAdress()).isEqualTo(cloudVendor.getVendorAdress());

    }

    // + 2-test cases failure
    @Test
    void testFindByVendorName_NotFound() {
        List<CloudVendor> cloudVendorList = cloudVendorRepository.findByVendorName("GCP");
        assertThat(cloudVendorList.isEmpty()).isTrue();
    }
}



  //IMPOOOOORTAANT

//in order to understand any unit testing: 1-something provided or given
//2-when there is some execution 3- there will be some answers or output will be generating

// SOO ; GIVEN - WHEN - THEN

//i think it gives tesy failed because i didnt do h2database in dependancy