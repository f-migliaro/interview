package com.partnertap.interview.model;

import lombok.Builder;

@Builder
public record Item(Long internalId, String publicId, double price, String description, int quantity) {

}
