package com.partnertap.interview.model;

import com.partnertap.interview.dto.Item;
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
    List<Item> items;
}
