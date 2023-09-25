package com.partnertap.interview.dto;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class Item {
    String publicId;
    BigDecimal price;
    String description;
    int quantity;
}
