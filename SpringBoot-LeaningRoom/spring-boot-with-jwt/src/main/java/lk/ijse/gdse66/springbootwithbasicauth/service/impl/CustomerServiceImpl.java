package lk.ijse.gdse66.springbootwithbasicauth.service.impl;

import lk.ijse.gdse66.springbootwithbasicauth.dto.CustomerDTO;
import lk.ijse.gdse66.springbootwithbasicauth.entity.CustomerEntity;
import lk.ijse.gdse66.springbootwithbasicauth.service.CustomerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import lk.ijse.gdse66.springbootwithbasicauth.repository.CustomerRepo;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : L.H.J
 * @File: CustomerServiceImpl
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-04-04, Thursday
 **/
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    private CustomerRepo customerRepo;
    private ModelMapper modelMapper;

    public CustomerServiceImpl(CustomerRepo customerRepo, ModelMapper modelMapper) {
        this.customerRepo = customerRepo;
        this.modelMapper = modelMapper;
    }
    @Override
    public List<CustomerDTO> getAllCustomers() {
        return customerRepo.findAll().stream()
                .map(customerEntity -> modelMapper.map(customerEntity, CustomerDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public CustomerDTO getCustomer(String id) {
        CustomerEntity customerEntity = customerRepo.findById(id).orElse(null);
        if (customerEntity != null) {
            return modelMapper.map(customerEntity, CustomerDTO.class);
        }
        return null;
    }
    @Override
    public CustomerDTO saveCustomer(CustomerDTO dto) {
        return modelMapper.map(customerRepo.save(modelMapper.map(dto, CustomerEntity.class)), CustomerDTO.class);
    }

    @Override
    public void deleteCustomer(String id) {
        customerRepo.deleteById(id);
    }
    @Override
    public void updateCustomer(CustomerDTO dto) {
        CustomerEntity existingCustomer = customerRepo.findById(dto.getId()).orElse(null);
        if (existingCustomer != null) {
            existingCustomer.setName(dto.getName());
            existingCustomer.setAddress(dto.getAddress());
            existingCustomer.setSalary(dto.getSalary());
            customerRepo.save(existingCustomer);
        }
    }
}
