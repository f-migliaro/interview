package com.partnertap.interview.model;

import lombok.Builder;
import lombok.Value;

import java.math.BigDecimal;

@Value
@Builder
public class Item {
    Long internalId;
    String publicId;
    BigDecimal price;
    String description;
    int quantity;
}
