package com.riwi.springboot_filter_teams.infrastructure.abstract_services;

import com.riwi.springboot_filter_teams.api.dto.request.ItemRequest;
import com.riwi.springboot_filter_teams.api.dto.response.ItemResponse;
import com.riwi.springboot_filter_teams.infrastructure.abstract_services.basic_abstract_services.IBasicCrudService;

public interface IItemService extends IBasicCrudService<ItemRequest, ItemResponse, ItemResponse, Long> {

}
