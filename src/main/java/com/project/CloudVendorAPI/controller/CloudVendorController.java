package com.project.CloudVendorAPI.controller;
import com.project.CloudVendorAPI.model.CloudVendor;
import com.project.CloudVendorAPI.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")

public class CloudVendorController
{
    //WE DELETE (CloudVendor cloudVendor );AND REPLACE IT WITH THIS
    // BECAUSE WE WILL ADD SERVICE LAYER HERE AFTER FINALLY BUILDING IT BECAUSE THE SERVICE LAYER INTERACT WITH THE CONTROLLER LAYER
    CloudVendorService cloudvendorService;
    public CloudVendorController(CloudVendorService cloudvendorService) {
        this.cloudvendorService = cloudvendorService;
    }

    // GET MAPPING OR GET API ; expecting vendor id
    //this is for read a specific cloud vendord etails
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String VendorId)
    {
        //WE USE (getCloudVendor) THAT BELONGS TO THE SERVICE LAYER , JUST TO CONNECT LAYER
        // IT WAS BEFORE LIKE THIS(return cloudVendor ;) BUT AFTER CREATING THE SERVICE LAYER WE DONT NEED IT(all the down are the same)
        return cloudvendorService.getCloudVendor(VendorId);
    }

    //read ALL cloud vendors details
    @GetMapping()
    public List<CloudVendor> getALLCloudVendorDetails()
    {
        return cloudvendorService.getAllCloudVendors();
    }


    //the object cloudVendor will be receiving in the post request as a request BODY
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        // remove (this.cloudVendor=cloudVendor;)
        cloudvendorService.createCloudVendor(cloudVendor);
        return "cloud vendor created successfully";
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        // remove (this.cloudVendor=cloudVendor;)
        cloudvendorService.updateCloudVendor(cloudVendor);

        return "cloud vendor updated successfully";
    }
    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId)
    {
        // delete this.cloudVendor=null;
        cloudvendorService.deleteCloudVendor(vendorId);
        return "cloud vendor deleted successfully";
    }
}

