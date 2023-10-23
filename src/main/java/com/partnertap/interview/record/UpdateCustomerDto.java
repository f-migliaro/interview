package com.partnertap.interview.record;

import java.util.List;

public record UpdateCustomerDto(String firstName, String lastName, List<ItemDto> itemDtos) {

}
