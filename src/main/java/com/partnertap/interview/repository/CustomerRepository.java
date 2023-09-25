package com.partnertap.interview.repository;

import com.partnertap.interview.dto.Item;
import com.partnertap.interview.model.Customer;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Repository
public class CustomerRepository {

    public List<Customer> findCustomers(String customerPublicId) {
        Item item1 = new Item(UUID.randomUUID().toString(), BigDecimal.ONE, "Tooth paste", 2);
        Item item2 = new Item(UUID.randomUUID().toString(), BigDecimal.ONE, "Soap", 1);

        List<Item> items = List.of(item1, item2);

        Customer customer1 = Customer.builder()
            .internalId(1L)
            .publicId(UUID.randomUUID().toString())
            .firstName("Marty")
            .lastName("Mc Fly")
            .phone("(555) 555-5555")
            .items(items)
            .build();

        Customer customer2 = Customer.builder()
            .internalId(1L)
            .publicId(UUID.randomUUID().toString())
            .firstName("Doc")
            .lastName("Brown")
            .phone("(555) 555-1111")
            .items(items)
            .build();

        return List.of(customer1, customer2);
    }
}
