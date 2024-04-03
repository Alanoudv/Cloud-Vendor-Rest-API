package com.project.CloudVendorAPI.service.impl;

import com.project.CloudVendorAPI.exception.CloudVendorNotFoundException;
import com.project.CloudVendorAPI.model.CloudVendor;
import com.project.CloudVendorAPI.CloudVendorRepository;
import com.project.CloudVendorAPI.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// ANY INTERFACE WE CALL IT SHOULD COME BEFORE IT IMPLEMENTS
public class CloudVendorServiceImpl implements CloudVendorService {

    // MAKE THE REPOSITORY LAYER INTERACT WITH THE SERVICE LAYER:
    CloudVendorRepository cloudVendorRepository;
    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }
    // THE DATA WILL BE SAVED OR UPDATE OR ETC IN DATABASE WITH THE HELP OF REPOSITORY LAYER
    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "SUCCESS";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "SUCCESS";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "SUCCESS";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        //the service layer handle all the business logic
        //and why we will write for the exception here exactly?
        // //because we want to show a better message in the postman when we use GET
        if(cloudVendorRepository.findById(cloudVendorId).isEmpty())
            throw new CloudVendorNotFoundException("Requested Cloud Vendor Does Not Exist !");

        return cloudVendorRepository.findById(cloudVendorId).get();
        //^^^^^^^^ this is always with the service layer with or without the exception
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }
}

