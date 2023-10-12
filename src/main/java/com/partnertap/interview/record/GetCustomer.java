package com.partnertap.interview.record;

import java.util.List;

public record GetCustomer(Long customerPublicId, String firstName, String lastName, List<Item> items) {

}
