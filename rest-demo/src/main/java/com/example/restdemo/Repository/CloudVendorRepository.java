package com.example.restdemo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.restdemo.Model.CloudVendor;

public interface CloudVendorRepository extends JpaRepository<CloudVendor,String>{

    
} 
