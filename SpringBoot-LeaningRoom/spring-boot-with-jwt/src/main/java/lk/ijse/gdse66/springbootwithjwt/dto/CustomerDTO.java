package lk.ijse.gdse66.springbootwithjwt.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : L.H.J
 * @File: CustomerDTO
 * @mailto : lharshana2002@gmail.com
 * @created : 2024-04-04, Thursday
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private String id;
    private String name;
    private String address;
    private double salary;

}
