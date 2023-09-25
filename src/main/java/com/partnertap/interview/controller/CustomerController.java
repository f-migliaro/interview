package com.partnertap.interview.controller;

import com.partnertap.interview.dto.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping(value = "") // TODO
    public List<Item> getCustomerItems(String customerPublicId) {
        // TODO
    }
}
