package com.partnertap.interview.record;

import java.util.List;

public record GetCustomerDto(Long customerPublicId, String firstName, String lastName, List<ItemDto> itemDtos) {

}
