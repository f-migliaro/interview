package com.partnertap.interview.dto;

import lombok.Value;

import java.util.List;

@Value
public class CustomerDto {
    Long customerPublicId;
    String firstName;
    String lastName;
    List<Item> items;
}
