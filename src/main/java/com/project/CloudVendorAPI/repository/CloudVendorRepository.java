package com.project.CloudVendorAPI;

import com.project.CloudVendorAPI.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List ;
public interface CloudVendorRepository extends JpaRepository<CloudVendor , String> {
    //here we assuming that there is more than one vendor with the same name
    //so we will tell it like this so it will list all the vendor name with the same name with their details
    List<CloudVendor> findByVendorName(String VendorName);
}

// IF WE CALL THIS IN THE SERVICE IMPLEMENT IT WILL SAVE OR CREATE
// OR ETC... IN THE DATABASE BECAUSE THE REPOSITORY LAYER INTERACT DIRECTLY WITH DATABASE
