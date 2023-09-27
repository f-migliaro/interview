package com.partnertap.interview.repository;

import com.partnertap.interview.model.Customer;
import com.partnertap.interview.model.Item;
import lombok.val;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public class CustomerRepository {

    public Customer findCustomerByPublicId(String customerPublicId) {
        val item1 = Item.builder()
            .publicId(UUID.randomUUID().toString())
            .price(BigDecimal.ONE)
            .description("Toothpaste")
            .quantity(2)
            .build();

        val item2 = Item.builder()
            .publicId(UUID.randomUUID().toString())
            .price(BigDecimal.TEN)
            .description("Soap")
            .quantity(1)
            .build();

        List<Item> items = List.of(item1, item2);

        return Customer.builder()
            .internalId(1L)
            .publicId(UUID.randomUUID().toString())
            .firstName("Marty")
            .lastName("Mc Fly")
            .phone("(555) 555-5555")
            .category("VIP")
            .items(items)
            .build();
    }
}
