package lk.ijse.gdse66.springbootwithbasicauth.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : L.H.J
 * @File: Customer
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-04-04, Thursday
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer")
public class CustomerEntity {
    @Id
    private String id;
    private String name;
    private String address;
    private double salary;
}
