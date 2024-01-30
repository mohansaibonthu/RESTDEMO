package com.example.restdemo.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restdemo.Model.CloudVendor;
import com.example.restdemo.Repository.CloudVendorRepository;
import com.example.restdemo.Service.CloudVendorService;

@Service
public class CloudVendorImpl implements CloudVendorService {
    CloudVendorRepository cloudVendorRepository;
public CloudVendorImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }


    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
    }
    

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "Success";
        
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "sucess";
        
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        
        
        return cloudVendorRepository.findById(cloudVendorId).get();
        
    }

    @Override
    public List<CloudVendor> getCloudVendors() {
        return cloudVendorRepository.findAll();
        
    }


    @Override
    public List<CloudVendor> getAllCloudVendor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllCloudVendor'");
    }


    @Override
    public List<CloudVendor> getCloudVendor() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCloudVendor'");
    }

}