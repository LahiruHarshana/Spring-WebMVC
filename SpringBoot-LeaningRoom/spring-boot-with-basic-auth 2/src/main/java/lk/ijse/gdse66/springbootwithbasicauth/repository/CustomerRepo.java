package lk.ijse.gdse66.springbootwithbasicauth.repository;

import lk.ijse.gdse66.springbootwithbasicauth.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : L.H.J
 * @File: CustomerRepo
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-04-04, Thursday
 **/
public interface CustomerRepo extends JpaRepository<CustomerEntity,String> {
}
