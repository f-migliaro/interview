package com.partnertap.interview.record;

import java.util.List;

public record UpdateCustomer(String firstName, String lastName, List<Item> items) {

}
