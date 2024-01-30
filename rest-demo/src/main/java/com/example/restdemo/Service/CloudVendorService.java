package com.example.restdemo.Service;

import java.util.List;

import com.example.restdemo.Model.CloudVendor;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor CloudVendor);
    public String updateCloudVendor(CloudVendor CloudVendor);
    public String deleteCloudVendor(String CloudVendorID);
    public CloudVendor getCloudVendor(String CloudVendorID);
    public List<CloudVendor>getCloudVendor();
    public List<CloudVendor>getCloudVendors();
    public List<CloudVendor> getAllCloudVendor();

}
