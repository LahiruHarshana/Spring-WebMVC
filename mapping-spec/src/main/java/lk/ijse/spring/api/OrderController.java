package lk.ijse.spring.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : L.H
 * @date : 2024-03-14
 * @since : 0.1.0
 **/

@RestController
@RequestMapping("/order")
public class OrderController {

        @GetMapping
        public String getOrders(@RequestHeader("Token") String token){
            return token;
        }

}
