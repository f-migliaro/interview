package com.partnertap.interview.dto;

import lombok.Value;

import java.io.Serializable;
import java.util.List;

@Value
public class GetCustomerDto implements Serializable {
    Long customerPublicId;
    String firstName;
    String lastName;
    List<ItemDto> items;
}
