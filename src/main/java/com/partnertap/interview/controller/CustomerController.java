package com.partnertap.interview.controller;

import com.partnertap.interview.dto.ItemDto;
import com.partnertap.interview.dto.UpdateCustomerDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    // Complete with the corresponding HTTP request mapping.
    // Both price & customerPublicId are mandatory parameters in the request.
    public List<ItemDto> getCustomerItemsWithPriceGreaterThan(String customerPublicId, BigDecimal price) {
        // Complete with the method's body and a proper return value and status code.
        return null;
    }

    // Complete with the corresponding HTTP request mapping.
    public Long createCustomer() {
        // Complete with the method's body and a proper return value and status code.
        return null;
    }

    // Complete with the corresponding HTTP request mapping.
    public void updateCustomer(UpdateCustomerDto updateCustomerDto) {
        // Complete with the method's body and the corresponding response status code.
    }
}
