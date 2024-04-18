package lk.ijse.gdse66.springbootwithbasicauth.service;

import lk.ijse.gdse66.springbootwithbasicauth.dto.CustomerDTO;
import java.util.List;

/**
 * @author : L.H.J
 * @File: CustomerService
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-04-04, Thursday
 **/
public interface CustomerService {
    List<CustomerDTO> getAllCustomers();
    CustomerDTO getCustomer(String id);
    CustomerDTO saveCustomer(CustomerDTO dto);
    void deleteCustomer(String id);
    void updateCustomer(CustomerDTO dto);

}
