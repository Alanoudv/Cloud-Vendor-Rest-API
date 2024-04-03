package com.project.CloudVendorAPI.service;

import com.project.CloudVendorAPI.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String CloudVendorId);
    public CloudVendor getCloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();

}

// WE ARE HERE JUST PREPARE IT TO CALL IT IN THE SERVICE IMPLEMENT
