package com.example.hellospringboot.service;

import com.example.hellospringboot.dto.CustomerDTO;

import java.util.List;

/**
 * @author : L.H.J
 * @File: CustomerService
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-04-18, Thursday
 **/
public interface CustomerService {
    List<CustomerDTO> getAllCustomers();
    CustomerDTO getCustomer(String id);
    CustomerDTO saveCustomer(CustomerDTO dto);
    void deleteCustomer(String id);
    void updateCustomer(CustomerDTO dto);

}
