package com.example.restdemo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restdemo.Model.CloudVendor;
import com.example.restdemo.Service.CloudVendorService;

@RestController
@RequestMapping("/Cloud_Vendor")
public class CloudVendorAPI {
    CloudVendorService cloudVendorService;

    
    public CloudVendorAPI(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }



    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId")String vendorId){

        return cloudVendorService.getCloudVendor(vendorId);
        
    }
    @GetMapping()
    public List<CloudVendor> getCloudVendorDetails(){

        return cloudVendorService.getAllCloudVendor();
        
    }
    

        
    
    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.createCloudVendor(cloudVendor);
        return "cloud Vendor Details Created SucessFully";
        
    }
    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "cloud vendor Details Updated SucessFully";
    }
    @DeleteMapping("{vendorId}")
    public String DeleteCloudVendorDetails(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
        return "cloud vendor Detail deleted sucessfully";
        
    }
}
