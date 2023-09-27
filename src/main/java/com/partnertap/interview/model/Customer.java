package com.partnertap.interview.model;

import lombok.Builder;
import lombok.Value;

import java.util.List;

@Value
@Builder
public class Customer {

    Long internalId;
    String publicId;
    String firstName;
    String lastName;
    String phone;
    String category;
    List<Item> items;
}
