package lk.ijse.spring.api;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author : L.H
 * @date : 2024-03-07
 * @since : 0.1.0
 **/

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @PostMapping(produces = "application/json")
    public String saveCustomer(@RequestBody CustomerDTO customer){
        return "Customer Saved" + customer.toString();

    }

//    @GetMapping(produces = "application/json")
//    public CustomerDTO getCustomer(){
//        return new CustomerDTO("C001","Lakith","Galle");
//    }

    @GetMapping(produces = "application/json")
    public ArrayList<CustomerDTO> getAllCustomers(){
        ArrayList<CustomerDTO> customerDTOS = new ArrayList<>();
        customerDTOS.add(new CustomerDTO("C001","Lakith","Galle"));
        customerDTOS.add(new CustomerDTO("C002","Kamal","Matara"));
        customerDTOS.add(new CustomerDTO("C003","Nimal","Colombo"));
        return customerDTOS;
    }

}
