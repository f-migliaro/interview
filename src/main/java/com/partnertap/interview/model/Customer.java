package com.partnertap.interview.model;

import lombok.Builder;

import java.util.List;

@Builder
public record Customer(Long internalId, String publicId, String firstName, String lastName, String phone, String category, List<Item> items) {

}
